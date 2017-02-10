package h05;
//Java staafdiagram
import javax.xml.soap.Text;
import java.awt.*;
import java.applet.*;
import java.awt.Color;
import java.awt.Graphics;

public class Variabelen2 extends Applet {
    int yas;
    int width;
    int getallenlijn;
    int nulpunt, yas_valerie, yas_jeroen, yas_hans;
    int jeroen;
    int valerie;
    int hans;

    public void init() {
    yas= 150;
    width= 50;
    getallenlijn= 193;
    nulpunt=180;
    jeroen = 80;
    hans = 100;
    valerie = 60;
    yas_valerie= nulpunt - valerie;
    yas_hans= nulpunt - hans;
    yas_jeroen= nulpunt - jeroen;
    }


    public void paint(Graphics g) {
        g.setColor(Color.cyan);
        g.fillRect(40,yas_hans,width,hans); //Hans 80kg
        g.drawString("Hans", 40, 200 );
        g.setColor(Color.green);
        g.fillRect(90,yas_jeroen,width,jeroen); //Jeroen 100kg
        g.drawString("Jeroen", 90, 200 );
        g.setColor(Color.magenta);
        g.fillRect(140,yas_valerie,width,valerie); //Valerie 40 kg
        g.drawString("Valerie", 150, 200 );
        g.setColor(Color.BLACK);
        g.fillRect(190,80,1,100);
        g.drawString("100kg", getallenlijn, 80 );
        g.drawString("80kg", getallenlijn, 100 );
        g.drawString("60kg", getallenlijn,120 );
        g.drawString("40kg", getallenlijn, 140 );
        g.drawString("20kg", getallenlijn, 160 );
        g.drawString("0kg", getallenlijn, 180 );
    }

}

