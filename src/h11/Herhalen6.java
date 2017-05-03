package h11;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Vinci on 12-4-2017.
 */
public class Herhalen6 extends Applet {
    public void init() {
    }

    public void paint(Graphics g) {
        int plaats;
        int x = 150;
        int y = 150;
        int width = 10;
        int height = 10;

        for (plaats = 1; plaats < 6; plaats++) {
            height += 10;
            width += 10;
            x -= 5;
            y -= 5;
            g.drawOval(x, y , width, height);
        }
    }
}
