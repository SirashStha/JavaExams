package jdbc2PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner sc = new Scanner(System.in);

        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/javaexams";
        String user = "root";
        String pass = "admin";

        Connection conn = DriverManager.getConnection(url,user,pass);

        //Prepared Statement
        System.out.print("Enter Id: ");
        int id = sc.nextInt();

        System.out.print("Enter name: ");
        String name = sc.next();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter address: ");
        String adr = sc.next();

        String query = "INSERT INTO STUDENTS VALUES(?,?,?,?)";
        PreparedStatement pstmt = conn.prepareStatement(query);

        pstmt.setInt(1,id);
        pstmt.setString(2,name);
        pstmt.setInt(3,age);
        pstmt.setString(4,adr);

        pstmt.executeUpdate();
    }
}
