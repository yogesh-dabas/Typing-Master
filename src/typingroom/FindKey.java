package typingroom;

import javax.swing.JLabel;

/**
 *
 * @author Yogesh Dabas
 */
public class FindKey {

    TypingRoom a;

    FindKey(TypingRoom a) {
        this.a = a;
    }

    JLabel getJLabel(char ch) {
        System.out.println((int)ch);
        if (ch > 64 && ch < 91) {
            ch += 32;
        }
        switch (ch) {
            case 32:{
                return a.space;
            }
            case '0': {
                return a.n0;
            }
            case '1': {
                return (a.n1);
            }
            case '2': {
                return (a.n2);
            }
            case '3': {
                return (a.n3);
            }
            case '4': {
                return (a.n4);
            }
            case '5': {
                return (a.n5);
            }
            case '6': {
               return(a.n6);
            }
            case '7': {
                return(a.n7);
            }
            case '8': {
                return(a.n8);
            }
            case '9': {
                return(a.n9);
            }
            case 'a': {
                return(a.aa);

            }
            case 'b': {
                return(a.ab);

            }
            case 'c': {
                return(a.ac);

            }
            case 'd': {
                return(a.ad);

            }
            case 'e': {
                return(a.ae);

            }
            case 'f': {
                return(a.af);

            }
            case 'g': {
                return(a.ag);

            }
            case 'h': {
                return(a.ah);

            }
            case 'i': {
                return(a.ai);

            }
            case 'j': {
                return(a.aj);

            }
            case 'k': {
                return(a.ak);

            }
            case 'l': {
                return(a.al);

            }
            case 'm': {
                return(a.am);

            }
            case 'n': {
                return(a.an);

            }
            case 'o': {
                return(a.ao);

            }
            case 'p': {
                return(a.ap);

            }
            case 'q': {
                return(a.aq);

            }
            case 'r': {
                return(a.ar);

            }
            case 's': {
                return(a.as);

            }
            case 't': {
                return(a.at);

            }
            case 'u': {
                return(a.au);

            }
            case 'v': {
                return(a.av);

            }
            case 'w': {
                return(a.aw);

            }
            case 'x': {
                return(a.ax);

            }
            case 'y': {
                return(a.ay);

            }
            case 'z': {
                return(a.az);

            }
        }
        return null;
    }
}
