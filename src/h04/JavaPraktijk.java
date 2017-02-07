package h04;

//Java Praktijkopdracht

import java.awt.*;
import java.applet.*;

public class JavaPraktijk extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawLine(05, 20, 120, 20);
        g.drawString("lijn", 57, 35 );
        g.drawRect(05, 40, 120, 50);
        g.drawString("Rechthoek", 40, 110 );
        g.drawRoundRect(05, 120, 120, 50, 30, 30);
        g.drawString("Afgeronde Rechthoek", 10, 190 );
        g.setColor(Color.magenta);
        g.fillRect(160, 40, 120, 50);
        g.fillOval(160,120,120,50); //gevulde ovaal
        g.fillArc(310, 40, 120, 50, 0, 45);//Arc
        g.setColor(Color.black);
        g.drawOval(160,40,120,50);
        g.drawString("Gevulde Rechthoek met ovaal", 140, 110 );
        g.drawString("Gevulde ovaal", 180, 190 );
        g.drawOval(340, 120, 65, 65);
        g.drawString("Cirkel", 355, 200 );
        g.drawOval(310,40,120,50);
        g.drawString("Taartpunt met ovaal er omheen", 310, 110 );





    }

}