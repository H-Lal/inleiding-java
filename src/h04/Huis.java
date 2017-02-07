package h04;
//JavaHuis

import java.awt.*;
import java.applet.*;

public class Huis extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.magenta);
        g.setColor(Color.green);
        g.fillRect(80, 80, 100, 150); //huis
        g.setColor(Color.orange);
        g.fillRect(150, 180, 20, 50); //deur
        g.setColor(Color.cyan);
        g.fillRect(120, 120, 40, 40); //raambovendeur
        g.setColor(Color.cyan);
        g.fillRect(90, 180, 50, 40); //raamnaastdeur
        g.setColor(Color.black);
        g.fillPolygon(new int[] {50, 125, 210}, new int[] {90, 40, 90}, 3);
    }
}