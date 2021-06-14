package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Program_1 extends JFrame {

    private static final long serialVersionUID = 1L;
    JLabel label_nim = new JLabel("NIM");
    JTextField text_nim = new JTextField(35);

    JLabel label_gender = new JLabel("Gender");
    JRadioButton radio_gender1 = new JRadioButton("Male");
    JRadioButton radio_gender2 = new JRadioButton("Female");
    ButtonGroup group_check1 = new ButtonGroup();

    JLabel label_prodi = new JLabel("Prodi");
    String[] Prodi = {"Teknik Informatika", "Sistem Informasi"};
    JComboBox<Object> combo_prodi = new JComboBox<Object>(Prodi);

    JLabel label_hobby = new JLabel("Hobby");
    JCheckBox check_hobby1 = new JCheckBox("Sleeping");
    JCheckBox check_hobby2 = new JCheckBox("Playing Game");
    ButtonGroup group_check2 = new ButtonGroup();

    JButton button_view = new JButton("View");
    JButton button_exit = new JButton("Exit");

    JLabel label_view = new JLabel("View :");
    JTextArea textAreaView = new JTextArea();

    Program_1() {
        setTitle("Data Mahasiswa UMBY");
        setLocation(200,200);
        setSize(325,350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void Layout() {
        getContentPane().setLayout(null);

        getContentPane().add(label_nim).setBounds(10,10,80,20);
        getContentPane().add(text_nim).setBounds(100,10,150,20);

        getContentPane().add(label_gender).setBounds(10,40,80,20);
        getContentPane().add(radio_gender1).setBounds(100,40,80,20);
        getContentPane().add(radio_gender2).setBounds(200,40,80,20);

        group_check1.add(radio_gender1);
        group_check1.add(radio_gender2);

        getContentPane().add(label_prodi).setBounds(10,70,80,20);
        getContentPane().add(combo_prodi).setBounds(100,70,150,20);

        getContentPane().add(label_hobby).setBounds(10,100,80,20);
        getContentPane().add(check_hobby1).setBounds(100,100,120,20);
        getContentPane().add(check_hobby2).setBounds(100,130,120,20);

        group_check2.add(check_hobby1);
        group_check2.add(check_hobby2);

        getContentPane().add(button_view).setBounds(10,160,100,20);
        getContentPane().add(button_exit).setBounds(110,160,100,20);

        getContentPane().add(textAreaView).setBounds(10,200,300,100);

        setVisible(true);
    }

    void Action() {
        button_view.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textAreaView.append("NIM = "+ text_nim.getText()+ "\n");

                if (radio_gender1.isSelected() == true) {
                    textAreaView.append("Gender = "+ radio_gender1.getText()+ "\n");
                } else {
                    textAreaView.append("Gender = "+ radio_gender2.getText()+ "\n");
                }

                String pilihan = combo_prodi.getSelectedItem().toString();
                if (pilihan.equals("Teknik Informatika")) {
                    textAreaView.append("Prodi = Teknik Informatika \n");
                } else {
                    textAreaView.append("Prodi = Sistem Informasi \n");
                }

                textAreaView.append("Hobby = \n");
                if (check_hobby1.isSelected() == true) {
                    textAreaView.append("-"+ check_hobby1.getText()+ "\n");
                }
                if (check_hobby2.isSelected() == true) {
                    textAreaView.append("-"+ check_hobby2.getText()+ "\n");
                }
            }
        });

        button_exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new Program_1();
    }
}
