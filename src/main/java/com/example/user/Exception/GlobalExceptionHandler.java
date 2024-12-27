package com.example.user.Exception;

import java.time.LocalTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.user.DTO.ErrorResponseDTO;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorResponseDTO> handleGlobalException(Exception ex,WebRequest request)
	{
		ErrorResponseDTO error = new ErrorResponseDTO(request.getDescription(false),
				HttpStatus.INTERNAL_SERVER_ERROR,
				ex.getMessage(),
				LocalTime.now());
		return new ResponseEntity<ErrorResponseDTO>(error, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ErrorResponseDTO> handleResourceNotFoundException(Exception ex,WebRequest request)
	{
		ErrorResponseDTO error = new ErrorResponseDTO(request.getDescription(false),
				HttpStatus.NOT_FOUND,
				ex.getMessage(),
				LocalTime.now());
		return new ResponseEntity<ErrorResponseDTO>(error, HttpStatus.NOT_FOUND);
	}

}
