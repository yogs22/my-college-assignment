package com.company;
import java.sql.*;

public class Main {
    String url, usr, pwd, db;
    public DBConnection() {
        db = "javadb";
        url = "jdbc:mysql://localhost"+db;
        usr = "root";
        pwd = "password";
    }

    public Connection getConnection() {
        
    }

    public static void main(String[] args) {

    }
}
