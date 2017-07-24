<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="obj" class="calculations.Divide"></jsp:useBean>
<%

int num1 =Integer.parseInt(request.getParameter("num1"));
int num2 =Integer.parseInt(request.getParameter("num2"));

%>

<jsp:setProperty property="num1" name="obj" value= "<%= num1 %>"/>
<jsp:setProperty property="num2" name="obj" value= "<%= num2 %>" />

Result is <%= obj.divide() %>

</body>
</html>