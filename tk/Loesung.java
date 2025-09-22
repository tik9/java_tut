package tk; 

public class Loesung {
    public static void main(String[] args) {
        int maxA = 240;
        int maxB = 400;
        int maxC = 500;
        int minA = 15;
        int minB = 25;
        int minC = 35;
        int gesamtMenge = 860;

        int kostenA = 2;
        int kostenB = 3;
        int kostenC = 5;

        int minKosten = Integer.MAX_VALUE;
        int bestA = 0, bestB = 0, bestC = 0;

        for (int a = minA; a <= maxA; a++) {
            for (int b = minB; b <= maxB; b++) {
                for (int c = minC; c <= maxC; c++) {
                    if (a + b + c == gesamtMenge) {
                        boolean bedingung1 = (2 * a) < c;
                        boolean bedingung2 = (c - a) > b;

                        if (bedingung1 || bedingung2) {
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