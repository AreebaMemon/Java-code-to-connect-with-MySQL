import java.sql.*;

public class database_code {
    public static void main(String[] args) throws SQLException {
        String user="root";
        String password="";

        // here database name is "mydatabase";
        String url="jdbc:mysql://localhost/mydatabase";
        String query="SELECT * from my_tabel";

        Connection c= DriverManager.getConnection(url,user,password);
    }
}
