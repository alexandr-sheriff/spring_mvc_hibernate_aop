<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: alex
  Date: 11.10.2021
  Time: 23:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employee Info</title>
</head>
<body>

<h2>Employee Info</h2>
<br>

<form:form action="save-employee" modelAttribute="employee">

    <form:hidden path="id"/>

    Name <form:input path="name"/>
    <br>
    Surname <form:input path="surname"/>
    <br>
    Department <form:input path="department"/>
    <br>
    Salary <form:input path="salary"/>
    <br>
    <input type="submit" value="OK">

</form:form>

</body>
</html>
