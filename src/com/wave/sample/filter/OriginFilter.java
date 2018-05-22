package com.wave.sample.filter;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OriginFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("headers setting");
		HttpServletRequest req = (HttpServletRequest) request;
		System.out.println("in the filter:" + req.getMethod());
		Enumeration<String> iter = req.getHeaderNames();
		while (iter.hasMoreElements()) {
			String name = iter.nextElement();
			System.out.println("\treq header->" + name + ":" + req.getHeader(name));
		}
		HttpServletResponse res = (HttpServletResponse) response;
		res.setHeader("Access-Control-Allow-Origin", "*");
		res.setHeader("Access-Control-Allow-Headers", "origin, content-type, accept, authorization");
		res.setHeader("Access-Control-Allow-Credentials", "true");
		res.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD");

		System.out.println("method:" + req.getMethod());
		if (req.getMethod().equals("OPTIONS")) {
			res.setStatus(200);
			return;
		}
		chain.doFilter(request, response);
		Iterator<String> riter = res.getHeaderNames().iterator();
		while (riter.hasNext()) {
			String name = riter.next();
			System.out.println("\tres header->" + name + ":" + res.getHeader(name));
		}

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
