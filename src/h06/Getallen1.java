package h06;

import java.awt.*;
import java.applet.*;


public class Getallen1 extends Applet {
    double a, b;
    double uitkomst;


    public void init() {
        a = 113;
        b = 4;
        uitkomst = a / b ;
    }

    public void paint(Graphics g) {
        g.drawString("Jan krijgt " + uitkomst +
                " Euro.", 50, 40);
        g.drawString("Ali krijgt " + uitkomst +
                " Euro.", 50, 60);
        g.drawString("Jeannette krijgt " + uitkomst +
                " Euro.", 50, 80);
        g.drawString("Harjit (ik) krijgt " + uitkomst +
                " Euro.", 50, 100);
    }
}