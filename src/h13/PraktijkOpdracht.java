package h13;
import java.applet.Applet;
import java.awt.*;

/**
 * Created by Vinci on 13-9-2017.
 */
public class PraktijkOpdracht extends Applet{
    int x = 0, y = 0, width = 40, height = 40, x1 = 40, y1=99;


    @Override
    public void paint (Graphics g){
        setSize(1000, 900);
        drawtree(g,0,0);

    }

    public void drawtree (Graphics g, int x, int y) {
        for (int line = 0; line < 2; line++) {
            for (int row = 0; row < 5; row++) {

                thingsneededforthetree(g, x, y);
                x += 180;
                y1 = 99 + 220 * line;
                x1 = 40 + 180 * row ;
        }
            y = 20+ 200;
            x = 0;
        }
    }
    public void thingsneededforthetree (Graphics g, int x, int y){
        g.setColor(Color.darkGray);
        g.fillRect(x1,y1,20,100);
        g.setColor(Color.green);
        g.fillArc(x,y,100,100,0,360);


    }

}

