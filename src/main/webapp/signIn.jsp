<%--
  Created by IntelliJ IDEA.
  User: sasin
  Date: 4/13/2024
  Time: 2:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SignIn</title>
    <link rel="stylesheet" href="./css/style.css">
</head>
<body>
<div class="container">
    <form id="contact" action="log" method="post">
        <h3>SignIn Here</h3>
        <fieldset>
            <input placeholder="Your Email Address" type="email" name="email" tabindex="2" required>
        </fieldset>
        <fieldset>
            <input placeholder="*************" type="password" name="password" tabindex="3" required>
        </fieldset>
        <fieldset>
            <button name="submit" type="submit" id="contact-submit" data-submit="...Sending">SignIn</button>
        </fieldset>
        <fieldset>
            <a href="index.jsp">Don't you have an Account?</a>
        </fieldset>
    </form>
</div>
</body>
</html>
