package h11;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Vinci on 12-4-2017.
 */
public class Herhalen5 extends Applet {
    public void init() {
    }

    public void paint(Graphics g) {
        int plaats;
        int x = 5;
        int y = 20;
        int width = 20;
        int height = 20;
        for (plaats = 1; plaats < 6; plaats++) {
            x += 19;
            y += 19;
            g.drawRect(x + plaats, y + plaats, width, height);
        }
    }
}
