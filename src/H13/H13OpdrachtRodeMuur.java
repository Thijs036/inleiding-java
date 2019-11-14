
package H13;

import java.awt.*;
import java.applet.*;

public class H13OpdrachtRodeMuur extends Applet{
    public void init(){

    }
    public void paint(Graphics g){
        int x = 20;
        int y = 20;
        int width = 40;
        int height= 20;

        tekenRodeMuur(g, x, y, width, height);

    }
    void tekenRodeMuur(Graphics g, int x, int y, int width, int height){
        for (int i = 0; i < 10; i++) {
            x = 20;
            for (int j = 0; j < 15; j++) {
                g.setColor(Color.RED);
                g.fillRect(x, y, width, height);
                g.setColor(Color.BLACK);
                g.drawRect(x, y, width, height);
                x += width;
            }
            y += height;
        }
    }
}