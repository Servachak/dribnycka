<%--
  Created by IntelliJ IDEA.
  User: adavi
  Date: 05.10.2017
  Time: 18:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div style="text-align: center">
    <form action="/updateDress/${currentDress.id}" method="post">
        <input type="text" name="dressName" value="${currentDress.name}" placeholder="name">
        <br>
        <input type="text" name="dressColor" value="${currentDress.color}" placeholder="color">
        <br>
        <input type="text" name="dressType" value="${currentDress.type}" placeholder="type">
        <br>
        <input type="text" name="dressSex" value="${currentDress.sex}" placeholder="sex">
        <br>
        <input type="text" name="dressSize" value="${currentDress.size}" placeholder="size">
        <br>
        <button>update</button>
    </form>
</div>

</body>
</html>
