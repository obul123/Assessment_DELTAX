package com.ProjectK.ProjectDELTA.Exceptions;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
@ControllerAdvice
@RestController
public class HandleExceptions extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(UserNotFoundException.class)
	public final ResponseEntity<Object> handleUserNotException(UserNotFoundException ex, WebRequest request){
		
		ExceptionBody exceptio=new ExceptionBody(new Date()
										, ex.getMessage()
										, request.getDescription(false));
		
		return new ResponseEntity(exceptio,HttpStatus.NOT_FOUND);
	}

}
