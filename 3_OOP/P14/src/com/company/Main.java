package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    private static final long serialVersionUID = 1L;
    JMenuBar menuContoh = new JMenuBar();
    JMenu File = new JMenu("File");
    JMenu OpenSubmenu = new JMenu("Open");
    JMenuItem Mhs = new JMenuItem("Data Mahasiswa");
    JMenuItem Exit = new JMenuItem("Exit");
    JMenu About = new JMenu("About");
    JMenuItem AboutDialog = new JMenuItem("About Us");
    JLabel label_nim = new JLabel("NIM : 191110236");
    JLabel label_name = new JLabel("NAME : YOGI PRASETYAWAN HADI");

    Main(){
        setTitle("Data Mahasiswa UMBY");
        setLocation(200,200);
        setSize(325,240);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void Layout() {
        setJMenuBar(menuContoh);
        menuContoh.add(File);
        File.add(OpenSubmenu);
        OpenSubmenu.add(Mhs);
        File.add(Exit);
        menuContoh.add(About);
        About.add(AboutDialog);

        getContentPane().setLayout(null);

        getContentPane().add(label_nim).setBounds(10,25,150,10);
        getContentPane().add(label_name).setBounds(10,45,300,10);

        setVisible(true);
    }

    void Action() {
        Mhs.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CrudAction action = new CrudAction();
                action.Layout();
                action.Action();
            }
        });

        Exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        AboutDialog.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "<html>"
                                + "191110236 - Yogi Prasetyawan Hadi<br />"
                                + "<a href='https://yogi.web.id'>"
                                + "https://yogi.web.id</a>"
                                + "</html>",
                        "About",JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }

    public static void main(String[]args){
        Main program = new Main();
        program.Layout();
        program.Action();
    }
}
