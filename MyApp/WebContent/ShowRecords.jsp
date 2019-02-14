<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Records</title>
</head>
<body>
<table  border="1">
	<tr>
		<th>Employee id</th>
		<th>Employee name</th> 
		<th>Employee salary</th>
	</tr>
	
		<%-- <th><c:out value="${al}"/></th> --%>
		<c:forEach items="${al}" var="all">
		<tr>
		<th><c:out value="${all.empId}"/></th>
		<th><c:out value="${all.name}"/></th>
		<th><c:out value="${all.sal}"/></th>
		</tr>
		</c:forEach> 

</table>

</body>
</html>