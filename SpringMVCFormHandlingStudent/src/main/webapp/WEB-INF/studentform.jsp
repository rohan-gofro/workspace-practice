<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Student Information</h2>
	<form:form method="POST" action="getstudent">
		<table>
			<tr>
			<td>
				<input type="text" name="name"/>
			<td>
			</tr>
			<tr>
			<td>
				<input type="text" name="age"/>
			<td>
			</tr>
			<tr>
			<td>
				<input type="text" name="address"/>
			<td>
			</tr>
			<tr>
			<td>
				<input type="submit" name="submit" value="submit"/>
			<td>
			</tr>
			
		</table>
	</form:form>

</body>
</html>