<%--
  Created by IntelliJ IDEA.
  User: Odyniuk
  Date: 13/04/2017
  Time: 18:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }
    </style>
    <title>Users</title>
</head>
<body>
<table>
    <tr>
        <th>Имя</th>
        <th>Возраст</th>
        <th>Действия</th>
    </tr>
    <c:forEach items="${users}" var="user">
        <tr>
            <td>${user.name}</td>
            <td>${user.age}</td>
            <td>
                <ul>
                    <li><a href="${pageContext.request.contextPath}/user/${user.id}">Показать</a></li>
                    <li><a href="${pageContext.request.contextPath}/user/delete/${user.id}">Удалить</a></li>
                </ul>
            </td>
        </tr>
    </c:forEach>
</table>
<a href="${pageContext.request.contextPath}/user/new">Создать</a>
</body>
</html>
