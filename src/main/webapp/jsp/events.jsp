<%--
  Created by IntelliJ IDEA.
  User: Jenja
  Date: 22.04.2017
  Time: 13:18
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
    <title>Events</title>
</head>
<body>
<table>
    <tr>
        <th>Имя</th>
        <th>Возраст</th>
        <th>Действия</th>
    </tr>
    <c:forEach items="${events}" var="event">
        <tr>
            <td>${event.name}</td>
            <td>${event.date}</td>
            <td>
                <ul>
                    <li><a href="${pageContext.request.contextPath}/event/${event.id}">Показать</a></li>
                    <li><a href="${pageContext.request.contextPath}/event/delete/${event.id}">Удалить</a></li>
                </ul>
            </td>
        </tr>
    </c:forEach>
</table>
<a href="${pageContext.request.contextPath}/event/new">Добавить событие</a>


</body>
</html>
