package com.isooou.multipleServlet_easy;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/multipleServlet")
public class MultipleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet（）为默认方法
		doPost(request, response);//调用doPost方法
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String method = request.getParameter("method");//获取网址中method=后面的内容
		
		switch(method){//选择跳转语句
		case "add" :  add(request,response);//调用方法
		break;
	
		case "query" : query(request,response);//调用方法
		break;
		
		case "delete": delete(request,response);//调用方法
		break;
		}
	}


	private void delete(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("delete");
		
	}


	private void query(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("query");
		
	}


	private void add(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("add");
		
	}

}
