package Toets;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

/**
 * Created by Vinci on 13-10-2017.
 */
public class FruitAutomaat extends Applet {

    int kreditpunten = 10;
    int totaalpunten, puntengewonnen, one, two, three;
    double r;
    String[] fruit = {"fruit_1.jpg", "fruit_2.jpg", "fruit_3.jpg", "fruit_4.jpg", "fruit_5.jpg", "fruit_6.jpg", "fruit_7.jpg", "fruit_8.jpg", "fruit_9.jpg", "fruit_10.jpg", "fruit_11.jpg", "fruit_12.jpg", "fruit_13.jpg", "fruit_14.jpg", "fruit_15.jpg", "fruit_16.jpg", "fruit_17.jpg", "fruit_18.jpg", "fruit_19.jpg", "fruit_20.jpg",};
    Image een, twee, drie;
    Button koop, speel;
    boolean jackie, points;

    public void init() {
        setSize(600, 400); // size van de applet

        speel = new Button(); //button speel
        speel.setLabel("Speel");
        KnopListenerspeel aa = new KnopListenerspeel();
        speel.addActionListener(aa);
        add(speel);

        koop = new Button(); // button koop
        koop.setLabel("Koop 10 punten");
        KnopListenerkoop bb = new KnopListenerkoop();
        koop.addActionListener(bb);
        koop.setEnabled(false);
        add(koop);
    }

    public void paint(Graphics g) {
        totaalpunten = kreditpunten;
        g.drawString("Aantal punten = " + totaalpunten, 100, 300); //strings
        getGraphics().drawString("Aantal gewonnen punten = "+ puntengewonnen, 100, 320); //strings
        slotmachine();
        if (jackie == true){
            getGraphics().drawString("JACKPOT", 200, 200); //strings
        }
    }


    public void aray() {
        r = Math.random();
        one = (int) (r * 20);
        r = Math.random();
        two = (int) (r * 20);
        r = Math.random();
        three = (int) (r * 20);
        repaint();

    }

    public void slotmachine() {
        URL pad = FruitAutomaat.class.getResource("/resources/");
        een = getImage(pad, "" + fruit[one]);
        twee = getImage(pad, "" + fruit[two]);
        drie = getImage(pad, "" + fruit[three]);

        getGraphics().drawImage(een, 190, 30, this);
        getGraphics().drawImage(twee, 260, 30, this);
        getGraphics().drawImage(drie, 330, 30, this);

    }
    public void berekening(){
        if (totaalpunten > 0 ) {
             if (een == twee && twee == drie) {
                kreditpunten +=20;
                puntengewonnen += 20;
                jackie = true;
            }else if (een == twee || een == drie || twee == drie) {
                puntengewonnen += 4;
                kreditpunten += 4;
            }
            if (totaalpunten == 1) {
                koop.setEnabled(true);
                speel.setEnabled(false);
            }
            repaint();
        }
    }

    class KnopListenerspeel implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            points = true;
            kreditpunten -= 1;
            aray();
            slotmachine();
            berekening();
            repaint();
        }
    }

    class KnopListenerkoop implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            kreditpunten+=10;
            speel.setEnabled(true);
            koop.setEnabled(false);
            repaint();
        }
    }
}