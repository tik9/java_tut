
package tk;

import java.util.Random;

public class Mails {
     static final int[] MAILS_PRO_TAG = { 12, 15, 22, 13, 0, 21, 19 };
     static final String[] WOCHENTAGE = { "Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag",
            "Sonntag" };
     static final Random random = new Random();
    static final int ZIEL_KUNDEN = 500;

    public static void main(String[] args) {

        int gesamtKunden = 0;
        int woche = 0;
        boolean zielErreicht = false;
        String erreichtAmTag = "";
        int erreichtInWoche = 0;

        while (zielErreicht == false) {
            woche++;
            int kundenDieseWoche = 0;

            for (int tag = 0; tag < 7; tag++) {
                int mailsHeute = MAILS_PRO_TAG[tag];

                int nichtReagieren = random.nextInt(3, 11);
                int neueKunden = mailsHeute - nichtReagieren;

                if (neueKunden < 0) {
                    neueKunden = 0;
                }

                kundenDieseWoche += neueKunden;

                if (gesamtKunden + kundenDieseWoche >= ZIEL_KUNDEN) {
                    zielErreicht = true;
                    erreichtAmTag = WOCHENTAGE[tag];
                    erreichtInWoche = woche;
                    break; // schliesse Schleife
                }

            }

            gesamtKunden += kundenDieseWoche;

            System.out.println("Nach " + woche + ". Woche " + gesamtKunden + " Neukunden");

        }

        System.out.printf("Ziel von %d Neukunden erreicht/überschritten am %s in %d. Woche (gesamt: %d Neukunden)%n",
                ZIEL_KUNDEN, erreichtAmTag, erreichtInWoche, gesamtKunden);
    }
    
}