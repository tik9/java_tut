package tk;

import java.util.Random;

public class GrossKleinZahl2 {

    static Random rand = new Random();

    public static void main(String[] args) {

        char[] klein = new char[26];
        char[] gross = new char[26];

        String text = "";

        for (int i = 0; i < gross.length; i++) {
            klein[i] = (char) ('a' + i);
            gross[i] = (char) ('A' + i);
        }

        for (int i = 0; i < 99; i++) {
            int zufall = rand.nextInt(26);
            text += gross[zufall] + "";
            zufall = rand.nextInt(26);
            text += klein[zufall] + "";
            text += rand.nextInt(10);

        }

        System.out.println(text);
        int j = 0, anzahl = 0;
        for (int i = 0; i < 33; i++) {
            String paket = text.substring(j, j + 3);

            j += 3;

            if (unterpr(paket)) {
                anzahl++;
                System.out.println(paket);
            }

        }
        System.out.println("Summe " + anzahl);
    }

    static boolean unterpr(String paket) {

        int zahl = Character.getNumericValue(paket.charAt(2));

        String gross = paket.substring(0, 1).toLowerCase();
        String klein = paket.substring(1, 2);

        boolean vergleich = klein.equals(gross);

        if (zahl % 2 == 0 && vergleich)
            return true;
        else
            return false;
    }
}
