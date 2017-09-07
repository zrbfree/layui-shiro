package com.rick.common.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Enumeration;

/**
 * -------------------------------------------
 * Title : SqlInjectInterceptor 
 * Description : 防止sql注入拦截器
 * Create on : 2017年8月2日 下午2:43:39
 * Copyright (C) strongunion
 * @author RICK
 * @版本号: V1.0
 * -------------------------------------------
 */
public class SqlInjectInterceptor implements HandlerInterceptor{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		Enumeration<String> names = request.getParameterNames();
		while (names.hasMoreElements()) {
			String name = names.nextElement();
			String[] values = request.getParameterValues(name);
			for (String value : values) {
				value = clearXss(value);
			}
		}
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * TODO: 处理字符转义
	 * @Auhor: RICK
	 * @Date : 2017年8月2日
	 * @param value
	 * @return
	 */
	private String clearXss(String value) {
		if (value == null || "".equals(value)) {
			return value;
		}
		value = value.replaceAll("<", "<").replaceAll(">", ">");
		value = value.replaceAll("\\(", "(").replace("\\)", ")");
		value = value.replaceAll("'", "'");
		value = value.replaceAll("eval\\((.*)\\)", "");
		value = value.replaceAll("[\\\"\\\'][\\s]*javascript:(.*)[\\\"\\\']", "\"\"");
		value = value.replace("script", "");
		return value;
	}
}
