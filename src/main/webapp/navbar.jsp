<%--
  Created by IntelliJ IDEA.
  User: sasin
  Date: 4/13/2024
  Time: 9:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
  <link rel="stylesheet" href="./css/nav.css">
</head>
<body>
  <div class="outer">
    <div class="inner">
      <div class="list">
        <div>
          <h2>Servlet App</h2>
        </div>
        <div>
          <ul>
            <li><a href="home.jsp">Home</a></li>
            <li><a href="displayAllUsers.jsp">All Users</a></li>
            <li>
              <form action="delete" method="post">
                <button>LogOut</button>
              </form>
            </li>
          </ul>
        </div>
      </div>
    </div>
  </div>
</body>
</html>
