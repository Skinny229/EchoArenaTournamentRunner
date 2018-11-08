package Database;

import Main.Secrets;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionHandler {

    public static Connection getRemoteConnection() {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                String dbName = Secrets.DB_NAME;
                String userName = Secrets.DB_USERNAME;
                String password = Secrets.DB_PASSWORD;
                String hostname = Secrets.DB_HOSTNAME;
                String port = Secrets.DB_PORT;
                String jdbcUrl = "jdbc:mysql://" + hostname + ":" + port + "/" + dbName + "?user=" + userName + "&password=" + password;
                System.out.println("Getting remote connection with connection string from environment variables.");
                Connection con = DriverManager.getConnection(jdbcUrl);
                System.out.println("Remote connection successful.");
                return con;
            }
            catch (ClassNotFoundException e) { System.out.println(e.toString());}
            catch (SQLException e) { System.out.println(e.toString());}

        return null;
    }
}
