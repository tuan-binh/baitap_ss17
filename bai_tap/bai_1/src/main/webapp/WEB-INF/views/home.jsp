<%--
  Created by IntelliJ IDEA.
  User: binh1
  Date: 8/15/2023
  Time: 8:10 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>Title</title>
</head>
<body>
<form action="/run" method="post">
	<input type="text" name="number1"> <br>
	<select name="operator">
		<option value="+">+</option>
		<option value="-">-</option>
		<option value="*">*</option>
		<option value="/">/</option>
	</select> <br>
	<input type="text" name="number2"> <br>
	<button type="submit">RUN</button>
</form>
</body>
</html>
