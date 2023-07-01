package com.selfproject.demo.advice;

import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.selfproject.demo.dto.response.CommonResponse;

@RestControllerAdvice
public class MemberControllerAdvice {
	
	Environment environment;
	@ExceptionHandler(Exception.class)
	public ResponseEntity<CommonResponse> exceptionHandler(Exception exception) {
		CommonResponse error = new CommonResponse();
		error.setMessage("Some Exception occured");
		error.setCode(((Integer)HttpStatus.INTERNAL_SERVER_ERROR.value()).toString());
		return new ResponseEntity<CommonResponse>(error, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
