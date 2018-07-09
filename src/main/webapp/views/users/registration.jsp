<%--
  Created by IntelliJ IDEA.
  User: adavi
  Date: 24.09.2017
  Time: 23:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<link rel="stylesheet" href="/css/registration.css" type="text/css">

<div>
    <form:form action="/registration" method="post">
        <ul style="text-align: center">>
            <li>
                Registration
                <div class="register"
                    <p>Name: <input type="text" name="name" placeholder="Enter name" /></p>
                    <p>Email: <input type="text"name="email" placeholder="Enter email" />
                    <p> Pass: <input type="password" name="pass" placeholder="Enter password" /></p>
                    <p>Phone: <input type="text" name="phoneNumber" placeholder="+380988888888" />
                    <br>
                    <input type="submit" value="Join!" />
                </div>
            </li>
        </ul>
    </form:form>


<ol>
    <div style="text-align: center">
        <c:forEach var="user" items="${listUser}">
            <li>${user.name} ${user.email} ${user.password} ${user.phoneNumber}
            <a href="deleteUser/${user.id}">delete</a>
            <a href="updateUser/${user.id}">update</a>
            </li>
        </c:forEach>
    </div>
</ol>
</div>