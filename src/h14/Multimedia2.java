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
public class Multimedia2 extends Applet {
    String kleuren[] = new String[4]; //kleuren van de kaarten
    String kaarten[] = new String[13]; //hoeveel kaarten
    String speler1[] = new String[13];
    String speler2[] = new String[13];
    String speler3[] = new String[13];
    String speler4[] = new String[13];
    String deck[] = new String[52];
    int p1x = 0,p1y = 0;
    int p2x = 200, p2y = 0;
    int p3x = 400, p3y = 0;
    int p4x = 600, p4y = 0;


    public void init() {
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


    }


    private String deelkleuren() {
        int random = new Random().nextInt(kleuren.length);
        String kaart = kleuren[random];

        //vervang de inhoud van deck
        String[] hulpLijst = new String[kleuren.length - 1];
        int hulpindex = 0;
        for (int i = 0; i < kleuren.length; i++) {
            if (i != random) {
                hulpLijst[hulpindex] = kleuren[i];
                hulpindex++;
            }
        }
        deck = hulpLijst;
        return kaart;
    }

    private String deelkaarten() {
        int random = new Random().nextInt(kaarten.length);
        String kaart = kaarten[random];

        //vervang de inhoud van deck
        String[] hulpLijst = new String[kaarten.length - 1];
        int hulpindex = 0;
        for (int i = 0; i < kaarten.length; i++) {
            if (i != random) {
                hulpLijst[hulpindex] = kaarten[i];
                hulpindex++;
            }
        }
        deck = hulpLijst;
        return kaart;

    }

    @Override
    public void paint(Graphics g) {
        setSize(800, 700);
        for (int i = 0; i <13 ; i++) {
            g.drawString("" + deelkleuren()+ " " + deelkaarten(), p1x, p1y);
            p1y += 20;
        }
        for (int i = 0; i <13 ; i++) {
            g.drawString("" + deelkleuren()+ " " + deelkaarten(), p2x, p2y);
            p2y += 20;

        }
        for (int i = 0; i <13 ; i++) {
            g.drawString("" + deelkleuren()+ " " + deelkaarten(), p3x, p3y);
            p3y += 20;
        }
        for (int i = 0; i <13 ; i++) {
            g.drawString("" + deelkleuren()+ " " + deelkaarten(), p4x, p4y);
            p4y += 20;
        }
        p1y=10;
        p2y=10;
        p3y=10;
        p4y=10;
    }


}





