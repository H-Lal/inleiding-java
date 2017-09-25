package h13;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Vinci on 23-6-2017.
 */
public class Methode1 extends Applet{

    public void paint(Graphics g ) {
        tekenDriehoek(g, 0,  0, 180, 0 ,  0, 0);
    }

void tekenDriehoek(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3) {
    g.drawLine(x1, y1, 180, 180);
    g.drawLine(x2, y2, 180, 180);
    g.drawLine(x3, y3, 180, 0);
    }


}


