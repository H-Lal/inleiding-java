package Challenge;

import java.applet.*;
import java.awt.*;

/**
 * Created by Vinci on 19-5-2017.
 */
public class getallenrij extends Applet {
    public void init() {
    }

    public void paint(Graphics g) {
        int i;
        int x = 50;
        int y = 20;
        for (i = 1; i <= 10; i++) {
            y += 20;

            if (i == 5) {
                g.drawString(" op de helft", x, y);
            } else
                g.drawString(String.valueOf(i), x, y);

        }
    }

}

