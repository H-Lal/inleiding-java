package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;

/**
 * Created by Vinci on 7-5-2017.
 */
public class Praktijkopdracht extends Applet implements ActionListener {
    TextField naamfield, telefoonfield;
    Button knop;
    String[] namen, nummers;
    int index;
    boolean geklikt;
    boolean fout;

    @Override
    public void init() {
        naamfield = new TextField("", 20);
        telefoonfield = new TextField("", 20);
        knop = new Button("ok");
        add(naamfield);
        add(telefoonfield);
        add(knop);
        knop.addActionListener(this);
        namen = new String[10];
        nummers = new String[10];
        index = 0;
        geklikt = false;
        fout = false;

    }

    public void paint(Graphics graphics) {
        if (geklikt) {
            int y = 100;
            int x = 100;
            for (int i = 0; i < nummers.length; i++) {
                graphics.drawString(namen[i], x, y);
                graphics.drawString(nummers[i], x + 50, y);
                y += 20;
            }
        }
        if(fout){
            graphics.drawString("YOU PLAYED YOURSELF",100,100);
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (index < 10) {
            String naam = naamfield.getText();
            String telefoon = telefoonfield.getText();


            if (!naam.equals("") && !telefoon.equals("")){
                geklikt = true;
                fout = false;
                namen[index] = naam;
                nummers[index] = telefoon;
                index++;
                naamfield.setText("");
                telefoonfield.setText("");
                naamfield.requestFocus();
            } else{
                fout = true;
                repaint();
            }


        } if (index == 10) {
            repaint();
        }

    }
}



