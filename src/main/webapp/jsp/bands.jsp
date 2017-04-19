<%--
  Created by IntelliJ IDEA.
  User: Odyniuk
  Date: 17/04/2017
  Time: 12:46
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
    <title>Bands</title>
</head>
<body>
<table>
    <tr>
        <th>Название</th>
        <th>Жанр</th>
        <th>Действия</th>
    </tr>
    <c:forEach items="${bands}" var="band">
        <tr>
            <td>${band.name}</td>
            <td>${band.genre}</td>
            <td>
                <ul>
                    <li><a href="${pageContext.request.contextPath}/band/${band.id}">Показать</a></li>
                    <li><a href="${pageContext.request.contextPath}/band/delete/${band.id}">Удалить</a></li>
                </ul>
            </td>
        </tr>
    </c:forEach>
</table>
<a href="${pageContext.request.contextPath}/band/new">Создать</a>
</body>
</html>

