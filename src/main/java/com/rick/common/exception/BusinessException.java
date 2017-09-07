package com.rick.common.exception;

/**
 * -------------------------------------------
 * Title : BusinessException 
 * Description : 自定义异常类
 * Create on : 2017年8月1日 上午9:55:10
 * Copyright (C) strongunion
 * @author RICK
 * @版本号: V1.0
 * -------------------------------------------
 */
public class BusinessException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public BusinessException() {
	}

	public BusinessException(String message) {
		super(message);
	}

	/**
	 * 获取错误信息
	 * @param e
	 * @param message
	 * @return
	 */
	public static String getMessage(Exception e,String message){
		String tempMessage = "";
		if(e instanceof BusinessException){
			tempMessage = e.getMessage();
		}
		if(!"".equals(tempMessage)){
			message = tempMessage;
		}
		return message;
	}
	

}
