package H12;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class H12Opdracht3 extends Applet {
    TextField[] tekstvak = new TextField[5];
    Button knop = new Button("OK");

    public void init() {
        for (int teller = 0; teller < tekstvak.length; teller++) {
            tekstvak[teller] = new TextField("", 20);
            add(tekstvak[teller]);
        }
        knop.addActionListener(new KnopListener());
        add(knop);
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int[] getallen = new int[tekstvak.length];
            for (int i = 0; i < tekstvak.length; i++) {
                getallen[i] = Integer.parseInt(tekstvak[i].getText());
            }
            Arrays.sort(getallen);
            for (int i = 0; i < tekstvak.length; i++) {
                tekstvak[i].setText("" + getallen[i]);
            }
        }
    }
}