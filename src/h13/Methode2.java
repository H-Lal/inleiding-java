package h13;

import java.applet.Applet;
import java.awt.*;


/**
 * Created by Vinci on 7-9-2017.
 */
public class Methode2 extends Applet {
    int startX = 0;
    int startY = 50;
    int width = 50;
    int height = 20;
    int spacing = 5;

    @Override
    public void paint (Graphics g) {
        muur(g);
        super.setBackground(Color.BLACK);

    }

    public void muur (Graphics g) {
        for (int row = 0; row < 8; row++) {
            int y = startY + (row * (height + spacing));
            for (int col = 0; col < 8; col++) {
                int x = startX + (col * (width + spacing));
                g.setColor(Color.RED);
                g.fillRect(x, y, width, height);
            }
        }

    }
}
