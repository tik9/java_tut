package tk;

import java.util.Random;

public class Mails {
    static final String[] WOCHENTAGE = { "Mo", "Di", "Mi", "Do", "Fr", "Sa", "So" };
    static final int[] MAILS_PRO_TAG = { 12, 15, 22, 13, 0, 21, 19 };
    static final int ZIEL = 500;
    static final Random random = new Random();

    public static void main(String[] args) {
        int gesamtKunden = 0;
        int woche = 0;
        String erreichtTag = "";

        while (erreichtTag == "") {
            woche++;

            for (int i = 0; i < 7; i++) {
                gesamtKunden += Math.max(MAILS_PRO_TAG[i] - random.nextInt(3, 11), 0);

                if (gesamtKunden >= ZIEL) {
                    erreichtTag = WOCHENTAGE[i];
                    break;
                }
            }

            System.out.println("Nach der " + woche + ". Woche hat Fred " + gesamtKunden + " Neukunden");
        }

        System.out.println("Ziel von " + ZIEL + " Neukunden erreicht/Überschritten am " + erreichtTag +
                " der " + woche + ". Woche (gesamt: " + gesamtKunden + " Neukunden).");
    }
}