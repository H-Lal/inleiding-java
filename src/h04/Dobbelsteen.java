package h04;
//Java dobblesteen

import java.awt.*;
import java.applet.*;

public class Dobbelsteen extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawRoundRect(20, 20, 100, 100, 10, 10);
        g.fillOval(30, 30, 20, 20);
        g.fillOval(90, 30, 20, 20);
        g.fillOval(30, 90, 20, 20);
        g.fillOval(90, 90, 20, 20);
    }



}