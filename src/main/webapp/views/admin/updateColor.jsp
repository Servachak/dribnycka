<%--
  Created by IntelliJ IDEA.
  User: adavi
  Date: 20.10.2017
  Time: 23:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div style="text-align: center">
    <form action="/updateColor/${currentColor.id}"method="post">
        <input type="text", name="colorName", value="${currentColor.colorName}">
        <br>
        <button>update</button>
    </form>
</div>
