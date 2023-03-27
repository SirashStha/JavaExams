package jdbc2PreparedStatement;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class RowSet {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/javaexams";
        String user = "root";
        String pass = "admin";

        RowSetFactory rsf= RowSetProvider.newFactory();
        JdbcRowSet jrs=rsf.createJdbcRowSet();
        jrs.setUrl(url);
        jrs.setUsername(user);
        jrs.setPassword(pass);
        jrs.setCommand("Select* from mytable");
        jrs.execute();
        while(jrs.next()){
            System.out.println(jrs.getInt("id"));
            System.out.println(jrs.getString("name"));
            System.out.println(jrs.getInt("age"));
            System.out.println(jrs.getString("address"));
            System.out.println();
        }
    }
}
