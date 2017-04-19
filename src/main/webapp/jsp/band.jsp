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
    <title>Band details</title>
</head>
<body>
Название: <label>${band.name}</label> <br>
Жанр: <label>${band.genre}</label> <br>
Учасники: <label>
    <c:forEach items="${band.artists}" var="artist">
        ${artist.name} ${artist.surname}<br>
    </c:forEach>
</label> <br>
</body>
</html>