<%@ page import="model.User" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<jsp:useBean id="user" class="model.User"/>
<html>
<head>
    <title>My Profile Page</title>
</head>
<body>

<h1>WHAT ARE WE DOING TODAY, <% out.print(((User) request.getSession().getAttribute("user")).getUserName()); %> ?</h1>

<form action="<%=request.getContextPath()%>/register-servlet" method="GET">
    <input type="submit" value="Delete user">
</form>

</body>
</html>
