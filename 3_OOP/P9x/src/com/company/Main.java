package com.company;

import java.awt.Event;
import java.awt.Frame;
import java.awt.Graphics;

public class Main extends Frame {
    private static final long serialVersionUID = 1L;

    public void paint(Graphics g){
        g.drawString("Bangun 2 Dimensi", 20, 60);
        g.drawLine(20,70,100,70);
        g.drawRect(20,80,100,20);
        g.fillRect(20,110,100,20);
        g.drawOval(20,140,30,20);
        g.drawRoundRect(20,170,30,20,30,20);
        g.fillRoundRect(60,170,30,20,30,20);
    }

    public boolean handleEvent(Event evt){
        if (evt.id == Event.WINDOW_DESTROY) {
            System.exit(0);
        }
        return false;
    }

    public static void main(String[] args) {
        Frame f = new Frame();
        f.setSize(300, 220);
        f.setVisible(true);
    }
}
