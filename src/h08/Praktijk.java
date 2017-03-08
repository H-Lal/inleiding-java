package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Praktijk extends Applet {
    TextField tekstvak1;
    TextField tekstvak2;
    Button plus;
    Button min;
    Button keer;
    Button delen;
    double plusuitkomst1;
    double plusuitkomst2;
    double minuitkomst1;
    double minuitkomst2;
    double delenuitkomst1;
    double delenuitkomst2;
    double keeruitkomst1;
    double keeruitkomst2;
    double ansp;
    double ansm;
    double ansk;
    double ansd;

    public void init() {
        tekstvak1 = new TextField("", 20);
        add(tekstvak1);

        tekstvak2 = new TextField("", 20);
        add(tekstvak2);

        plus= new Button();
        plus.setLabel("+");
        KnopListenerplus aa = new KnopListenerplus();
        plus.addActionListener(aa);
        add(plus);

        min= new Button();
        min.setLabel("-");
        KnopListenermin ab = new KnopListenermin();
        min.addActionListener(ab);
        add(min);

        keer= new Button();
        keer.setLabel("*");
        KnopListenerkeer ac = new KnopListenerkeer();
        keer.addActionListener(ac);
        add(keer);

        delen= new Button();
        delen.setLabel("/");
        KnopListenerdelen ad = new KnopListenerdelen();
        delen.addActionListener(ad);
        add(delen);
    }

    public void paint(Graphics g) {
    }
    class KnopListenerplus implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            plusuitkomst1 = Double.parseDouble(tekstvak1.getText());
            plusuitkomst2 = Double.parseDouble(tekstvak2.getText());
            ansp = plusuitkomst1 + plusuitkomst2;
            tekstvak1.setText("" + ansp);
            tekstvak2.setText("");
            repaint();
        }
    }
    class KnopListenermin implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            minuitkomst1 = Double.parseDouble(tekstvak1.getText());
            minuitkomst2 = Double.parseDouble(tekstvak2.getText());
            ansm = minuitkomst1 - minuitkomst2;
            tekstvak1.setText("" + ansm);
            tekstvak2.setText("");
            repaint();
        }
    }
    class KnopListenerkeer implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            keeruitkomst1 = Double.parseDouble(tekstvak1.getText());
            keeruitkomst2 = Double.parseDouble(tekstvak2.getText());
            ansk = keeruitkomst1 * keeruitkomst2;
            tekstvak1.setText("" + ansk);
            tekstvak2.setText("");
            repaint();
        }
    }

    class KnopListenerdelen implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            delenuitkomst1 = Double.parseDouble(tekstvak1.getText());
            delenuitkomst2 = Double.parseDouble(tekstvak2.getText());
            ansd = delenuitkomst1 / delenuitkomst2;
            tekstvak1.setText("" + ansd);
            tekstvak2.setText("");
            repaint();
        }
    }
}