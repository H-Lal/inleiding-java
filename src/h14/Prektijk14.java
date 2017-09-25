package h14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;


/**
 * Created by Vinci on 23-9-2017.
 */
public class Prektijk14 extends Applet {
    int jokers;
    int AIjokers;
    int playerinput;
    boolean geldig;
    boolean AiWIN;
    TextField input;
    Image jokericon;
    Image jokerlose;
    Image jokerwin;

    public void init() {
        jokers = 23;
        setSize(900, 900);

        input = new TextField(8);
        add(input);
        textvak aa = new textvak();
        input.addActionListener(aa);

        URL pad = Prektijk14.class.getResource("/resources/");
        jokericon = getImage(pad, "joker.jpg");
        jokerwin = getImage(pad, "iwon.gif");
        jokerlose = getImage(pad, "uwon.gif");
    }

    public void paint(Graphics g) { //hier mee teken ik de jokers en de tekst op het scherm
        g.drawString("Hoeveel jokers: " + jokers, 100, 80);
        g.drawString("Vul 1,2 of 3 in en probeer niet op 1 te eindigen!!!", 50, 20);
        g.drawString("The Joker heeft " + AIjokers + " jokers weggehaald", 570, 80);
        winLose(g);

        int x = 100;
        int y = 100;

        for (int i = 0; i < jokers; i++) {
            x += 100;

            g.drawImage(jokericon, x, y, 100, 100, this);
            if (i == 3) {
                x = 100;
                y = 200;

            }
            if (i == 7) {
                x = 100;
                y = 300;

            }
            if (i == 11) {
                x = 100;
                y = 400;

            }
            if (i == 15) {
                x = 100;
                y = 500;
            }
            if (i == 19) {
                x = 100;
                y = 600;

            }
            if (i == 22) {
                x = 100;
                y = 600;

            }

        }
    }

    public boolean isGeldig() { // hier mee controleer ik of de input wel goed is
        boolean geldig;
        if (playerinput > 3 || playerinput < 1) {
//            getGraphics().drawString("DON'T TEST THE JOKER..... FILL SOMETHING IN THAT MAKES SENSE", 200, 80);
            geldig = false;
        } else {
            geldig = true;
        }
        return geldig;
    }


    public void AI() { // dit is de ai
        AIjokers = jokers; // hier mee worden de jokers het zelfde
        if (isGeldig()) {
            if (jokers % 4 == 0) {
                jokers -= 3;
                AiWIN = true;
            } else if (jokers % 4 == 1) {
                jokers -= (int) (Math.random() * 3 + 1);// dit is het random getal ik heb geen flauw idee waarom hij het nu wel doet
            } else if (jokers % 4 == 2) {
                jokers -= 1;
                AiWIN = true;
            } else if (jokers % 4 == 3) {
                jokers -= 2;
                AiWIN = true;
            }
            AIjokers -= jokers;
        }
        if (!isGeldig()) { // ! niet geldig dan geen jokers weghalen
            AIjokers = 0;
        }
    }

    public void winLose(Graphics g) { // hier mee teken ik de win of lose op het scherm
        if (AiWIN && jokers <= 0) {
            g.drawString("YOU CAN'T BEAT THE JOKER........", 350, 50);
            g.drawImage(jokerwin, 70, 60, 710, 800, this); //gif lachend
        } else if (!AiWIN && jokers <= 0) {
            g.drawString("NEXT TIME THE JOKER WILL WIN.......", 350, 50);
            g.drawImage(jokerlose, 70, 60, 710, 800, this); //gif klappend
        }
    }


    class textvak implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            playerinput = Integer.parseInt(input.getText());
            if (isGeldig()) {
                jokers -= playerinput;
                AI(); // ai aan zet
            }

            repaint(); // hiermee repaint hij de jokers op het scherm
            input.setText(""); // hiermee krijg je een leeg tekstvak
        }
    }
}
