package com.company;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Frame;

import javax.swing.JComponent;

public class FrameTest extends JComponent {
    private static final long serialVersionUID = 1L;

    public Graphics g;

    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g.fillRect(0, 0, 1000, 500);
        g.setColor(Color.gray);
        g.fillRect(0, 0, 100, 100);
    }

    public static void main(String[] args) {
        Frame frame = new Frame("title");
        frame.setSize(1000, 500);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
    }
}