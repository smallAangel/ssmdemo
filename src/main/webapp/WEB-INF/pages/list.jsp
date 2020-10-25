<%--
  Created by IntelliJ IDEA.
  User: 74980
  Date: 2020/10/24
  Time: 22:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <td>id</td>
        <td>Name</td>
        <td>pwd</td>
    </tr>
    <c:forEach items="${Users}" var="user">
        <tr>
            <td>${user.id }</td>
            <td>${user.name }</td>
            <td>${user.pwd}</td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
