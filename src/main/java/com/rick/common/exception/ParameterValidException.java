package com.rick.common.exception;

public class ParameterValidException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public ParameterValidException() {
		
	}

	public ParameterValidException(String message) {
		super(message);
	}

	public static String getMessage(Exception e, String message) {
		String tempMessage = "";
		if (e instanceof ParameterValidException) {
			tempMessage = e.getMessage();
		}
		if (!"".equals(tempMessage)) {
			message = tempMessage;
		}
		return message;
	}
}
