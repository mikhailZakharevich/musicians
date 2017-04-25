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
    <title>Artist details</title>
</head>
<body>
Имя: <label>${artist.name}</label> <br>
Фамилия: <label>${artist.surname}</label><br>
<c:if test="${artist.band ne null}">
    Группа: <label>${artist.band.name}</label><br>
</c:if>
<c:if test="${artist.instruments ne null}">
    Инструменты: <label>
        <c:forEach items="${artist.instruments}" var="instrument">
            ${instrument.name}
        </c:forEach>
    </label> <br>
</c:if>
</body>
</html>
