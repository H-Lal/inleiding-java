package Toets;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Wereldtijden extends Applet {
    private TextField tekstvak;
    private Button knop;
    private Label label;
    int tijdinlonden, tijdinindia, tijdincanada, tijdinjapan ;
    private int invoer;
    private ActionListener a;
    private boolean gekliked;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Typ de tijd in en druk op enter");
        tekstvak.addActionListener(new TekstvakListenertijd());
        add(label);
        add(tekstvak);

        Button knop = new Button();
        knop.setLabel("Toon tijden");
        knop.addActionListener(new TekstvakListenertijd());
        knop.addActionListener(new KnopListener());
        add(knop);}
    public void paint(Graphics g) {
        if (gekliked==true) {
            g.drawString("In London is het: " + tijdinlonden + ":00 uur", 70, 80);  //-1 uur
            g.drawString("In India is het: " + tijdinindia + ":00 uur", 70, 100);  //+5 uur
            g.drawString("In Canada is het: " + tijdincanada + ":00 uur", 70, 120); //-7 uur
            g.drawString("In Japan is het: " + tijdinjapan + ":00 uur", 70, 140);  //+9 uur
        }
            if (invoer > 24) {
                g.drawString("voer geldige invoer in", 100, 180);
            }
        }
    class TekstvakListenertijd implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                invoer = Integer.parseInt(tekstvak.getText());

                if (invoer > 0 && invoer <= 24) {
                    tijdinlonden = invoer - 1;
                    if (tijdinlonden < 0) {
                        tijdinlonden = tijdinlonden + 24;
                    }
                    if (tijdinlonden > 24) {
                        tijdinlonden = tijdinlonden - 24;
                    }
                }
                if (invoer > 0 && invoer <= 24) {
                    tijdinindia = invoer + 5;
                    if (tijdinindia < 0) {
                        tijdinindia = tijdinindia + 24;
                    }
                    if (tijdinindia > 24) {
                        tijdinindia = tijdinindia - 24;
                    }
                }
                if (invoer > 0 && invoer <= 24) {
                    tijdincanada = invoer - 7;
                    if (tijdincanada < 0) {
                        tijdincanada = tijdincanada + 24;
                    }
                    if (tijdincanada > 24) {
                        tijdincanada = tijdincanada - 24;
                    }
                }
                if (invoer > 0 && invoer <= 24) {
                    tijdinjapan = invoer + 9;
                    if (tijdinjapan < 0) {
                        tijdinjapan = tijdinjapan + 24;
                    }
                    if (tijdinjapan > 24) {
                        tijdinjapan = tijdinjapan - 24;
                    }
                }
                repaint();
            }
        }
        class KnopListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                if (!gekliked) {
                    gekliked = true;
                }
            }
        }
    }