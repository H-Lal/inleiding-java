package h11;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Vinci on 12-4-2017.
 */
public class Herhalen8 extends Applet{
    public void init() {
    }

    public void paint(Graphics g) {
        int lel;
        int x = 50;
        int y = 50;
        int width = 10;
        int height = 10;

        for (lel = 1; lel <= 100; lel++) {
            height += 10;
            width += 10;
            g.drawOval(x, y, width, height);
        }
    }
}
