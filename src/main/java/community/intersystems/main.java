package community.intersystems;

import com.intersystems.jdbc.IRISDriver;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class main {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        Class.forName ("com.intersystems.jdbc.IRISDriver").newInstance();
        String  url="jdbc:IRIS://127.0.0.1:1972/User";
        String  username = "_SYSTEM";
        String  password = "SYS";
        Connection dbconnection = DriverManager.getConnection(url, username, password);
        DatabaseMetaData meta = dbconnection.getMetaData();
        System.out.println();
        System.out.println("Successfully connected");
        System.out.println();
        System.out.println("\nDriver Information");
        System.out.println("Driver Name: "
                + meta.getDriverName());
        System.out.println("Driver Version: "
                + meta.getDriverVersion());
        System.out.println("\nDatabase Information ");
        System.out.println("Database Name: "
                + meta.getDatabaseProductName());
        System.out.println("Database Version: "+
                meta.getDatabaseProductVersion());
        dbconnection.close();
    }
}
