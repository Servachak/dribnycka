<link rel="stylesheet" href="/css/header.css" type="text/css">
<%@ taglib prefix = "sec" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<div class="header">
    <a href="/"><H1>Dribnychka</H1></a>

   <div class="flex_container">
     <ul >
         <li class="flex_element">
             <div><form:form action="/login" method="post">
                 <ul>
                     <li style="text-align: right">
                         <div class="login">
                             <p>Your Name: <input type="text" name="name" placeholder="Enter name" /></p>
                             <p>Password:  <input type="password"  name="password" placeholder="Enter password" /></p>
                             <input type="submit" value="Log me in!" />
                         </div>
                     </li>
                 </ul>
             </form:form></div>
         </li>
         <li class="flex_element"><sec:authentication property="name"/></li>

         <sec:authorize access="hasRole('ROLE_ADMIN')">

        <li class="flex_element"><a href="/dress">dress</a></li>
        <li class="flex_element"><a href="/color">color</a></li>
         </sec:authorize>

         <sec:authorize access="isAuthenticated()">
         <li><a href="/profile">profile</a> </li>
         </sec:authorize>

         <sec:authorize access="!isAuthenticated()">
             <li class="flex_element"><a href="/registration">registration</a></li>
         </sec:authorize>

         <sec:authorize access="isAuthenticated()">
         <li>
             <form:form action="/logout" method="post">
             <input type="submit" value="Logout">
         </form:form>
         </li>
         </sec:authorize>
     </ul>
   </div>
</div>