package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Knoppen2 extends Applet {
    Button knopm;
    Button knopml;
    Button knopv;
    Button knopvl;
    int man = 0;
    int vrouw = 0;
    int manl = 0;
    int vrouwl = 0;
    int totaal;

    public void init() {

        knopm = new Button();
        knopm.setLabel("1 man");
        KnopListenerm aa = new KnopListenerm();
        knopm.addActionListener(aa);
        add(knopm);

        knopml = new Button();
        knopml.setLabel("1 vrouw");
        add(knopml);
        KnopListener2 bb = new KnopListener2();
        knopml.addActionListener(bb);

        knopv = new Button();
        knopv.setLabel("1 Potentiële vrouw");
        KnopListener3 cc = new KnopListener3();
        knopv.addActionListener(cc);
        add(knopv);

        knopvl = new Button();
        knopvl.setLabel("1 Potentiële mannen");
        KnopListener4 dd = new KnopListener4();
        knopvl.addActionListener(dd);
        add(knopvl);

    }

    public void paint(Graphics g) {
        totaal = man + manl + vrouw + vrouwl;
        g.drawString("Aantal Mannen " + man, 10, 60);
        g.drawString("Aantal Vrouwen " + vrouw, 10, 80);
        g.drawString("Aantal potentiële vrouwen " + vrouwl, 10, 100);
        g.drawString("Aantal potentiële mannen " +manl, 10, 120);
        g.drawString("Totaal " + totaal, 10, 140);

    }


    class KnopListenerm implements ActionListener {
        public void actionPerformed(ActionEvent aa) {
            man++;
            repaint();
        }
    }

    class KnopListener2 implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            manl++;
            repaint();
        }

    }

    class KnopListener3 implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            vrouw++;
            repaint();
        }


    }

    class KnopListener4 implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            vrouwl++;
            repaint();
        }

    }
}