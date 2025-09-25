package tk;

import java.util.Random;

public class GrossKleinZahl {

    static Random rand = new Random();

    public static void main(String[] args) {
        char[] kleinbuchstaben = new char[26];
        char[] grossbuchstaben = new char[26];

        for (int i = 0; i < kleinbuchstaben.length; i++) {
            kleinbuchstaben[i] = (char) ('a' + i);
            grossbuchstaben[i] = (char) ('A' + i);
        }

        int zufall;
        String text = "";
        for (int i = 0; i < 99; i++) {
            zufall = rand.nextInt(kleinbuchstaben.length);

            text += grossbuchstaben[zufall] + "";
            zufall = rand.nextInt(kleinbuchstaben.length);
            text += kleinbuchstaben[zufall] + "" + rand.nextInt(10);
        }
        int j = 0, anzahl = 0;
        for (int i = 0; i < 33; i++) {
            String drei = text.substring(j, j + 3);
            if (dreier(drei)) {
                anzahl++;
                System.out.println(drei);
            }
            j += 3;
        }

        System.out.println("Summe: " + anzahl);
        
        // boolean ersteDrei = dreier(text.substring(0, 3));

    }

    static boolean dreier(String text) {
        int number = Character.getNumericValue(text.charAt(2));

        String converted = text.substring(0, 1).toLowerCase();
        String lower = text.substring(1, 2);

        return converted.equals(lower) && number % 2 == 0;

    }
}
