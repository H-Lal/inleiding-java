package h11;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Created by Vinci on 2-5-2017.
 */
public class PraktijkOpdracht extends Applet {
    int tafel;
    int x, y, getal;
    TextField tekstvak;
    Label label;

    public void init() {
        setSize(500, 500);
        tafel = 0;
        label = new Label("type hier uw getal en druk op enter");
        tekstvak = new TextField(2);
        Listen l1 = new Listen();
        tekstvak.addActionListener(l1);
        add (label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        x = 50;
        y = 50;
        if (tafel > 0) {
            for (getal = 0; getal < 10; ) {
                y = y + 20;
                getal++;
                g.drawString(getal + "x" + tafel + "=" + tafel * getal, x, y);
            }
        }
    }

    class Listen implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tafel=(Integer.parseInt(tekstvak.getText()));
            repaint();
        }
    }
}


