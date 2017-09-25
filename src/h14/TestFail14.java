package h14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class TestFail14 extends Applet {


    private Image joker;
    private Image jokerlose;
    private Image jokerwin;
//    private Image jokerwhy;
    private URL pad;
    TextField input;
    int jokers = 23;
    int invoer;
    boolean error = false;
    boolean turn;
    int AIaantal = 0;
    Boolean WIN;
    Boolean LOSE;


    public void init() {
        setSize(1000, 1000);
        pad = TestFail14.class.getResource("/resources/");
        joker = getImage(pad, "joker.jpg");
        jokerlose = getImage(pad, "uwin.gif");
        jokerwin = getImage(pad, "iwon.gif");
//        jokerwhy = getImage(pad, "why.gif");
        input = new TextField("", 50);
        textfield();
    }


    public void paint(Graphics g) {

        g.drawString("Typ een cijfer van 1-3 in", 200, 100);

        int x = 100;
        int y = 100;

        for (int i = 0; i < jokers; i++) {
            x += 100;

            g.drawImage(joker, x, y, 100, 100, this);
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

        if (error == false) {
            g.drawString("Aantal Jokers: " + jokers, 500, 100);
        } else {

            error = false;
        }
    }

    public void computerAI() {
            if (jokers % 4 == 3) {
                jokers -= 2;
            }
            if (jokers % 4 == 2) {
                jokers -= 1;
            }
            if (jokers % 4 == 1) {
                jokers -= (int) (Math.random() * 3) + 1;
//                int range = Math.abs(1 - 3) + 3;
//                jokers -= x;
            }
            if (jokers % 4 == 0) {
                jokers -= 3;

            }
        turn = false;

    }

    public void textfield() {
        input = new TextField(8);
        add(input);
        Listen aa = new Listen();
        input.addActionListener(aa);
    }

    public void error() {
         WIN= true;
        getGraphics().drawString("DON'T TEST THE JOKER..... FILL SOMETHING IN THAT MAKES SENSE", 400, 100);
        error = false;
    }

    public void berekening() {


    }

        public void uwin() {
        if (jokers <= 0) {
            WIN = true;
            getGraphics().drawString("NEXT TIME THE JOKER WILL WIN.......", 40, 50);
            getGraphics().drawImage(jokerlose, 100, 100, 1000, 600, this);
        }
    }
    public void ulose() {
        if (jokers == 1) {
            LOSE = true;
            getGraphics().drawString("YOU CAN'T BEAT THE JOKER........", 40, 50);
            getGraphics().drawImage(jokerlose, 100, 100, 1000, 600, this);
        }
    }
    public void imagewin() {
        getGraphics().drawImage(jokerwin, 100, 100, 1000, 600, this);
    }

    public void imagelose() {
        getGraphics().drawImage(jokerlose, 100, 100, 1000, 600, this);
    }

    class Listen implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            invoer = (Integer.parseInt(input.getText()));
            if (invoer < 0 || invoer > 3) {
                turn = false;
                error();
            } else {
                jokers -= invoer;
                turn = true;
            }
            ulose();
            uwin();
            computerAI();
        }
    }
}