package H12;

import java.applet.Applet;
import java.awt.*;

public class H12Opdracht1 extends Applet {
    int[] getallen = { 5, 33, 58, 5461, 76000, 12, 800, 24, 75654, 40};
    int gemiddelde;

    public void init() {
        setBackground(Color.RED);
    }

    public void paint(Graphics g) {
        for(int teller = 0; teller < getallen.length; teller++) {
            g.drawString("" + getallen[teller], 10, 30+(teller*15));
            gemiddelde += getallen[teller];
        }
        gemiddelde /= getallen.length;
        g.drawString("Gemiddelde is " + gemiddelde, 30, 180);
    }
}