package com.company;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class ViewData extends JPanel {
    String[] header = {"NIM","NAMA"};
    JTable table_mhs = new JTable();
    JScrollPane scrollTable = new JScrollPane();
    public Object[][] isiTable = null;

    ViewData() {
        DBConnection open = new DBConnection();
        Connection mysql = open.getConnection();

        try {
            Statement stmt = mysql.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY
            );
            String sql = "SELECT * FROM mahasiswa";
            ResultSet res = stmt.executeQuery(sql);
            ResultSetMetaData meta = res.getMetaData();
            int kolom = meta.getColumnCount();
            int baris = 0;
            while(res.next()) {
                baris = res.getRow();
            }
            isiTable = new Object[baris][kolom];
            int x = 0;
            res.beforeFirst();
            while (res.next()) {
                isiTable[x][0] = res.getString("nim");
                isiTable[x][1] = res.getString("nama");
                x++;
            }
            scrollTable.setViewportView(table_mhs);
            table_mhs.setModel(new DefaultTableModel(isiTable, header));
            add(scrollTable, BorderLayout.NORTH);
            stmt.close();
            res.close();
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    void Layout(){
        JFrame frame = new JFrame("Data Mahasiswa");
        ViewData content = new ViewData();
        content.setOpaque(true);
        frame.setContentPane(content);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new ViewData();
    }
}
