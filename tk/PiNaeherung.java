
package tk;

public class PiNaeherung {
    public static void main(String[] args) {
        final double ZIEL_GENAUIGKEIT = 0.0001;
        double piNaeherung = 1;
        double differenz = Double.MAX_VALUE;
        int glied = 0;

        while (differenz > ZIEL_GENAUIGKEIT) {
            glied++;

            // π/2 = (2/1 * 2/3) * (4/3 * 4/5) * (6/5 * 6/7) * ...
            double faktor = ((2.0 * glied) / (2.0 * glied - 1.0)) * ((2.0 * glied) / (2.0 * glied + 1.0));
            piNaeherung *= faktor;

            differenz = Math.PI - piNaeherung * 2.0;
            System.out.println("Diff: " + differenz);
        }

        System.out.println("Genauigkeit Näherung " + piNaeherung * 2 + " PI nach " + glied + " Gliedern kleiner als "
                + ZIEL_GENAUIGKEIT + " - pi=" + Math.PI);
    }
}