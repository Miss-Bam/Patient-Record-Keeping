package personal_projects.persistance;

import java.sql.*;
import static java.sql.DriverManager.getConnection;

public class DatabaseConnection {

    public static void databaseConnect(){
        String db_url = "jdbc:sqlite:clinic.db";
        try{
            Connection db_connect = DriverManager.getConnection(db_url);
            System.out.println("Connection to Clinic Database successful");
        } catch (SQLException e) {
            System.out.println("Connection failed: "+e.getMessage());
        }
    }

}
