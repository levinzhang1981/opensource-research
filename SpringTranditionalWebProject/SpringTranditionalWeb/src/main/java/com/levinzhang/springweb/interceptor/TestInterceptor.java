package com.levinzhang.springweb.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Service
public class TestInterceptor extends HandlerInterceptorAdapter {
@Override
public boolean preHandle(HttpServletRequest request,
		HttpServletResponse response, Object handler) throws Exception {

	System.out.println("TTTTTT");
	return super.preHandle(request, response, handler);
}
}
