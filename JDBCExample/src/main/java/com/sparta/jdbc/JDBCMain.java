package com.sparta.jdbc;

import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class JDBCMain {
    public static void main(String[] args) {
//        useStatement();
//        usePreparedStatement();
        insertPrepared();
    }

    private static void insertPrepared() {
        PreparedStatement preparedStatement = null;
        try {
            Connection connection = ConnectionFactory.getConnection();
            preparedStatement = connection.prepareStatement(
                    ConnectionFactory.deleteSQL);
            preparedStatement.setInt(1, 201);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException|IOException e) {
            e.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private static void usePreparedStatement() {
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        try {
            Connection connection = ConnectionFactory.getConnection();
            connection.setAutoCommit(false);
            preparedStatement = connection.prepareStatement(
                    "SELECT * FROM actor WHERE last_name LIKE ?");
            preparedStatement.setString(1, "H%");
            rs = preparedStatement.executeQuery();
            while(rs.next()){
                System.out.println(rs.getString("first_name") + " " +
                        rs.getString("last_name"));
            }
            connection.commit();
            rs.close();
            preparedStatement.close();
        } catch (SQLException|IOException e) {
            e.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private static void useStatement() {
        Statement statement = null;
        ResultSet rs = null;
        try {
            Connection connection = ConnectionFactory.getConnection();
            statement = connection.createStatement();
            rs = statement.executeQuery("SELECT * FROM actor");
            while(rs.next()){
                System.out.println(rs.getString("first_name") + " " +
                        rs.getString("last_name"));
            }
            rs.close();
            statement.close();
        } catch (SQLException|IOException e) {
            e.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
