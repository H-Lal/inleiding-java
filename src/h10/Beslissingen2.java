package h10;

/**
 * Created by Vinci on 21-3-2017.
 */

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Beslissingen2 extends Applet {
    TextField tekstvak;
    Label label;
    int getal1,getal2, getal3;

    public void init() {
        tekstvak = new TextField("", 20);
        tekstvak.addActionListener(new VakListener());
        label= new Label("type uw getal en druk op enter");
        add(tekstvak);
        add (label);

    }
    public void paint(Graphics g){
        g.drawString("hoogte getal : "+getal1,27,60);
        g.drawString("laagste getal : "+ getal3, 27,80);

    }

    class VakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getal2 = Integer.parseInt(tekstvak.getText());
            if (getal3 == 0)
            {
                getal3 = getal2;
            }
            if ((getal2>getal1)) {
                getal1 = getal2;
                tekstvak.setText(null);
                repaint();
            }
            if ((getal2<getal1) &&(getal2< getal3)) {
                getal3 = getal2;
                tekstvak.setText(null);
                repaint();
            }
        }
    }
}