package jdbc1;

import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/javaexams";
        String user = "root";
        String pass = "admin";

        Connection conn = DriverManager.getConnection(url,user,pass);
        Statement stmt = conn.createStatement();

        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter Id: ");
//        int id = sc.nextInt();
//
//        System.out.print("Enter Name: ");
//        String name = sc.next();
//
//        System.out.print("Enter Age: ");
//        int age = sc.nextInt();
//
//        System.out.print("Enter Address: ");
//        String adr = sc.next();
//
//        String query = "INSERT INTO STUDENTS VALUES("+id+",'"+name+"',"+age+",'"+adr+"')";
//
//
////        stmt.executeUpdate(query);
//
//        try {
//            stmt.executeUpdate("DELETE FROM STUDENTS WHERE id = 2");
//        }
//        catch (Exception e) {
//            System.out.println("ID not found");
//        }

        String fetch = "SELECT * FROM STUDENTS";
        ResultSet rs = stmt.executeQuery(fetch);
        while(rs.next()) {
            System.out.println("ID: "+rs.getInt("id"));
            System.out.println("Name: "+rs.getString("name"));
            System.out.println("Age: "+rs.getInt("age"));
            System.out.println("Address: "+rs.getString("address"));
            System.out.println();
        }

        stmt.close();
        conn.close();
    }
}

