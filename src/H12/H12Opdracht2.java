package H12;

import java.applet.Applet;
import java.awt.*;

public class H12Opdracht2 extends Applet {

    Button[] knop = new Button[25];

    public void init() {

        int teller;
        for (teller = 0; teller < knop.length; teller++) {
            knop[teller] = new Button("knop" + (teller + 1));
            add(knop[teller]);
        }
    }

    @Override
    public void paint(Graphics g) {
    }
}