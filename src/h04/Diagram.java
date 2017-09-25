package h04;
//Java staafdiagram


import java.applet.*;
import java.awt.Color;
import java.awt.Graphics;

public class Diagram extends Applet {

    public void init() {

    }


    public void paint(Graphics g) {
        g.setColor(Color.cyan);
        g.fillRect(40,60,50,80); //Hans 80kg
        g.drawString("Hans", 40, 150 );
        g.setColor(Color.green);
        g.fillRect(90,40,50,100); //Jeroen 100kg
        g.drawString("Jeroen", 90, 150 );
        g.setColor(Color.magenta);
        g.fillRect(140,100,50,40); //Valerie 40 kg
        g.drawString("Valerie", 150, 150 );
        g.setColor(Color.BLACK);
        g.fillRect(190,40,1,100);
        g.drawString("100", 193, 40 );
        g.drawString("80", 193, 60 );
        g.drawString("60", 193,80 );
        g.drawString("40", 193, 100 );
        g.drawString("20", 193, 120 );
        g.drawString("0", 193, 140 );
    }

}
