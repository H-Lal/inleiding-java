package h12;

import java.awt.*;
import java.applet.*;

/**
 * Created by Vinci on 7-5-2017.
 */

public class Tabellen1 extends Applet  {
        int salaris[];
        int gemiddelde, totaal;

        public void init() {
            salaris = new int[10];

            for (int teller = 0; teller < salaris.length; teller++) {
                salaris[teller] = 250 * teller + 100;

                totaal += salaris[teller];
            }
            gemiddelde = totaal / salaris.length;
        }

        public void paint(Graphics g) {
            for (int teller = 0; teller < salaris.length; teller++) {
                g.drawString("" + salaris[teller], 50, 20 * teller + 20);
                g.drawString("Het gemiddelde is: " + gemiddelde, 200, 100);
            }


        }
    }