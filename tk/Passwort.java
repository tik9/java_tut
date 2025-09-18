
package tk; // Ersetze "deinName" mit deinem tatsächlichen Namen

import java.util.Random;

public class Passwort {
    // Verfügbare Zeichen
    private static final char[] ZEICHEN = {
            'A', 'F', 'U', 'X', 'b', 'n', 's', 'u', '2', '5', '8', '%', '&', '$'
    };

    private static final Random random = new Random();

    public static void main(String[] args) {
        int versuche = 0;
        String passwort;
        int pruefsumme = 0;

        do {
            versuche++;
            StringBuilder passwort2 = new StringBuilder();

            for (int i = 0; i < 10; i++) {
                passwort2.append(ZEICHEN[random.nextInt(ZEICHEN.length)]);
            }

            passwort = passwort2.toString();
        } while (!checkPasswort(passwort));

        pruefsumme = pruefSumme(passwort);

        System.out.println("Passwort: " + passwort);
        System.out.println("Prüfsumme: " + pruefsumme);
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

    private static int pruefSumme(String passwort) {
        int summe = 0;

        for (char c : passwort.toCharArray()) {
            summe += (int) c;
        }

        return summe;
    }

    private static String erstellePasswort() {
        char[] passwortChars = new char[10];

        for (int i = 0; i < 10; i++) {
            passwortChars[i] = ZEICHEN[random.nextInt(14)];
        }

        return new String(passwortChars);
    }
}
