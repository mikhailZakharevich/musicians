<%--
  Created by IntelliJ IDEA.
  User: Jenja
  Date: 22.04.2017
  Time: 13:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Event details</title>
</head>
<body>
Название: <label>${event.name}</label> <br>
Адрес: <label>${event.date}</label><br>
Площадка: <label>${event.area.name}</label> <br>
Количество мест: <label>${event.area.numOfPlaces}</label><br>
Адрес: <label>${event.area.address}</label><br>

</body>
</html>
