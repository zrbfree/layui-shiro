package com.rick.common.interceptor;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * -------------------------------------------
 * Title : CrossDomainIntercepter 
 * Description : 设置可跨域访问
 * Create on : 2017年8月1日 上午10:03:00
 * Copyright (C) strongunion
 * @author RICK
 * @版本号: V1.0
 * -------------------------------------------
 */
public class CrossDomainIntercepter extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		response.addHeader("Access-Control-Allow-Origin", "*");
		response.addHeader("Access-Control-Allow-Methods", "GET, POST, DELETE, OPTIONS");
		response.addHeader("Access-Control-Allow-Headers", "Origin, No-Cache, X-Requested-With, If-Modified-Since, Pragma, Last-Modified, Cache-Control, Expires, Content-Type, X-E4M-With, X-Access-Token");
		return true;
	}
	
}

