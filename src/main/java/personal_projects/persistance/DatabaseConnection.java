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

    public static void createDatabase(Connection db_connection){

    }

    public static void patientInfoTable(Connection db_connection){
        try{
            Statement statement = db_connection.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS patients ("+
                    "id_number TEXT UNIQUE NOT NULL PRIMARY KEY,"+
                    "name TEXT NOT NULL,"+
                    "surname TEXT NOT NULL,"+
                    "cellnumber TEXT NOT NULL,"+
                    "next_of_kin_name TEXT NOT NULL,"+
                    "next_of_kin_cellnumber TEXT NOT NULL);");

        } catch (SQLException e) {
            System.out.println("Could not create PatientInfo table: "+e.getMessage());
        }
    }

    public static void doctorInfoTable(Connection db_connection){
        try{
            Statement statement = db_connection.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS doctors ("+
                    "hpcsa_reg_number TEXT UNIQUE NOT NULL PRIMARY KEY,"+
                    "practice_number TEXT UNIQUE NOT NULL ,"+
                    "name TEXT NOT NULL,"+
                    "surname TEXT NOT NULL,"+
                    "id_number TEXT UNIQUE NOT NULL,"+
                    "cellnumber TEXT NOT NULL);");

        } catch (SQLException e) {
            System.out.println("Could not create DoctorInfo table: "+e.getMessage());
        }
    }

    public static void healthRecordsTable(Connection db_connection){
        try{
            Statement statement = db_connection.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS records ("+
                    "id INTEGER PRIMARY KEY AUTOINCREMENT,"+
                    "date TEXT NOT NULL,"+
                    "hpcsa_registration TEXT NOT NULL,"+
                    "patient_id TEXT NOT NULL,"+
                    "patient_symptoms TEXT NOT NULL,"+
                    "doctor_observation TEXT NOT NULL,"+
                    "doctor_diagnosis TEXT NOT NULL,"+
                    "doctor_treatment_plan TEXT NOT NULL,"+
                    "FOREIGN KEY (hpcsa_registration) REFERENCES doctors(hpcsa_reg_number)," +
                    "FOREIGN KEY (patient_id) REFERENCES patients(id_number));");
        } catch (SQLException e) {
            System.out.println("Could not create HealthRecords table: "+e.getMessage());
        }
    }

}
