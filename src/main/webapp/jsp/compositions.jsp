<%--
  Created by IntelliJ IDEA.
  User: Odyniuk
  Date: 13/04/2017
  Time: 12:42
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
    <title>Compositions</title>
    </head>
    <body>
    <table>
        <tr>
            <th>Название</th>
            <th>Исполнитель</th>
            <th>Продолжительность</th>
            <th>Рейтинг</th>
            <th>Действия</th>
        </tr>
        <c:forEach items="${compositions}" var="composition">
            <tr>
                <td>${composition.name}</td>
                <td>${composition.artist}</td>
                <td>${composition.duration}</td>
                <td>${composition.rating}</td>
                <td>
                    <ul>
                        <li><a href="${pageContext.request.contextPath}/composition/${composition.id}">Показать</a> </li>
                        <li><a href="${pageContext.request.contextPath}/composition/delete/${composition.id}">Удалить</a></li>
                    </ul>
                </td>
            </tr>
        </c:forEach>

    </table>
    <a href="${pageContext.request.contextPath}/composition/new">Создать</a>
    </body>
</html>
