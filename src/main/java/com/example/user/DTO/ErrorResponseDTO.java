package com.example.user.DTO;

import java.time.LocalTime;

import org.springframework.http.HttpStatus;

public class ErrorResponseDTO {
public String apipath;
public HttpStatus status;
public String errormsg;
public LocalTime errortime;
public ErrorResponseDTO(String apipath, HttpStatus status, String errormsg, LocalTime errortime) {
	super();
	this.apipath = apipath;
	this.status = status;
	this.errormsg = errormsg;
	this.errortime = errortime;
}
}
