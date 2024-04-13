<%--
  Created by IntelliJ IDEA.
  User: sasin
  Date: 4/13/2024
  Time: 7:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
        <%

            if(session!=null && session.getAttribute("userEmail")!=null){

            }else {
                response.sendRedirect("signIn.jsp");
            }

        %>
    <jsp:include page="navbar.jsp"/>
</body>
</html>
