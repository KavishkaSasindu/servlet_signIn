<%@ page import="java.util.List" %>
<%@ page import="model.UserModel" %>
<%@ page import="dao.UserDao" %><%--
  Created by IntelliJ IDEA.
  User: sasin
  Date: 4/13/2024
  Time: 10:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All Users</title>
    <link rel="stylesheet" href="./css/table.css">
</head>
<body>
    <jsp:include page="navbar.jsp"/>


    <div>
        <table>
            <thead>
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Email</th>
            </tr>
            </thead>
            <tbody>

            <%
                UserDao userDao = new UserDao();
                List<UserModel> user;
                user = userDao.getAllUsers();
                for(UserModel userData:user){

            %>
            <tr>
                <td data-column="First Name"><%=userData.getId()%></td>
                <td data-column="Last Name"><%=userData.getName()%></td>
                <td data-column="Job Title"><%=userData.getEmail()%></td>
            </tr>
    <%}%>
            </tbody>
        </table>
    </div>
</body>
</html>
