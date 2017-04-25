<%--
  Created by IntelliJ IDEA.
  User: Odyniuk
  Date: 17/04/2017
  Time: 12:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<html>
<head>
    <title>New instrument</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/instrument" method="post">
    Название: <input id="name" name="name"> <br>
    <button type="submit">Создать</button>
</form>
</body>
</html>
