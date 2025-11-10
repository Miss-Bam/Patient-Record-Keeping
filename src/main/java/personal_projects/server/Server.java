package personal_projects.server;

import personal_projects.persistance.DatabaseConnection;

public class Server {

    public static void main(String[] args){
        DatabaseConnection.databaseConnect();
    }
}
