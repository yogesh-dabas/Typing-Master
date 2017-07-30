package Welcome;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import typingroom.TypingRoom;

/**
 *
 * @author Yogesh Dabas
 */
public class WelcomePage extends javax.swing.JFrame {

    public static String Username;
    Object waitForEnter;
    Thread bannerThread;

    public WelcomePage(Object waitForEnter) {
        super("Typing Master");
        initComponents();
        Banner b=new Banner(banner);
        bannerThread=new Thread(b);
        bannerThread.start();
        
        this.waitForEnter = waitForEnter;
        setVisible(true);
        setSize(860, 630);
        setLocationRelativeTo(null);
        close.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent e) {
                b.stop();
                dispose();
            }
        });
        enter.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent e) {
                if (name.getText().equals("")) {
                    JOptionPane.showMessageDialog(rootPane, "Please Enter your name.", "User Name Requiresd", JOptionPane.ERROR_MESSAGE);
                } else {
                    dispose();
                    bannerThread.stop();
                    String[] s = new String[3];
                s[0] = "Hello Yogesh";
                s[1] = "Iam Dabas";
                s[2] = "!!";
                TypingRoom r = new TypingRoom(s);
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        enter = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        oldName1 = new javax.swing.JLabel();
        oldName2 = new javax.swing.JLabel();
        banner = new javax.swing.JLabel();
        BackImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(enter);
        enter.setBounds(460, 510, 120, 30);
        getContentPane().add(close);
        close.setBounds(780, 40, 20, 20);

        name.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        getContentPane().add(name);
        name.setBounds(290, 190, 250, 30);
        getContentPane().add(oldName1);
        oldName1.setBounds(300, 230, 230, 30);
        getContentPane().add(oldName2);
        oldName2.setBounds(300, 260, 230, 30);
        getContentPane().add(banner);
        banner.setBounds(300, 344, 230, 20);

        BackImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Home-picsay.jpg"))); // NOI18N
        BackImage.setText("dvx");
        getContentPane().add(BackImage);
        BackImage.setBounds(0, 0, 850, 592);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackImage;
    public javax.swing.JLabel banner;
    private javax.swing.JLabel close;
    private javax.swing.JLabel enter;
    private javax.swing.JTextField name;
    private javax.swing.JLabel oldName1;
    private javax.swing.JLabel oldName2;
    // End of variables declaration//GEN-END:variables

}
