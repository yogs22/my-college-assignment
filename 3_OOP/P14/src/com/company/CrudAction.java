package com.company;

import javax.swing.*;
import java.sql.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CrudAction extends JFrame {
    JLabel label_Author = new JLabel("YOGI PRASETYAWAN HADI - 191110236");
    JLabel label_NIM = new JLabel("NIM");
    JTextField txt_NIM = new JTextField(30);
    JLabel label_Nama = new JLabel("Name");
    JTextField txt_Nama = new JTextField(50);
    JButton buttonSave = new JButton("Save");
    JButton buttonUpdate = new JButton("Update");
    JButton buttonDelete = new JButton("Delete");
    JButton buttonSearch = new JButton("Search");
    JButton buttonView = new JButton("View");

    CrudAction() {
        setTitle("Manajemen Data Mahasiswa UMBY");
        setLocation(200,200);
        setSize(325,240);
    }

    void Layout() {
        getContentPane().setLayout(null);

        getContentPane().add(label_Author).setBounds(10,10,300,20);

        getContentPane().add(label_NIM).setBounds(10,40,80,20);
        getContentPane().add(txt_NIM).setBounds(100,40,150,20);

        getContentPane().add(label_Nama).setBounds(10,70,80,20);
        getContentPane().add(txt_Nama).setBounds(100,70,150,20);

        getContentPane().add(buttonSave).setBounds(10,110,100,20);
        getContentPane().add(buttonUpdate).setBounds(120,110,100,20);

        getContentPane().add(buttonDelete).setBounds(10,140,100,20);
        getContentPane().add(buttonSearch).setBounds(120,140,100,20);

        getContentPane().add(buttonView).setBounds(10,180,210,20);

        setVisible(true);
    }

    void Action() {
        buttonSave.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e){
                DBConnection open = new DBConnection();
                Connection mysql = open.getConnection();
                try {
                    Statement stmt = mysql.createStatement();
                    String sql = "INSERT INTO mahasiswa VALUES (NULL, '"
                            + txt_NIM.getText() + "','"
                            + txt_Nama.getText() + "');";

                    int i = stmt.executeUpdate (sql);
                    if (i == 1) {
                        JOptionPane.showMessageDialog(null,"Data Sudah Disimpan");
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });

        // button search
        buttonSearch.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e){
                String search;
                DBConnection open = new DBConnection();
                Connection mysql = open.getConnection();
                try {
                    search = txt_NIM.getText();
                    Statement stmt = mysql.createStatement();
                    String sql = "SELECT * FROM mahasiswa "
                            + "WHERE nim like '"+ search +"'";
                    ResultSet res = stmt.executeQuery(sql);
                    if (res.next()) {
                        String message = "NIM = " + res.getString(2) + " Nama : "+res.getString(3);
                        JOptionPane.showMessageDialog(null, message);
                    } else {
                        JOptionPane.showMessageDialog(null,"Data Tidak Ditemukan");
                    }
                }
                catch (Exception ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });

        buttonUpdate.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e) {
                DBConnection open = new DBConnection();
                Connection mysql = open.getConnection();
                try {
                    Statement stmt = mysql.createStatement();
                    String sql = "UPDATE mahasiswa SET "
                            +"nama = '"+txt_Nama.getText()+"'"
                            +"WHERE "
                            +"nim = '"+txt_NIM.getText()+"'";
                    int i = stmt.executeUpdate (sql);
                    if (i == 1) {
                        JOptionPane.showMessageDialog(null,"Data Sudah Diupdate");
                    }
                } catch (Exception ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });

        buttonDelete.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e) {
                DBConnection open = new DBConnection();
                Connection mysql = open.getConnection();
                try {
                    Statement stmt = mysql.createStatement();
                    String sql = "DELETE FROM mahasiswa "
                            +"WHERE nim = '"+txt_NIM.getText()+"'";
                    int i = stmt.executeUpdate(sql);
                    if (i > 0) {
                        JOptionPane.showMessageDialog(null,"Data Sudah Dihapus");
                    }
                }
                catch (Exception ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });

        buttonView.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ViewData action = new ViewData();
                action.Layout();
            }
        });
    }

    public static void main(String[] args) {
        new CrudAction();
    }
}
