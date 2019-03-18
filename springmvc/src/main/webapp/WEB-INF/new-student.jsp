<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Spring MVC Application</title>
</head>
<body>
<h1>${heading}</h1>
<h1>Add a new student</h1>
<form:form action="/students/save" method="post">
    <label>First name: </label>
    <input type="text" name="firstName">
    <label>Last name: </label>
    <input type="text" name="lastName">
    <input type="submit" value="Add student">
</form:form>
</body>
</html>
