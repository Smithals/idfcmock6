<%@page import="dto.StudentDto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="content-Type" content="text/html" charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1px">
<tr>
<th>id</th>
<th>name</th>
<th>email</th>
</tr>
<%
StudentDto data=(StudentDto)request.getAttribute("key");
%>
<tr>
<td><%=data.getId() %></td>
<td><%=data.getName() %></td>
<td><%=data.getEmail() %></td>
</table>
</body>
</html>