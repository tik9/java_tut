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
        int erreichtWoche = 0;
        boolean zielErreicht = false;

        while (!zielErreicht) {
            woche++;
            int kundenDieseWoche = 0;

            for (int i = 0; i < 7; i++) {
                int nichtReagiert = random.nextInt(8) + 3; // 3-10
                int kundenHeute = MAILS_PRO_TAG[i] - nichtReagiert;
                kundenDieseWoche += Math.max(kundenHeute, 0); // Negative vermeiden

                if (!zielErreicht && gesamtKunden + kundenDieseWoche >= ZIEL) {
                    zielErreicht = true;
                    erreichtTag = WOCHENTAGE[i];
                    erreichtWoche = woche;
                }
            }

            gesamtKunden += kundenDieseWoche;
            System.out.println("Nach der " + woche + ". Woche hat Fred " + gesamtKunden + " Neukunden");
        }

        System.out.println("Ziel von " + ZIEL + " Neukunden erreicht/Überschritten am " + erreichtTag +
                " der " + erreichtWoche + ". Woche (gesamt: " + gesamtKunden + " Neukunden).");
    }
}