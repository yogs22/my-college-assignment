package com.company;
import java.sql.*;

public class DBConnection {
    String url, usr, pwd, db;
    public DBConnection() {
        db = "kl_javadb";
        url = "jdbc:mysql://localhost/" + db;
        usr = "root";
        pwd = "password";
    }

    public Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, usr, pwd);
            System.out.println("Ok : Driver Ditemukan");
        }
        catch (ClassNotFoundException e) {
            System.out.println("Error: Driver Tidak Ditemukan \n"+e+"\n");
        }
        catch (SQLException e) {
            System.out.println("Error: Tidak Dapat Connect ke Database \n"+e+"\n");
        }

        return con;
    }

    public void MakeDialog() {
        System.out.println("Created by : Yogi Prasetyawan ~ yogi.web.id");
        System.out.println("NIM : 191110236");
        System.exit(0);
    }

    public static void main(String[] args) {
        DBConnection dnd = new DBConnection();
        dnd.getConnection();
        dnd.MakeDialog();
    }
}
