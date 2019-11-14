package H13;

import java.awt.*;
import java.applet.*;

public class H13PraktijkBoomTekenen extends Applet{
    public void init(){

    }
    public void paint(Graphics g){

        tekenBoom(g, 50, 50);
    }
    void tekenBoom(Graphics g, int x, int y){
        g.setColor(new Color(120, 87, 30));
        g.fillRect(x, y, 20, 80);
        g.setColor(Color.green);
        g.fillArc(x - 30, y - 40, 80, 50, 0, 360);
    }
}