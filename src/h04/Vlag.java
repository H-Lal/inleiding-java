package h04;
//Java 4 Vlagmaken

import java.awt.*;
import java.applet.*;

public class Vlag extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawRect(40,30,150,35);
        g.setColor(Color.red);
        g.fillRect(40,30,150,35);
        g.setColor(Color.black);
        g.drawRect(40,65,150,35);
        g.setColor(Color.white);
        g.fillRect(40,65,150,35);
        g.setColor(Color.black);
        g.drawRect(40,100,150,35);
        g.setColor(Color.blue);
        g.fillRect(40,100,150,35);
        g.setColor(Color.black);
        g.fillRect(35,20,5,200);
        g.setColor(Color.orange);
        g.fillOval(28,10,20, 20);

    }
}