package Challenge;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.*;
import java.io.*;


/**
 * Created by Vinci on 13-6-2017.
 */
public class tekstvak extends Applet implements ActionListener {
    TextField textvak;
    Button knop;
    String[] split;
    boolean click;

    public void init() {
        setSize(600, 400);
        textvak = new TextField("", 70);
        knop = new Button("Try me nigga");
        add(textvak);
        add(knop);
        knop.addActionListener(this);

    }

    public void paint(Graphics graphics) {
        int x = 100;
        int y = 100;
        if (click = true) {
            for (int i = 0; i < split.length; i++) {
                graphics.drawString(split[i],x,y);
                y+=20;
            }

        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!textvak.equals("")) {
            String woorden = textvak.getText();
            split = woorden.split(" ");
            Arrays.sort(split);
            click = true;

        }
        repaint();
    }

}
