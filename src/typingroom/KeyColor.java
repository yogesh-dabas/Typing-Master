package typingroom;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;

/**
 *
 * @author Yogesh Dabas
 */

/*This class Trigger takes the label and color to change its color for 300ns*/
public class KeyColor extends Thread {

    JLabel l;
    Color color;

    public KeyColor(JLabel l, Color c) {
        this.l = l;
        this.color = c;
    }

    public void run() {
        l.setForeground(color);
        l.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
        }
        l.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        l.setForeground(Color.black);
    }

}
