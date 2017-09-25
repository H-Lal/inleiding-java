package h12;

/**
 * Created by Harjit on 7-5-2017.
 */

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class Tabellen3 extends Applet {
    private TextField[] tekstvak;
    private int[] getallen;
    private Button f = new Button("OK");

    public void init() {
        tekstvak = new TextField[5];
        getallen = new int[5];

        for (int teller = 0; teller < tekstvak.length; teller++) {
            tekstvak[teller] = new TextField("", 5);
            add(tekstvak[teller]);

        }

        f.addActionListener(new KnopListener());
        add(f);


    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            for (int i = 0; i < tekstvak.length; i++) {
                getallen[i] = Integer.parseInt(tekstvak[i].getText());
            }

            Arrays.sort(getallen);

            for (int i = 0; i < getallen.length; i++) {
                tekstvak[i].setText(String.valueOf(getallen[i]));
            }
        }
    }
}




