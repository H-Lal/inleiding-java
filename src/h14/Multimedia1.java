package h14;

import java.awt.*;
import java.applet.*;
/*import java.net.URL;
import  java.net.*;*/
import java.awt.event.*;
import java.util.Random;

/**
 * Created by Vinci on 13-9-2017.
 */
public class Multimedia1 extends Applet {
    Button knop;
    boolean click;
    String[] kaarten = new String[13];
    String[] kleuren = new String[4];


    public void init(){

        kleuren[0] = "Harten"; //<Kaartsoorten>
        kleuren[1] = "Klaver";
        kleuren[2] = "Ruiten";
        kleuren[3] = "Schoppen"; //</Kaartsoorten>

        kaarten[0] = "Aas"; //<Kaartnummers>
        kaarten[1] = "Twee";
        kaarten[2] = "Drie";
        kaarten[3] = "Vier";
        kaarten[4] = "Vijf";
        kaarten[5] = "Zes";
        kaarten[6] = "Zeven";
        kaarten[7] = "Acht";
        kaarten[8] = "Negen";
        kaarten[9] = "tien";
        kaarten[10] = "Boer";
        kaarten[11] = "Koningin";
        kaarten[12] = "Koning"; //</kaartnummers>

        button();

    }

    private String deelCijfer() {
        int random = new Random().nextInt(kaarten.length);
        String kaart = kaarten[random];

        //vervang de inhoud van deck
        String[] hulpLijst = new String[kaarten.length];
        int hulpindex = 0;
        for (int i = 0; i < kaarten.length; i++) {
            if (i != random) {
                hulpLijst[hulpindex] = kaarten[i];
                hulpindex++;
            }
        }
        kaarten = hulpLijst;
        return kaart;
    }

    private String deelKleur() {
        int random = new Random().nextInt(kleuren.length);
        String kaart = kleuren[random];

        //vervang de inhoud van deck
        String[] hulpLijst = new String[kleuren.length ];
        int hulpindex = 0;
        return kaart;
    }

    public void paint(Graphics g) {
        if (click == true) {
            g.drawString("" + deelKleur() + " " + deelCijfer() , 50,60);
        }
    }



    public void button() {
        knop = new Button("Random kaart");
        add(knop);
        knop.addActionListener(new KnopListener());
    }

    class KnopListener implements ActionListener {

        public void actionPerformed (ActionEvent e) {
            click = true;
            repaint();
        }
    }
}



