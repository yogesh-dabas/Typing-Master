package typingroom;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JLabel;

public class TypingRoom extends javax.swing.JFrame implements KeyListener {

    String refreshScreen = new String();
    String waitToWrite = new String();

    Thread itt;
    String[] s;
    
    char ch;
    int i = 0, j = 0;
    int no_of_error = 0;

    public TypingRoom(String s[]) {
        super("Typing Room");
        initComponents();
        setSize(860, 630);
        this.setVisible(true);
        setLocationRelativeTo(null);

        this.s = s;

        //Thread giving input text
        InputTextThread itd = new InputTextThread(this, s);
        itt = new Thread(itd);
        itt.start();

        w_line1.setText("");
        t1.addKeyListener(this);
    }

    public int getNoOfErrors() {
        return no_of_error;
    }

    public Thread getThread() {
        return itt;
    }

    @Override
    public void keyTyped(KeyEvent e) {

        ch = e.getKeyChar();
        JLabel l = new FindKey(this).getJLabel(ch);

        if (ch == s[i].charAt(j)) {

            //change label l to blue color id=2
            new KeyColor(l, Color.blue).start();

            w_line1.setText(w_line1.getText() + ch);
            j++;
        } else {
            //Change label l to red color id=1
            new KeyColor(l, Color.red).start();

            no_of_error++;
        }
        if (j == s[i].length()) {//start reading next line
            j = 0;
            i++;
            w_line1.setText("");
            synchronized (waitToWrite) {
                waitToWrite.notify();
            }
        }
        t1.setText("");
        //refresh TypingRoom screen
        setVisible(true);
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        keyboard = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        aq = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        aw = new javax.swing.JLabel();
        ae = new javax.swing.JLabel();
        ar = new javax.swing.JLabel();
        at = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        ay = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        au = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        ai = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        ao = new javax.swing.JLabel();
        ap = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        aa = new javax.swing.JLabel();
        as = new javax.swing.JLabel();
        ad = new javax.swing.JLabel();
        af = new javax.swing.JLabel();
        ag = new javax.swing.JLabel();
        ah = new javax.swing.JLabel();
        aj = new javax.swing.JLabel();
        ak = new javax.swing.JLabel();
        al = new javax.swing.JLabel();
        n1 = new javax.swing.JLabel();
        n2 = new javax.swing.JLabel();
        n3 = new javax.swing.JLabel();
        n4 = new javax.swing.JLabel();
        n5 = new javax.swing.JLabel();
        n6 = new javax.swing.JLabel();
        n7 = new javax.swing.JLabel();
        n8 = new javax.swing.JLabel();
        n9 = new javax.swing.JLabel();
        n0 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        az = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        ax = new javax.swing.JLabel();
        ac = new javax.swing.JLabel();
        av = new javax.swing.JLabel();
        ab = new javax.swing.JLabel();
        an = new javax.swing.JLabel();
        am = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        space = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        i_line1 = new javax.swing.JLabel();
        w_line1 = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(255, 255, 102));
        getContentPane().setLayout(null);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(10, 248, 834, 10);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(10, 176, 830, 10);

        jLabel42.setBackground(new java.awt.Color(255, 255, 153));
        jLabel42.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel42.setText(" ;");
        jLabel42.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel42.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel42.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel42.setPreferredSize(new java.awt.Dimension(50, 50));

        aq.setBackground(new java.awt.Color(255, 255, 153));
        aq.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        aq.setText(" Q");
        aq.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        aq.setMaximumSize(new java.awt.Dimension(50, 50));
        aq.setMinimumSize(new java.awt.Dimension(50, 50));
        aq.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel43.setBackground(new java.awt.Color(255, 255, 153));
        jLabel43.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel43.setText(" '");
        jLabel43.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel43.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel43.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel43.setPreferredSize(new java.awt.Dimension(50, 50));

        aw.setBackground(new java.awt.Color(255, 255, 153));
        aw.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        aw.setText(" W");
        aw.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        aw.setMaximumSize(new java.awt.Dimension(50, 50));
        aw.setMinimumSize(new java.awt.Dimension(50, 50));
        aw.setPreferredSize(new java.awt.Dimension(50, 50));

        ae.setBackground(new java.awt.Color(255, 255, 153));
        ae.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        ae.setText(" E");
        ae.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ae.setMaximumSize(new java.awt.Dimension(50, 50));
        ae.setMinimumSize(new java.awt.Dimension(50, 50));
        ae.setPreferredSize(new java.awt.Dimension(50, 50));

        ar.setBackground(new java.awt.Color(255, 255, 153));
        ar.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        ar.setText(" R");
        ar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ar.setMaximumSize(new java.awt.Dimension(50, 50));
        ar.setMinimumSize(new java.awt.Dimension(50, 50));
        ar.setPreferredSize(new java.awt.Dimension(50, 50));

        at.setBackground(new java.awt.Color(255, 255, 153));
        at.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        at.setText(" T");
        at.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        at.setMaximumSize(new java.awt.Dimension(50, 50));
        at.setMinimumSize(new java.awt.Dimension(50, 50));
        at.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel44.setBackground(new java.awt.Color(255, 255, 153));
        jLabel44.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel44.setText(" [");
        jLabel44.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel44.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel44.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel44.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel45.setBackground(new java.awt.Color(255, 255, 153));
        jLabel45.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel45.setText(" ]");
        jLabel45.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel45.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel45.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel45.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel46.setBackground(new java.awt.Color(255, 255, 153));
        jLabel46.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel46.setText(" /");
        jLabel46.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel46.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel46.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel46.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel47.setBackground(new java.awt.Color(255, 255, 153));
        jLabel47.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel47.setText("   Enter");
        jLabel47.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel47.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel47.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel47.setPreferredSize(new java.awt.Dimension(50, 50));

        ay.setBackground(new java.awt.Color(255, 255, 153));
        ay.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        ay.setText(" Y");
        ay.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ay.setMaximumSize(new java.awt.Dimension(50, 50));
        ay.setMinimumSize(new java.awt.Dimension(50, 50));
        ay.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel48.setBackground(new java.awt.Color(255, 255, 153));
        jLabel48.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel48.setText(" \\");
            jLabel48.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jLabel48.setMaximumSize(new java.awt.Dimension(50, 50));
            jLabel48.setMinimumSize(new java.awt.Dimension(50, 50));
            jLabel48.setPreferredSize(new java.awt.Dimension(50, 50));

            au.setBackground(new java.awt.Color(255, 255, 153));
            au.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
            au.setText(" U");
            au.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            au.setMaximumSize(new java.awt.Dimension(50, 50));
            au.setMinimumSize(new java.awt.Dimension(50, 50));
            au.setPreferredSize(new java.awt.Dimension(50, 50));

            jLabel49.setBackground(new java.awt.Color(255, 255, 153));
            jLabel49.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
            jLabel49.setText("   Backspace");
            jLabel49.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jLabel49.setMaximumSize(new java.awt.Dimension(50, 50));
            jLabel49.setMinimumSize(new java.awt.Dimension(50, 50));
            jLabel49.setPreferredSize(new java.awt.Dimension(50, 50));

            ai.setBackground(new java.awt.Color(255, 255, 153));
            ai.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
            ai.setText(" I");
            ai.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            ai.setMaximumSize(new java.awt.Dimension(50, 50));
            ai.setMinimumSize(new java.awt.Dimension(50, 50));
            ai.setPreferredSize(new java.awt.Dimension(50, 50));

            jLabel50.setBackground(new java.awt.Color(255, 255, 153));
            jLabel50.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
            jLabel50.setText("      Shift");
            jLabel50.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jLabel50.setMaximumSize(new java.awt.Dimension(50, 50));
            jLabel50.setMinimumSize(new java.awt.Dimension(50, 50));
            jLabel50.setPreferredSize(new java.awt.Dimension(50, 50));

            ao.setBackground(new java.awt.Color(255, 255, 153));
            ao.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
            ao.setText(" O");
            ao.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            ao.setMaximumSize(new java.awt.Dimension(50, 50));
            ao.setMinimumSize(new java.awt.Dimension(50, 50));
            ao.setPreferredSize(new java.awt.Dimension(50, 50));

            ap.setBackground(new java.awt.Color(255, 255, 153));
            ap.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
            ap.setText(" P");
            ap.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            ap.setMaximumSize(new java.awt.Dimension(50, 50));
            ap.setMinimumSize(new java.awt.Dimension(50, 50));
            ap.setPreferredSize(new java.awt.Dimension(50, 50));

            jLabel52.setBackground(new java.awt.Color(255, 255, 153));
            jLabel52.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
            jLabel52.setText("    Shift");
            jLabel52.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jLabel52.setMaximumSize(new java.awt.Dimension(50, 50));
            jLabel52.setMinimumSize(new java.awt.Dimension(50, 50));
            jLabel52.setPreferredSize(new java.awt.Dimension(50, 50));

            aa.setBackground(new java.awt.Color(255, 255, 153));
            aa.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
            aa.setText(" A");
            aa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            aa.setMaximumSize(new java.awt.Dimension(50, 50));
            aa.setMinimumSize(new java.awt.Dimension(50, 50));
            aa.setPreferredSize(new java.awt.Dimension(50, 50));

            as.setBackground(new java.awt.Color(255, 255, 153));
            as.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
            as.setText(" S");
            as.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            as.setMaximumSize(new java.awt.Dimension(50, 50));
            as.setMinimumSize(new java.awt.Dimension(50, 50));
            as.setPreferredSize(new java.awt.Dimension(50, 50));

            ad.setBackground(new java.awt.Color(255, 255, 153));
            ad.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
            ad.setText(" D");
            ad.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            ad.setMaximumSize(new java.awt.Dimension(50, 50));
            ad.setMinimumSize(new java.awt.Dimension(50, 50));
            ad.setPreferredSize(new java.awt.Dimension(50, 50));

            af.setBackground(new java.awt.Color(255, 255, 153));
            af.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
            af.setText(" F");
            af.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            af.setMaximumSize(new java.awt.Dimension(50, 50));
            af.setMinimumSize(new java.awt.Dimension(50, 50));
            af.setPreferredSize(new java.awt.Dimension(50, 50));

            ag.setBackground(new java.awt.Color(255, 255, 153));
            ag.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
            ag.setText(" G");
            ag.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            ag.setMaximumSize(new java.awt.Dimension(50, 50));
            ag.setMinimumSize(new java.awt.Dimension(50, 50));
            ag.setPreferredSize(new java.awt.Dimension(50, 50));

            ah.setBackground(new java.awt.Color(255, 255, 153));
            ah.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
            ah.setText(" H");
            ah.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            ah.setMaximumSize(new java.awt.Dimension(50, 50));
            ah.setMinimumSize(new java.awt.Dimension(50, 50));
            ah.setPreferredSize(new java.awt.Dimension(50, 50));

            aj.setBackground(new java.awt.Color(255, 255, 153));
            aj.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
            aj.setText(" J");
            aj.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            aj.setMaximumSize(new java.awt.Dimension(50, 50));
            aj.setMinimumSize(new java.awt.Dimension(50, 50));
            aj.setPreferredSize(new java.awt.Dimension(50, 50));

            ak.setBackground(new java.awt.Color(255, 255, 153));
            ak.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
            ak.setText(" K");
            ak.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            ak.setMaximumSize(new java.awt.Dimension(50, 50));
            ak.setMinimumSize(new java.awt.Dimension(50, 50));
            ak.setPreferredSize(new java.awt.Dimension(50, 50));

            al.setBackground(new java.awt.Color(255, 255, 153));
            al.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
            al.setText(" L");
            al.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            al.setMaximumSize(new java.awt.Dimension(50, 50));
            al.setMinimumSize(new java.awt.Dimension(50, 50));
            al.setPreferredSize(new java.awt.Dimension(50, 50));

            n1.setBackground(new java.awt.Color(255, 255, 153));
            n1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
            n1.setText(" 1");
            n1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            n1.setMaximumSize(new java.awt.Dimension(50, 50));
            n1.setMinimumSize(new java.awt.Dimension(50, 50));
            n1.setPreferredSize(new java.awt.Dimension(50, 50));

            n2.setBackground(new java.awt.Color(255, 255, 153));
            n2.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
            n2.setText(" 2");
            n2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            n2.setMaximumSize(new java.awt.Dimension(50, 50));
            n2.setMinimumSize(new java.awt.Dimension(50, 50));
            n2.setPreferredSize(new java.awt.Dimension(50, 50));

            n3.setBackground(new java.awt.Color(255, 255, 153));
            n3.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
            n3.setText(" 3");
            n3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            n3.setMaximumSize(new java.awt.Dimension(50, 50));
            n3.setMinimumSize(new java.awt.Dimension(50, 50));
            n3.setPreferredSize(new java.awt.Dimension(50, 50));

            n4.setBackground(new java.awt.Color(255, 255, 153));
            n4.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
            n4.setText(" 4");
            n4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            n4.setMaximumSize(new java.awt.Dimension(50, 50));
            n4.setMinimumSize(new java.awt.Dimension(50, 50));
            n4.setPreferredSize(new java.awt.Dimension(50, 50));

            n5.setBackground(new java.awt.Color(255, 255, 153));
            n5.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
            n5.setText(" 5");
            n5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            n5.setMaximumSize(new java.awt.Dimension(50, 50));
            n5.setMinimumSize(new java.awt.Dimension(50, 50));
            n5.setPreferredSize(new java.awt.Dimension(50, 50));

            n6.setBackground(new java.awt.Color(255, 255, 153));
            n6.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
            n6.setText(" 6");
            n6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            n6.setMaximumSize(new java.awt.Dimension(50, 50));
            n6.setMinimumSize(new java.awt.Dimension(50, 50));
            n6.setPreferredSize(new java.awt.Dimension(50, 50));

            n7.setBackground(new java.awt.Color(255, 255, 153));
            n7.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
            n7.setText(" 7");
            n7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            n7.setMaximumSize(new java.awt.Dimension(50, 50));
            n7.setMinimumSize(new java.awt.Dimension(50, 50));
            n7.setPreferredSize(new java.awt.Dimension(50, 50));

            n8.setBackground(new java.awt.Color(255, 255, 153));
            n8.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
            n8.setText(" 8");
            n8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            n8.setMaximumSize(new java.awt.Dimension(50, 50));
            n8.setMinimumSize(new java.awt.Dimension(50, 50));
            n8.setPreferredSize(new java.awt.Dimension(50, 50));

            n9.setBackground(new java.awt.Color(255, 255, 153));
            n9.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
            n9.setText(" 9");
            n9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            n9.setMaximumSize(new java.awt.Dimension(50, 50));
            n9.setMinimumSize(new java.awt.Dimension(50, 50));
            n9.setPreferredSize(new java.awt.Dimension(50, 50));

            n0.setBackground(new java.awt.Color(255, 255, 153));
            n0.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
            n0.setText(" 0");
            n0.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            n0.setMaximumSize(new java.awt.Dimension(50, 50));
            n0.setMinimumSize(new java.awt.Dimension(50, 50));
            n0.setPreferredSize(new java.awt.Dimension(50, 50));

            jLabel31.setBackground(new java.awt.Color(255, 255, 153));
            jLabel31.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
            jLabel31.setText(" -");
            jLabel31.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jLabel31.setMaximumSize(new java.awt.Dimension(50, 50));
            jLabel31.setMinimumSize(new java.awt.Dimension(50, 50));
            jLabel31.setPreferredSize(new java.awt.Dimension(50, 50));

            jLabel32.setBackground(new java.awt.Color(255, 255, 153));
            jLabel32.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
            jLabel32.setText(" =");
            jLabel32.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jLabel32.setMaximumSize(new java.awt.Dimension(50, 50));
            jLabel32.setMinimumSize(new java.awt.Dimension(50, 50));
            jLabel32.setPreferredSize(new java.awt.Dimension(50, 50));

            az.setBackground(new java.awt.Color(255, 255, 153));
            az.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
            az.setText(" Z");
            az.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            az.setMaximumSize(new java.awt.Dimension(50, 50));
            az.setMinimumSize(new java.awt.Dimension(50, 50));
            az.setPreferredSize(new java.awt.Dimension(50, 50));

            jLabel54.setBackground(new java.awt.Color(255, 255, 153));
            jLabel54.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
            jLabel54.setText(" Caps lock");
            jLabel54.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jLabel54.setMaximumSize(new java.awt.Dimension(50, 50));
            jLabel54.setMinimumSize(new java.awt.Dimension(50, 50));
            jLabel54.setPreferredSize(new java.awt.Dimension(50, 50));

            jLabel55.setBackground(new java.awt.Color(255, 255, 153));
            jLabel55.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
            jLabel55.setText(" tab");
            jLabel55.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jLabel55.setMaximumSize(new java.awt.Dimension(50, 50));
            jLabel55.setMinimumSize(new java.awt.Dimension(50, 50));
            jLabel55.setPreferredSize(new java.awt.Dimension(50, 50));

            ax.setBackground(new java.awt.Color(255, 255, 153));
            ax.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
            ax.setText(" X");
            ax.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            ax.setMaximumSize(new java.awt.Dimension(50, 50));
            ax.setMinimumSize(new java.awt.Dimension(50, 50));
            ax.setPreferredSize(new java.awt.Dimension(50, 50));

            ac.setBackground(new java.awt.Color(255, 255, 153));
            ac.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
            ac.setText(" C");
            ac.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            ac.setMaximumSize(new java.awt.Dimension(50, 50));
            ac.setMinimumSize(new java.awt.Dimension(50, 50));
            ac.setPreferredSize(new java.awt.Dimension(50, 50));

            av.setBackground(new java.awt.Color(255, 255, 153));
            av.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
            av.setText(" V");
            av.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            av.setMaximumSize(new java.awt.Dimension(50, 50));
            av.setMinimumSize(new java.awt.Dimension(50, 50));
            av.setPreferredSize(new java.awt.Dimension(50, 50));

            ab.setBackground(new java.awt.Color(255, 255, 153));
            ab.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
            ab.setText(" B");
            ab.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            ab.setMaximumSize(new java.awt.Dimension(50, 50));
            ab.setMinimumSize(new java.awt.Dimension(50, 50));
            ab.setPreferredSize(new java.awt.Dimension(50, 50));

            an.setBackground(new java.awt.Color(255, 255, 153));
            an.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
            an.setText(" N");
            an.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            an.setMaximumSize(new java.awt.Dimension(50, 50));
            an.setMinimumSize(new java.awt.Dimension(50, 50));
            an.setPreferredSize(new java.awt.Dimension(50, 50));

            am.setBackground(new java.awt.Color(255, 255, 153));
            am.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
            am.setText(" M");
            am.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            am.setMaximumSize(new java.awt.Dimension(50, 50));
            am.setMinimumSize(new java.awt.Dimension(50, 50));
            am.setPreferredSize(new java.awt.Dimension(50, 50));

            jLabel40.setBackground(new java.awt.Color(255, 255, 153));
            jLabel40.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
            jLabel40.setText(" ,");
            jLabel40.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jLabel40.setMaximumSize(new java.awt.Dimension(50, 50));
            jLabel40.setMinimumSize(new java.awt.Dimension(50, 50));
            jLabel40.setPreferredSize(new java.awt.Dimension(50, 50));

            jLabel41.setBackground(new java.awt.Color(255, 255, 153));
            jLabel41.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
            jLabel41.setText(" .");
            jLabel41.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jLabel41.setMaximumSize(new java.awt.Dimension(50, 50));
            jLabel41.setMinimumSize(new java.awt.Dimension(50, 50));
            jLabel41.setPreferredSize(new java.awt.Dimension(50, 50));

            space.setBackground(new java.awt.Color(255, 255, 153));
            space.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
            space.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            space.setText("Space");
            space.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            space.setMaximumSize(new java.awt.Dimension(50, 50));
            space.setMinimumSize(new java.awt.Dimension(50, 50));
            space.setPreferredSize(new java.awt.Dimension(50, 50));

            t1.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N

            jLabel51.setBackground(new java.awt.Color(255, 255, 153));
            jLabel51.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
            jLabel51.setText(" `");
            jLabel51.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jLabel51.setMaximumSize(new java.awt.Dimension(50, 50));
            jLabel51.setMinimumSize(new java.awt.Dimension(50, 50));
            jLabel51.setPreferredSize(new java.awt.Dimension(50, 50));

            javax.swing.GroupLayout keyboardLayout = new javax.swing.GroupLayout(keyboard);
            keyboard.setLayout(keyboardLayout);
            keyboardLayout.setHorizontalGroup(
                keyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(keyboardLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(keyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(keyboardLayout.createSequentialGroup()
                            .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(aq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(aw, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ae, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(at, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ay, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(au, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ai, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ao, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ap, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(15, 15, 15))
                        .addGroup(keyboardLayout.createSequentialGroup()
                            .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(n1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(n2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(n3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(n4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(n5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(n6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(n7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(n8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(n9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(n0, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(14, 14, 14))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, keyboardLayout.createSequentialGroup()
                            .addGroup(keyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, keyboardLayout.createSequentialGroup()
                                    .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(aa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(9, 9, 9)
                                    .addComponent(as, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ad, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(af, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ag, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ah, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(aj, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ak, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(al, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(keyboardLayout.createSequentialGroup()
                                    .addGroup(keyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(keyboardLayout.createSequentialGroup()
                                            .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(az, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(ax, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(ac, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(av, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(ab, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(an, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(am, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(keyboardLayout.createSequentialGroup()
                                            .addGap(225, 225, 225)
                                            .addComponent(space, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(13, 13, 13))))
                .addGroup(keyboardLayout.createSequentialGroup()
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
            );
            keyboardLayout.setVerticalGroup(
                keyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(keyboardLayout.createSequentialGroup()
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(keyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(keyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(n0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(n9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(n8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(n6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(n5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(n4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(n3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(n2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(n1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(n7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(keyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(keyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(au, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(at, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(aw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(keyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel55, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(aq, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(keyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(keyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(as, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(aa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(keyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(al, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(aj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(af, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(keyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel47, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel43, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(keyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(keyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(am, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(an, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(av, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(az, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(space, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(12, Short.MAX_VALUE))
            );

            getContentPane().add(keyboard);
            keyboard.setBounds(10, 285, 834, 292);

            i_line1.setBackground(new java.awt.Color(255, 255, 204));
            i_line1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
            i_line1.setText("Input text");
            getContentPane().add(i_line1);
            i_line1.setBounds(10, 115, 834, 50);

            w_line1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
            w_line1.setText("Written text");
            getContentPane().add(w_line1);
            w_line1.setBounds(10, 192, 814, 50);

            title.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
            title.setForeground(new java.awt.Color(0, 0, 204));
            title.setText("Typing Room");
            getContentPane().add(title);
            title.setBounds(330, 20, 211, 36);

            background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Backgrpund.jpg"))); // NOI18N
            background.setText("Background");
            getContentPane().add(background);
            background.setBounds(0, 0, 860, 600);

            pack();
        }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JLabel aa;
    javax.swing.JLabel ab;
    javax.swing.JLabel ac;
    javax.swing.JLabel ad;
    javax.swing.JLabel ae;
    javax.swing.JLabel af;
    javax.swing.JLabel ag;
    javax.swing.JLabel ah;
    javax.swing.JLabel ai;
    javax.swing.JLabel aj;
    javax.swing.JLabel ak;
    javax.swing.JLabel al;
    javax.swing.JLabel am;
    javax.swing.JLabel an;
    javax.swing.JLabel ao;
    javax.swing.JLabel ap;
    javax.swing.JLabel aq;
    javax.swing.JLabel ar;
    javax.swing.JLabel as;
    javax.swing.JLabel at;
    javax.swing.JLabel au;
    javax.swing.JLabel av;
    javax.swing.JLabel aw;
    javax.swing.JLabel ax;
    javax.swing.JLabel ay;
    javax.swing.JLabel az;
    private javax.swing.JLabel background;
    public javax.swing.JLabel i_line1;
    private javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLabel31;
    javax.swing.JLabel jLabel32;
    javax.swing.JLabel jLabel40;
    javax.swing.JLabel jLabel41;
    javax.swing.JLabel jLabel42;
    javax.swing.JLabel jLabel43;
    javax.swing.JLabel jLabel44;
    javax.swing.JLabel jLabel45;
    javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel keyboard;
    javax.swing.JLabel n0;
    javax.swing.JLabel n1;
    javax.swing.JLabel n2;
    javax.swing.JLabel n3;
    javax.swing.JLabel n4;
    javax.swing.JLabel n5;
    javax.swing.JLabel n6;
    javax.swing.JLabel n7;
    javax.swing.JLabel n8;
    javax.swing.JLabel n9;
    public javax.swing.JLabel space;
    javax.swing.JTextField t1;
    private javax.swing.JLabel title;
    public javax.swing.JLabel w_line1;
    // End of variables declaration//GEN-END:variables
}
