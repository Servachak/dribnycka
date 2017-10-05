<%--
  Created by IntelliJ IDEA.
  User: adavi
  Date: 05.10.2017
  Time: 18:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/updateUser/${currentUser.id}" method="post">
    <div class="sub">
        <p>Name: <input type="text" name="name" value="${currentUser.name}" placeholder="Enter name" /></p>
        <p>Email: <input type="text"name="email" value="${currentUser.email}" placeholder="Enter email" /></p>
        <p> Pass: <input type="password" name="pass" value="${currentUser.password}" placeholder="Enter password" /></p>
        <p>Phone: <input type="text" name="phoneNumber" value="${currentUser.phoneNumber}" placeholder="+380988888888" /></p>
            <br/>
            <br />
            <input type="submit" value="Update!" />
    </div>
</form>

</body>
</html>
