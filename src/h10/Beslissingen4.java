package h10;

/**
 * Created by Vinci on 21-3-2017.
 */
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Beslissingen4 extends Applet {
    TextField tekstvak1;
    TextField tekstvak2;
    Label label1;
    Label label2;
    String tekst, s, dagen, jaar;
    int maand, jaarschrikkel, schrikkeljaar, schrikkeljaarfalse;

    public void init(){

        Listen v1 = new Listen();
        label1 = new Label("type in dit vak uw maand");
        tekstvak1 = new TextField("",20);
        tekstvak1.addActionListener(v1);
        add(label1);
        add(tekstvak1);

        label2 = new Label("type in dit vak uw jaar");
        tekstvak2 = new TextField("",20);
        tekstvak2.addActionListener(v1);
        add(label2);
        add(tekstvak2);
    }
    public void paint (Graphics g){
        g.drawString("de maand: "+tekst,50,120);
        g.drawString("heeft "+dagen+"",170,120);
    }
    class Listen implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak1.getText();
            jaar = tekstvak2.getText();
            maand = Integer.parseInt(s);
            jaarschrikkel = Integer.parseInt(jaar);
            schrikkeljaar = jaarschrikkel %4;
            schrikkeljaarfalse = jaarschrikkel %400;
            switch (maand) {
                case 1:
                    tekst = "januari ";
                    dagen ="31 dagen";
                    break;
                case 2:
                    tekst = "februari ";
                    if ( (schrikkeljaar % 4 == 0 && !(schrikkeljaarfalse % 100 == 0)) ||
                            jaarschrikkel % 400 == 0 ) {
                        dagen = "29 dagen";
                    }
                    else {
                        dagen = "28 dagen";
                    }
                    break;
                case 3:
                    tekst = "maart ";
                    dagen ="31 dagen";
                    break;
                case 4:
                    tekst = "april";
                    dagen =" 30 dagen";
                    break;
                case 5:
                    tekst = "mei ";
                    dagen ="31 dagen";
                    break;
                case 6:
                    tekst = "juni ";
                    dagen = "30 dagen";
                    break;
                case 7:
                    tekst = "juli ";
                    dagen="31 dagen";
                    break;
                case 8:
                    tekst = "augustus ";
                    dagen="31 dagen";
                    break;
                case 9:
                    tekst = "september ";
                    dagen="30 dagen";
                    break;
                case 10:
                    tekst = "oktober ";
                    dagen="31 dagen";
                    break;
                case 11:
                    tekst = "november ";
                    dagen ="30 dagen";
                    break;
                case 12:
                    tekst = "december ";
                    dagen="31 dagen";
                    break;
                default:
                    tekst = "Verkeerd nummer";
                    break;
            }
            repaint();
        }
    }

}



