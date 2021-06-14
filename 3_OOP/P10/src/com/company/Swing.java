package com.company;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Swing extends JFrame
{
    private static final long serialVersionUID = 1L;
    JLabel label_nim = new JLabel("INPUT");
    JLabel label_my_nim = new JLabel("NIM: 191110236");
    JLabel label_my_name = new JLabel("Nama: Yogi Prasetyawan Hadi");
    JTextField text_nim = new JTextField(35);

    JRadioButton radio_gender1 = new JRadioButton("Male");
    JRadioButton radio_gender2 = new JRadioButton("Female");
    ButtonGroup group_Check1 = new ButtonGroup();

    String[] Prodi={"Teknik Informatika","Sistem Informasi"};
    JComboBox<Object> combo_prodi = new JComboBox<Object>(Prodi);

    JCheckBox check_hobby1 = new JCheckBox("Sleeping");
    JCheckBox check_hobby2 = new JCheckBox("Playing Game");
    ButtonGroup group_Check2 = new ButtonGroup();
    JButton button_add = new JButton("+ Add");

    Swing(){
        setTitle("Data Mahasiswa UMBY");
        setLocation(200,200);
        setSize(325,240);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    void GUI(){
        getContentPane().setLayout(null);

        getContentPane().add(label_my_nim);
        label_my_nim.setBounds(10,10,150,20);

        getContentPane().add(label_my_name);
        label_my_name.setBounds(10,30,300,20);

        getContentPane().add(label_nim);
        label_nim.setBounds(10,55,80,20);
        getContentPane().add(text_nim);
        text_nim.setBounds(100,55,150,20);

        getContentPane().add(radio_gender1);
        radio_gender1.setBounds(100,76,80,20);
        getContentPane().add(radio_gender2);
        radio_gender2.setBounds(200,76,80,20);
        group_Check1.add(radio_gender1);
        group_Check1.add(radio_gender2);
        combo_prodi.setBounds(100,70,150,20);

        getContentPane().add(check_hobby1);
        check_hobby1.setBounds(100,100,120,20);
        getContentPane().add(check_hobby2);
        check_hobby2.setBounds(100,130,120,20);
        group_Check2.add(check_hobby1);
        group_Check2.add(check_hobby2);

        getContentPane().add(button_add);
        button_add.setBounds(10,160,100,20);
        setVisible(true);
    }

    public static void main(String[] args) {
        Swing swing = new Swing();
        swing.GUI();
    }
}
