package com.sparta.jdbc;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {
    private static Connection connection = null;
    public static String deleteSQL;
    public static Connection getConnection() throws IOException, SQLException {
        if(connection == null){
            // initialise the connection
            Properties props = new Properties();
            props.load(new FileReader("mysql.properties"));
            connection = DriverManager.getConnection(
                    props.getProperty("db.url"),
                    props.getProperty("db.userid"),
                    props.getProperty("db.password"));
            deleteSQL = props.getProperty("db.sql.delete");
        }
        return connection;
    }
    public static void closeConnection() throws SQLException {
        if(connection != null)
            connection.close();
    }
    // can't instantiate this class, ctor private
    private ConnectionFactory(){}
}
