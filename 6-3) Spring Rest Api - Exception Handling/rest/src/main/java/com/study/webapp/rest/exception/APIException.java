package com.study.webapp.rest.exception;

import lombok.Data;

@Data
public class APIException{
	private String message;
	private String documentationUrl;
}
