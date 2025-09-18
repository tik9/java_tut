
package tk;

public class PiNaeherung {
    public static void main(String[] args) {
        final double ZIEL_GENAUIGKEIT = 0.0001;
        double piNaeherung = 1.0;
        double differenz = Double.MAX_VALUE;
        int glied = 0;

        while (differenz > ZIEL_GENAUIGKEIT) {
            glied++;

            // π/2 = (2/1 * 2/3) * (4/3 * 4/5) * (6/5 * 6/7) * ...
            double faktor = (2.0 * glied) / (2.0 * glied - 1.0) * (2.0 * glied) / (2.0 * glied + 1.0);
            piNaeherung *= faktor;

            // da π/2 berechnet, multiplizieren mit 2
            double piAktuell = piNaeherung * 2.0;

            // Differenz zu Math π
            differenz = Math.abs(Math.PI - piAktuell);
        }

        double finalPiNaeherung = piNaeherung * 2.0;

        System.out.printf("Genauigkeit Näherung (%.12f) PI nach %d Gliedern kleiner als %.4f%n - Math.pi = %.12f",
                finalPiNaeherung, glied, ZIEL_GENAUIGKEIT, Math.PI);
        System.out.println();
    }
}