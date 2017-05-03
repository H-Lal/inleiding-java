package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Beslissingen1 extends Applet {
    TextField tekstvak;
    Label label;
    String getals;
    int getal,getal1;


    public void init() {

        tekstvak = new TextField("", 20);
        tekstvak.addActionListener(new VakListener());
        label= new Label("type uw getal en druk op enter");
        add(tekstvak);
        add (label);
        getals = "";
    }

    public void paint(Graphics g) {
        g.drawString(getal+"",50,50);
    }

    class VakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getal1= Integer.parseInt(tekstvak.getText());
            if ((getal1>getal))
            {
                getal=getal1;
                tekstvak.setText(null);
                repaint();
            }
        }
    }
}

