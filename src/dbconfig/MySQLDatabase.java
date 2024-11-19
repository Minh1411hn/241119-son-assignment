package src.dbconfig;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLDatabase implements Database {
    private Connection conn;

    @Override
    public Connection connect() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_management", "root", "password");
            System.out.println("Connected to MySQL Database.");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    @Override
    public void disconnect() {
        try {
            if (conn != null) conn.close();
            System.out.println("Disconnected from MySQL Database.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
