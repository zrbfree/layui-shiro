package com.rick.common.interceptor;

import com.rick.common.interceptor.handler.ParameterCheckHandler;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.validation.BindingResult;

@Aspect
public class ParameterValidationInterceptor {

	@Around("execution(* com.rick.apps.*Controller.*(..)) && args(..,bindingResult)")
    public Object doAround(ProceedingJoinPoint pjp, BindingResult bindingResult) throws Throwable {
        Object retVal;
        if (bindingResult.hasErrors()) {
        	ParameterCheckHandler.checkValid(bindingResult);
        }
        retVal = pjp.proceed();
        return retVal;
    }
}
