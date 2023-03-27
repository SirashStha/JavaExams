<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
    <h1>Login From Here </h1>
    <br/>
    <form action="hello-servlet" method="get">
        Id: <input type="text" name="id"><br/><br/>
        Name: <input type="text" name="name"><br/><br/>
        Age: <input type="text" name="age"><br/><br/>
        Address: <input type="text" name="address"><br/><br/>
        <input type="submit" value="Save">
    </form>
    <br/>
    <a href="Print.jsp">Print File</a><br/><br/>
    <a href="SelectFromDb.jsp">Db Items</a>
</body>
</html>