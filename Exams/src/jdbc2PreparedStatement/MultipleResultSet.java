package jdbc2PreparedStatement;

import java.sql.*;

public class MultipleResultSet {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/javaexams";
        String user = "root";
        String pass = "admin";

        Connection conn = DriverManager.getConnection(url,user,pass);

        Statement st=conn.createStatement();
        String query="Select* from Students where age> 20; Select * from Students where age<40";
        boolean res=st.execute(query);
        do{
            if(res){
                ResultSet rs=st.getResultSet();
                while(rs.next()){
                    System.out.print(rs.getInt("id"));
                    System.out.print(rs.getString("name"));
                    System.out.print(rs.getInt("age"));
                    System.out.print(rs.getString("address"));
                }
            }
            res = st.getMoreResults();
        }while(res);
    }
}
