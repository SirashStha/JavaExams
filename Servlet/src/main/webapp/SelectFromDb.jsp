<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Class.forName("com.mysql.jdbc.Driver");
    String url = "jdbc:mysql://localhost:3306/javaexams";
    String user = "root";
    String pass = "admin";
    Connection conn = DriverManager.getConnection(url,user,pass);

    String query = "SELECT * FROM mytable";

    Statement stmt = conn.createStatement();

    ResultSet rs = stmt.executeQuery(query);

    while(rs.next()) {
        int id = rs.getInt("id");
        String name = rs.getString("name");
        int age = rs.getInt("age");
        String address = rs.getString("address");
        out.println("Id: "+id+"\t Name: "+name+"\t Age: "+age+"\t Address: "+address);
    }

    stmt.close();
    conn.close();
%>


</body>
</html>
