
package tk;

import java.util.Random;

public class Passwort2 {

    private static final char[] ZEICHEN = {
            'A', 'F', 'U', 'X', 'b', 'n', 's', 'u', '2', '5', '8', '%', '&', '$'
    };

    private static final Random random = new Random();

    public static void main(String[] args) {

        String passwort;

        StringBuilder passwort2 = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            passwort2.append(ZEICHEN[random.nextInt(ZEICHEN.length)]);
        }

        passwort = passwort2.toString();

        System.out.println("Alt. 1: "+ passwort);
        System.out.println("Alt. 2: " + erstellePasswortAlternative());
    }

    private static String erstellePasswortAlternative() {
        char[] passwort = new char[10];

        for (int i = 0; i < 10; i++) {
            passwort[i] = ZEICHEN[random.nextInt(0,ZEICHEN.length)];
        }

        return new String(passwort);
    }
}
