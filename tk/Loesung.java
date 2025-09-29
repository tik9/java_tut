package tk; 

public class Loesung {
    public static void main(String[] args) {
        int maxA = 240;
        int maxB = 400;
        int maxC = 500;
    
        int gesamtMenge = 860;

        int kostenA = 2;
        int kostenB = 3;
        int kostenC = 5;

        int minKosten = Integer.MAX_VALUE;
        int bestA = 0, bestB = 0, bestC = 0;

        for (int a = 15; a <= maxA; a++) {
            for (int b = 25; b <= maxB; b++) {
                for (int c = 35; c <= maxC; c++) {
                    if (a + b + c == gesamtMenge) {

                        if ((2 * a) < c|| (c-a)>b) {
                            int kosten = a * kostenA + b * kostenB + c * kostenC;
                            if (kosten < minKosten) {
                                minKosten = kosten;
                                bestA = a;
                                bestB = b;
                                bestC = c;
                            }
                        }
                    }
                }
            }
        }

        System.out.println("Die minimalen Kosten belaufen sich auf: " + minKosten + " Cent");
        System.out.println("Folgende Mischanteile:");
        System.out.println("Lösung A: " + bestA + " ml");
        System.out.println("Lösung B: " + bestB + " ml");
        System.out.println("Lösung C: " + bestC + " ml");
    }
}