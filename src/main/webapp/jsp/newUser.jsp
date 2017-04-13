<%--
  Created by IntelliJ IDEA.
  User: Odyniuk
  Date: 13/04/2017
  Time: 18:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<html>
<head>
    <title>New user</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user" method="post">
    Имя: <input id="name" name="name"> <br>
    Возраст: <input id="age" name="age"> <br>

    <button type="submit">Создать</button>
</form>
</body>
</html>
