package typingmaster;

import Welcome.WelcomePage;

public class TypingMaster {

    public static void main(String[] args) {
        Object waitForEnter = new Object();
        WelcomePage p = new WelcomePage(waitForEnter);
    }
    
}
