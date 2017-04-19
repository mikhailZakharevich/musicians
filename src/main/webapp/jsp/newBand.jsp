<%--
  Created by IntelliJ IDEA.
  User: Odyniuk
  Date: 17/04/2017
  Time: 12:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>New band</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/band" method="post">
    Название: <input id="name" name="name"> <br>
    Жанр:<input id="genre" name="genre"> <br>

    <button type="submit">Создать</button>
</form>
</body>
</html>
