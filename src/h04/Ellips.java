package h04;
//Java Arc

import java.awt.*;
import java.applet.*;

public class Ellips extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.fillArc(20,20,100,100,0,360);
    }

}