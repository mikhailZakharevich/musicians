<%--
  Created by IntelliJ IDEA.
  User: Odyniuk
  Date: 13/04/2017
  Time: 13:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>New composition</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/composition" method="post">
    Название: <input id="name" name="name"> <br>
    Исполнитель: <input id="artist" name="artist"> <br>
    Продолжительность: <input id="duration" name="duration"> <br>
    Рейтинг: <input id="rating" name="rating"> <br>

    <button type="submit">Создать</button>
</form>
</body>
</html>
