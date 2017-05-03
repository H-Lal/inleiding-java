package h11;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Vinci on 11-4-2017.
 */
public class Herhalen3 extends Applet {

    public void paint(Graphics g){
        int nummer0= 0;
        int nummer1= 1;
        int Liberabaci;
        int y = 20;

        for (Liberabaci = 0; Liberabaci < 600; Liberabaci++ ){
            Liberabaci = nummer0 + nummer1;
            nummer0 = nummer1;
            nummer1 = Liberabaci;
            y+=20;
            g.drawString(" "+  Liberabaci ,50,y);
        }
    }
}
