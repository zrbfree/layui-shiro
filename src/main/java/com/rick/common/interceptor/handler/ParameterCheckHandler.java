package com.rick.common.interceptor.handler;

import com.rick.common.exception.ParameterValidException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

import java.util.List;

public class ParameterCheckHandler {

	public static void checkValid(BindingResult result) throws Exception {
		String msg = "";
		if( result.hasErrors() ){
			List<ObjectError> allErrors = result.getAllErrors();
			for (ObjectError error : allErrors) {
				msg += error.getDefaultMessage() + "\n";
			}
			throw new ParameterValidException(msg);
		}
	}

}
