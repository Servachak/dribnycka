<%--
  Created by IntelliJ IDEA.
  User: adavi
  Date: 24.09.2017
  Time: 23:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/css/registration.css" type="text/css">
    <link rel="stylesheet" href="/js/registration.js">
</head>
<body>
<center>
    <h2>Very simple login/registration form</h2>

    <div class="form">
    <form action="/registration" method="post">
        <h1>Welcome!</h1>
        <ul>
            <li>

                <img src="https://www.iconexperience.com/_img/g_collection_png/512x512/lock.png">
                Login <br />
                <div class="sub">
                    <p>Your Name: <input type="text" name="name" placeholder="Enter name" /></p>
                    <p>Password:  <input type="password"  name="password" placeholder="Enter password" /></p>

                    <input type="submit" value="Log me in!" />
                    <br/>

                </div>
            </li>
            or
            <li>
                <img src="http://www.eduplexus.com/uniexplora/images/icons/add-event-icon.png">
                Register
                <div class="sub">
                    <p>Name: <input type="text" name="name" placeholder="Enter name" /></p>
                    <p>Email: <input type="text"name="email" placeholder="Enter email" />
                    <p> Pass: <input type="password" name="pass" placeholder="Enter password" /></p>
                    <p>Phone: <input type="text" name="phoneNumber" placeholder="+380988888888" />
                        <br/>
                        <br />
                        <input type="submit" value="Join!" />
                </div>
            </li>
        </ul>
    </form>
    </div>
</center>
</body>
</html>
