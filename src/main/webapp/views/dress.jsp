<%--
  Created by IntelliJ IDEA.
  User: adavi
  Date: 29.09.2017
  Time: 23:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div style="text-align: center">
    <form action="/dress" method="post">
        <input type="text" name="dressName" placeholder="name">
        <br>
        <input type="text" name="dressColor" placeholder="color">
        <br>
        <input type="text" name="dressType" placeholder="type">
        <br>
        <input type="text" name="dressSex" placeholder="sex">
        <br>
        <input type="text" name="dressSize" placeholder="size">
        <br>
        <button>save</button>
    </form>
</div>
<ol>
<div style="text-align: center">
    <c:forEach var="dress" items="${listDress}">
       <li> ${dress.name} ${dress.color} ${dress.type} ${dress.sex} ${dress.size}
           <a href="/deleteDress/${dress.id}">delete</a> </li>
           <a href="/updateDress/${dress.id}">update</a> </li>
    </c:forEach>

</div>
</ol>

</body>
</html>
