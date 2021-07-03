package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    String url, usr, pwd, db;

    public DBConnection(){
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
            System.out.println("Error:Tidak Bisa Koneksi Ke Database\n"+e+"\n");
        }
        return con;
    }
    private void PembuatDialog(){
        System.out.println("Created By : Yogi ~ http://yogi.web.id");
        System.exit(0);
    }
    public static void main(String[] args) {
        DBConnection dnd = new DBConnection();
        dnd.getConnection();
        dnd.PembuatDialog();
    }
}
