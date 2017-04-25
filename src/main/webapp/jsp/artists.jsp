<%--
  Created by IntelliJ IDEA.
  User: Odyniuk
  Date: 17/04/2017
  Time: 13:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
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
    <title>Artists</title>
</head>
<body>
<table>
    <tr>
        <th>Имя</th>
        <th>Фамилия</th>
        <th>Действия</th>
    </tr>
    <c:forEach items="${artists}" var="artist">
        <tr>
            <td>${artist.name}</td>
            <td>${artist.surname}</td>
            <td>
                <ul>
                    <li><a href="${pageContext.request.contextPath}/artist/${artist.id}">Показать</a> </li>
                    <li><a href="${pageContext.request.contextPath}/artist/delete/${artist.id}">Удалить</a></li>
                </ul>
            </td>
        </tr>
    </c:forEach>

</table>
<a href="${pageContext.request.contextPath}/artist/new">Создать</a>
</body>
</html>
