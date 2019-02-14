<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
Welcome <c:out value="${name}"/>
<table border="1">
   <tr>
     <th>insert</th>
     <th>update</th>
     <th>delete</th>
     <th>retrive</th>
     <th>show all records</th>
  </tr>
  <tr>
    <td><a href="http://localhost:8002/MyApp/InsertRecord.jsp">Insert Record</a></td>
    <td><a href="http://localhost:8002/MyApp/insert">update Record</a></td>
    <td><a href="http://localhost:8002/MyApp/insert">delete Record</a></td>
    <td><a href="http://localhost:8002/MyApp/insert">retrive Record</a></td>
    <td><a href="http://localhost:8002/MyApp/retrive">All Records</a></td>
  </tr>
</table>

<br>
<a href="http://localhost:8002/MyApp/logout">Logout</a> |  

</body>
</html>