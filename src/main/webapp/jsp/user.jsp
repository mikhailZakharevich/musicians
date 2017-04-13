<%--
  Created by IntelliJ IDEA.
  User: Odyniuk
  Date: 13/04/2017
  Time: 19:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>User details</title>
</head>
<body>
Имя: <label>${user.name}</label> <br>
Возраст: <label>${user.age}</label> <br>
Плейлист: <label>
            <c:forEach items="${user.compositions}" var="composition">
                ${composition.artist} - ${composition.name}<br>
            </c:forEach>
          </label> <br>
</body>
</html>
