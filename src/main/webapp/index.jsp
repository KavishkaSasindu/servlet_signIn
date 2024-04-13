<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>SignUp</title>
    <link rel="stylesheet" href="./css/style.css">

</head>
<body>
<div class="container">
    <form id="contact" action="register" method="post">
        <h3>SignUp Here</h3>
        <fieldset>
            <input placeholder="Your name" type="text" tabindex="1" name="name" required autofocus>
        </fieldset>
        <fieldset>
            <input placeholder="Your Email Address" type="email" name="email" tabindex="2" required>
        </fieldset>
        <fieldset>
            <input placeholder="*************" type="password" name="password" tabindex="3" required>
        </fieldset>
        <fieldset>
            <input placeholder="*************" type="password" name="password-1" tabindex="4" required>
        </fieldset>
        <fieldset>
            <button name="submit" type="submit" id="contact-submit" data-submit="...Sending">Submit</button>
        </fieldset>
        <fieldset>
            <a href="signIn.jsp">Already Have an Account?</a>
        </fieldset>
    </form>
</div>
</body>
</html>