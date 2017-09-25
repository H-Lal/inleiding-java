package h13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Created by Vinci on 7-9-2017.
 */
public class Methode3 extends Applet {
    int startX = 10;
    int startY = 50;
    int width = 50;
    int height = 20;
    int spacing = 2;
    int width1 = 100;
    int height1 = 40;
    int startX1 = 900;
    int startY1 = 50;
    Button red;
    Button gray;
    boolean geklikedred = false;
    boolean geklikedgray = false;


    @Override
    public void paint (Graphics g) {
        if (geklikedred == true) {
            muur(g);
            geklikedgray = false;
        }
            if (geklikedgray == true){
                muur1(g);
                geklikedred = false;
            }

        super.setBackground(Color.BLACK);
    }
    public void button (){
        red = new Button("Pokemon Red");
        red.addActionListener(new KnopListener());
        add (red);

        gray = new Button("Pokemon Grey");
        gray.addActionListener(new KnopListener1());
        add (gray);
    }
public void init (){
       button();


    }
    public void muur (Graphics g) {
    if (geklikedred == true) {
        for (int row = 0; row < 8; row++) {
            int y = startY + (row * (height + spacing));
            for (int col = 0; col < 8; col++) {
                int x = startX + (col * (width + spacing));
                g.setColor(Color.RED);
                g.fillRect(x, y, width, height);
            }
        }
    }

    }
    public void muur1 (Graphics g) {
        if (geklikedgray == true) {
            for (int row = 0; row < 8; row++) {
                int y = startY1 + (row * (height1 + spacing));
                for (int col = 0; col < 8; col++) {
                    int x = startX1 + (col * (width1 + spacing));
                    g.setColor(Color.GRAY);
                    g.fillRect(x, y, width1, height1);
                }
            }
        }

    }
    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if( geklikedred = true ){
                geklikedgray = false;

            }
            repaint();
            }
        }
    class KnopListener1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if( geklikedgray = true){
                geklikedred = false;

            }
            repaint();
        }
    }
    }

