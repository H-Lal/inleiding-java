package h06;

import java.awt.*;
import java.applet.*;


public class Getallen2 extends Applet {
    int uitkomstuur;
    int uitkomstdagen;
    int uitkomstjaren;


    public void init() {
        uitkomstuur =  60*60  ;
        uitkomstdagen = 24*3600;
        uitkomstjaren  = 365*864000;
    }

    public void paint(Graphics g) {
        g.drawString("Er zitten  " + uitkomstuur +
                "  secondes in een uur.", 50, 40);
        g.drawString("Er zitten  " + uitkomstdagen +
                "  secondes in een dag.", 50, 60);
        g.drawString("Er zitten  " + uitkomstjaren+
                "  secondes in een jaar.", 50, 80);

    }
}