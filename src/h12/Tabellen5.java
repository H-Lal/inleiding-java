package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Created by Vinci on 7-5-2017.
 */
public class Tabellen5 extends Applet {
    int[] getallen = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    TextField[] tekstvak;
    Label label;
    Button knop = new Button("OK");
    int text;


    public void init() {
        tekstvak = new TextField[5];
        label = new Label("Typ u getal");
        add(label);
        add(tekstvak);
        getallen = new int[10];


        }

    private void add(TextField[] tekstvak) {
    }


    public void paint(Graphics g) {
        int x = 0;
        int y = 100;
        g.drawString("GETAL IS GEVONDEN"+ text, x, y );

    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < tekstvak.length; i++) {
                text = Integer.parseInt(tekstvak[i].getText());
                repaint();
            }
        }
    }

}


