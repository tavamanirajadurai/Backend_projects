package com.example.user.service;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.example.user.Exception.ResourceNotFoundException;
import com.example.user.entity.UserActivityEntity;

public class UserActivityService 
{
	public List<UserActivityEntity> getData()
	{
		RestTemplate template = new RestTemplate();
		ResponseEntity<List<UserActivityEntity>> response = template.exchange("https://api.github.com/users/tavamanirajadurai/events", 
				HttpMethod.GET,
				null,
				new ParameterizedTypeReference<List<UserActivityEntity>>() {
				});
		if(response==null)
		{
			throw new ResourceNotFoundException();
		}
		List<UserActivityEntity> list = response.getBody();

		return list;
	}
}
