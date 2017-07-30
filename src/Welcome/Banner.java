package Welcome;

import javax.swing.JLabel;

/**
 *
 * @author Yogesh Dabas
 */
public class Banner implements Runnable {

    String text = "Developed by Yogesh Dabas                    ";
    JLabel l;
    boolean stop=false;

    Banner(JLabel l) {
        this.l = l;
    }

    public void run() {
        while (true) {
            l.setText(text);
            char ch = text.charAt(0);
            text = text.substring(1, text.length()) + ch;
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) { 
            }
            if(stop){
                break;
            }
        }
    }
    public void stop(){
        stop=true;
    }

}
