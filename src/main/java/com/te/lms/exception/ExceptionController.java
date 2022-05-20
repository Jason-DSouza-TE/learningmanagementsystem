package com.te.lms.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.te.lms.response.ResponseBody;

@ControllerAdvice
public class ExceptionController {

	@ExceptionHandler(LmsException.class)
	public final ResponseEntity<ResponseBody> exception(LmsException lmsException) {
		ResponseBody responseBody = new ResponseBody();
		responseBody.setIsError(true);
		responseBody.setMessage(lmsException.getMessage());
		return new ResponseEntity<>(responseBody, HttpStatus.OK);
	}
}
