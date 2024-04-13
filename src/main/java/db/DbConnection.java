package db;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

    final String USERNAME = "root";
    final String PASSWORD = "mysql";
    final String URL = "jdbc:mysql://localhost/full_auth_project";

    Connection conn;

    public Connection getConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
        }catch(Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        return conn;
    }

}
