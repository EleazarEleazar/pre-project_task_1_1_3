package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

    public static final String URL = "jdbc:mysql://localhost:3306/shema_n1";
    public static final String USER = "root";
    public static final String PASSWORD = "root";

    public static Connection getConnection() {
        Connection сonnection = null;
        try {
            сonnection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("connection established");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("connection failed");
        }
        return сonnection;
    }
}

