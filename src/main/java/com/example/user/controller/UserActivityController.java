package com.example.user.controller;

import java.util.List;

import javax.print.attribute.standard.Media;

import org.springframework.asm.TypeReference;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.user.DTO.ErrorResponseDTO;
import com.example.user.entity.UserActivityEntity;
import com.example.user.service.UserActivityService;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;


@Tag(name="GitHub User Activity", description = "GitHub User Actitvity API")
@RestController
@RequestMapping(path="/api/v1",produces=MediaType.APPLICATION_JSON_VALUE)

public class UserActivityController {
	
	@Operation(summary="Fetch API for GitHub User Activity",description="Rest API to fetch the GitHub User Activity")
	@ApiResponses({
		@ApiResponse(responseCode = "200",description ="Http Status OK " ),
		@ApiResponse(responseCode = "500",description = "Http Status internal server error",content = @Content(schema = @Schema(implementation=ErrorResponseDTO.class)))
	})
	@GetMapping("/getEvent")
	public ResponseEntity<List<UserActivityEntity>> getname()
	{
		UserActivityService service = new UserActivityService();
		return ResponseEntity.status(HttpStatus.OK).body(service.getData());
	}

}
