package tk;

import java.util.Random;

public class Mails {
    static final String[] WOCHENTAGE = { "Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag",
            "Sonntag" };
    static final int[] MAILS_PRO_TAG = { 12, 15, 22, 13, 0, 21, 19 };
    static final int ziel = 500;

    public static void main(String[] args) {
        int mails = 0;
        int woche = 0;
        String tag = "";

        while (tag=="") {
            for (int i = 0; i < 7; i++) {
                mails += MAILS_PRO_TAG[i] - (new Random()).nextInt(3, 11);
                if (mails >= ziel) {
                    tag = WOCHENTAGE[i];
                    break;
                }
            }
            woche++;

            System.out.println(mails + " Mails nach Woche " + woche);
        }
        System.out.println("Ziel von " + ziel + " Neukunden erreicht am " + tag + " in " + woche + ". Woche (gesamt "
                + mails + " Kunden)");
    }
}
