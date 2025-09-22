
package tk;

import java.util.Random;

public class Passwort3 {
    private static final char[] ZEICHEN = {
            'A', 'F', 'U', 'X', 'b', 'n', 's', 'u', '2', '5', '8', '%', '&', '$'
    };

    private static final Random random = new Random();

    public static void main(String[] args) {
        int versuche = 0;
        String passwort;

        do {
            versuche++;
            StringBuilder passwort2 = new StringBuilder();

            for (int i = 0; i < 10; i++) {
                passwort2.append(ZEICHEN[random.nextInt(ZEICHEN.length)]);
            }

            passwort = passwort2.toString();
        } while (!checkPasswort(passwort));


        System.out.println("Passwort: " + passwort);
        System.out.println(versuche + " Versuch(e)");
    }

    private static boolean checkPasswort(String passwort) {
        int grossbuchstaben = 0;
        int kleinbuchstaben = 0;
        int ziffern = 0;
        int sonderzeichen = 0;

        for (char c : passwort.toCharArray()) {
            if (Character.isUpperCase(c)) {
                grossbuchstaben++;
            } else if (Character.isLowerCase(c)) {
                kleinbuchstaben++;
            } else if (Character.isDigit(c)) {
                ziffern++;
            } else {
                sonderzeichen++;
            }
        }

        return grossbuchstaben >= 3 && kleinbuchstaben >= 3 && ziffern >= 2 && sonderzeichen >= 2;
    }
}
