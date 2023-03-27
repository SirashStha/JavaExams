package jdbc2PreparedStatement;

import java.sql.*;

public class ScrollableAndUpdatableResultSet {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/javaexams";
        String user = "root";
        String pass = "admin";

        Connection conn = DriverManager.getConnection(url,user,pass);

        Statement st=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
        ResultSet rs=st.executeQuery("Select* from mytable");
        rs.absolute(1);
        System.out.println(rs.getString("name"));
        rs.moveToInsertRow();
        rs.updateInt("id",3);
        rs.updateString("name","Yash");
        rs.updateInt("age",30);
        rs.insertRow();
        rs.absolute(2);
        System.out.println(rs.getString("name"));
        rs.updateString("address","Kalanki");
        rs.updateRow();
        st.close();
        conn.close();
    }

}
