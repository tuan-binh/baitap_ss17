<%--
  Created by IntelliJ IDEA.
  User: binh1
  Date: 8/14/2023
  Time: 8:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.example.rikkei.academy.service.CustomerService" %>
<%@ page import="com.example.rikkei.academy.service.CustomerServiceFactory" %>
<%@ page import="com.example.rikkei.academy.model.Customer" %>
<html>
<head>
	<title>Detail</title>
</head>
<body>
<h1>Customers details</h1>
<p>
	<a href="/customers">Back to customer list</a>
</p>
<table border="1px" style="color: crimson">
	<tr>
		<td>STT</td>
		<td>${requestScope["customer"].getId()}</td>
	</tr>
	<tr>
		<td>Name: </td>
		<td>${requestScope["customer"].getName()}</td>
	</tr>
	<tr>
		<td>Email: </td>
		<td>${requestScope["customer"].getEmail()}</td>
	</tr>
	<tr>
		<td>Address: </td>
		<td>${requestScope["customer"].getAddress()}</td>
	</tr>
</table>
</body>
</html>
