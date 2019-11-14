package H13;

import java.awt.*;
import java.applet.*;

public class H13PraktijkBoomTekenen2 extends Applet{
    int x = 50;
    int y = 50;
    int width = 20;
    int height = 80;
    int width1 = 80;
    int height1 = 50;

    public void paint(Graphics g){

        for (int i = 0; i < 5; i++) {
            tekenBoom(g, x, y);
            x += width;
            x += width1;
            for (int j = 0; j < 2; j++) {
                tekenBoom(g, x, y);
            }
            y += height1;
        }
    }
    void tekenBoom(Graphics g, int x, int y){
        g.setColor(new Color(120, 87, 30));
        g.fillRect(x, y, width, height);
        g.setColor(Color.green);
        g.fillArc(x - 30, y - 40, width1, height1, 0, 360);
    }
}