package h10;

/**
 * Created by Vinci on 21-3-2017.
 */
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Praktijkopdracht extends Applet {
    TextField tekstvak;
    Label label;
    String s,tekst;
    int getal;

    public void init(){
        tekstvak = new TextField("",5);
        label = new Label("type uw getal en druk op enter");
        tekstvak.addActionListener(new Listen());
        tekst ="";
        add(label);
        add (tekstvak);
    }
    public void paint(Graphics g) {
        g.drawString(tekst, 50, 60);
    }
    class Listen implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s= tekstvak.getText();
            getal = Integer.parseInt(s);
            switch(getal) {
                case 1:
                    tekst = "Slecht";
                    break;
                case 2:
                    tekst = "Slecht";
                    break;
                case 3:
                    tekst = "Slecht";
                    break;
                case 4:
                    tekst = "Onvoldoende";
                    break;
                case 5:
                    tekst = "Matig";
                    break;
                case 6:
                    tekst = "Voldoende";
                    break;
                case 7:
                    tekst = "Voldoende";
                    break;
                case 8:
                    tekst = "Goed";
                    break;
                case 9:
                    tekst = "Goed";
                    break;
                case 10:
                    tekst = "Goed";
                    break;

                default:
                    tekst = "u heeft een verkeerd nummer ingetikt";
                    break;
            }
            repaint();


        }

    }
}