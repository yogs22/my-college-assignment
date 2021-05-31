package com.company;

import java.awt.*;

public class Main extends Frame {
    private static final long serialVersionUID = 1L;

    String nmFile = "BG_BLUE.jpeg";
    Image gb = Toolkit.getDefaultToolkit().getImage(nmFile);

    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.setFont(new Font("Arial", Font.BOLD, 13));
        g.drawString("NAMA : YOGI PRASETYAWAN HADI", 40, 70);
        g.drawString("NIM : 191110236", 40, 80);
        g.drawImage(gb,0,90,this);
    }

    public boolean handleEvent(Event evt) {
        if (evt.id == Event.WINDOW_DESTROY) {
            System.exit(0);
        }

        return false;
    }

    public static void main(String[] args) {
	    Frame f = new Frame("Gambar YOGI");
	    f.setSize(500, 800);
	    f.setVisible(true);
    }
}
