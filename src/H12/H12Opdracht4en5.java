
package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H12Opdracht4en5 extends Applet implements ActionListener {

    TextField tekstvak;
    Button knop;
    boolean gevonden;
    boolean geklikt;
    int index;

    int[] getallen = {5, 10, 15, 20, 25, 30};

    public void init() {
        tekstvak = new TextField(10);
        add(tekstvak);

        knop = new Button("OK");
        knop.addActionListener(this);
        add(knop);

        gevonden = false;
    }

    public void paint(Graphics g) {
        if (geklikt) {
            if (gevonden) {
                g.drawString("De waarde is gevonden op index " + index, 50, 80);
            } else {
                g.drawString("De waarde is niet gevonden", 50, 80);
            }
        }
    }
        public void actionPerformed(ActionEvent e) {
            gevonden = false;
            int input = Integer.parseInt(tekstvak.getText());
            geklikt = true;

            for (int teller = 0; teller < getallen.length; teller++) {
                if (getallen[teller] == input) {
                    gevonden = true;
                    index = teller;
                    break;
                }
            }
            repaint();
        }
    }
