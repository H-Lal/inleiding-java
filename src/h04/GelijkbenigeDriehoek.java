package h04;
//Java Driehoek


import java.awt.*;
import java.applet.*;

public class GelijkbenigeDriehoek extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.drawPolygon(new int[] {10, 20, 30}, new int[] {100, 20, 100}, 3);
    }


}