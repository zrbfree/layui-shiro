package com.rick.common.interceptor;

import com.alibaba.dubbo.rpc.RpcException;
import com.alibaba.fastjson.JSON;
import com.rick.common.ResultJson;
import com.rick.common.exception.BusinessException;
import com.rick.common.exception.ParameterValidException;
import org.apache.commons.io.IOUtils;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * -------------------------------------------
 * Title : GlobalExceptionHandler 
 * Description : 全局异常处理类
 * Create on : 2017年8月1日 上午9:53:29
 * Copyright (C) strongunion
 * @author RICK
 * @版本号: V1.0
 * -------------------------------------------
 */
public class GlobalExceptionHandler implements HandlerExceptionResolver{

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {

		response.setContentType(MediaType.APPLICATION_JSON_UTF8_VALUE);
		String msg;
		 if( ex instanceof BusinessException){
	            msg = ex.getMessage();
	        } else if( ex instanceof ParameterValidException) {
	            msg = ex.getMessage();
	        } else if ( ex instanceof RpcException) {
	            msg = "远程服务调用失败！";
	        } else {
	            msg = "操作异常!";
	        }
	        ex.printStackTrace();
	        PrintWriter out = null;
	        try {
	            out = response.getWriter();
	            out.print(JSON.toJSON(ResultJson.buildFailInstance(msg)).toString());
	        } catch (Exception e) {

	        } finally {
	            IOUtils.closeQuietly(out);
	        }
	        return null;
	}

}
