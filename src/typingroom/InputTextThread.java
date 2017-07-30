package typingroom;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

public class InputTextThread implements Runnable {

    TypingRoom a;
    String[] s;

    InputTextThread(TypingRoom a, String[] s) {
        this.a = a;
        this.s = s;
    }

    public void run() {

        for (int i = 0; i < s.length; i++) {

            //Add line to textPanel
            a.i_line1.setText(s[i]);

            //refresh TypingRoom screen
            a.setVisible(true);

            //wait till user write the given line
            synchronized (a.waitToWrite) {
                try {
                    a.waitToWrite.wait();
                } catch (Exception e) {
                }
            }
        }
        JOptionPane.showMessageDialog(a, "Lesson Completed!!\nNo. of Errors: " + a.getNoOfErrors(), "Lesson Completed", INFORMATION_MESSAGE);
        a.dispose();
    }
}
