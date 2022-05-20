package com.te.lms.exception;

public class LmsException extends RuntimeException{
private String msg;

@Override
public String getMessage() {
	return this.getMessage();
}

public LmsException(String message) {
	this.msg = message;
}



}
