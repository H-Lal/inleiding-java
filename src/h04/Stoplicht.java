package h04;
//Java stoplicht

import java.awt.*;
import java.applet.*;

public class Stoplicht extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.fillRect(20,20,50,90);
        g.fillRect(40,110,10,90);
        g.setColor(Color.red);
        g.fillOval(40,30,10,10);
        g.setColor(Color.orange);
        g.fillOval(40,60,10,10);
        g.setColor(Color.green);
        g.fillOval(40,90,10,10);

    }

}