<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>Insert title here</title>
</head>
<body>
<!-- 第一个页面，测试多个请求对应一个Servlet的简单应用 -->
	<a href = "multipleServlet?method=add">add</a>
	<br><br>
	
	<a href = "multipleServlet?method=query">query</a>
	<br><br>
	
	<a href = "multipleServlet?method=delete">delete</a>
	
</body>
</html>