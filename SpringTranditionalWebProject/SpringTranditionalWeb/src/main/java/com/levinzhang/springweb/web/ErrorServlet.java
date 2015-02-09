package com.levinzhang.springweb.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ErrorServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5455736706070293202L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException,
			IOException {
		
		response.sendRedirect(request.getScheme()+"://"+request.getServerName()+":8081/"+request.getContextPath() +"");
	}
}
