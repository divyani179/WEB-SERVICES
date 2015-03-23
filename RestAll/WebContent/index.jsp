<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%pageContext.setAttribute("username", "div"); %>
<form action="rest/adduser/addform/${username}" method="post">
NAME:<input type="text" name="name">
CITY:<input type="text" name="city">
<input type="submit" value="SUBMIT">
</form>
<p></p>
<a href="rest/adduser/addform/${username}">click here</a>
<p></p>

<form action="rest/adduser/addquery" method="get">
NAME:<input type="text" name="name">
CITY:<input type="text" name="city">
<input type="submit" value="SUBMIT">
</form>
</body>
</html>