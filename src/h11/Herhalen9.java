package h11;

import java.awt.*;
import java.applet.*;
/**
 * Created by Vinci on 12-4-2017.
 */

public class Herhalen9 extends Applet {
     
    public void paint(Graphics g) {
        g.drawRect(0,0,160,160);
        int rij;
        int kolom;
        int x, y;

        for (rij = 0; rij < 8; rij++) {
            for (kolom = 0; kolom < 8; kolom++) {
                x = kolom * 20;
                y = rij * 20;
                if ((rij % 2) == (kolom % 2))
                    g.setColor(Color.white);
                else
                    g.setColor(Color.black);
                g.fillRect(x, y, 20, 20);
            }
        }
    }
}
