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
		//doGet����ΪĬ�Ϸ���
		doPost(request, response);//����doPost����
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String method = request.getParameter("method");//��ȡ��ַ��method=���������
		
		switch(method){//ѡ����ת���
		case "add" :  add(request,response);//���÷���
		break;
	
		case "query" : query(request,response);//���÷���
		break;
		
		case "delete": delete(request,response);//���÷���
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
