<%--
  Created by IntelliJ IDEA.
  User: Odyniuk
  Date: 17/04/2017
  Time: 13:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>New artist</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/artist" method="post">
    Имя: <input id="name" name="name"> <br>
    Фамилия: <input id="surname" name="surname"> <br>
    <button type="submit">Создать</button>
</form>
</body>
</html>