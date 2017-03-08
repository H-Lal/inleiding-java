package h06;

import java.awt.*;
import java.applet.*;


public class Getallen3 extends Applet {
    int uitkomst;

    public void init() {
        uitkomst = 2147483647 + 2147483647;
    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 20, 20);
    }
}