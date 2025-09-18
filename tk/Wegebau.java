package tk;

public class Wegebau {

    public static void main(String[] args) {
        final int ZIEL_LAENGE = 2137;
        final int STAB1_LAENGE = 13;
        final double STAB1_GEWICHT = 2.1;
        final int STAB1_MAX = 44;
        
        final int STAB2_LAENGE = 21;
        final double STAB2_GEWICHT = 2.7;
        final int STAB2_MAX = 55;
        
        final int STAB3_LAENGE = 53;
        final double STAB3_GEWICHT = 3.3;
        final int STAB3_MAX = 66;
        
        double minGewicht = Double.MAX_VALUE;
        int besteStab1 = 0;
        int besteStab2 = 0;
        int besteStab3 = 0;
        
        for (int stab3 = 0; stab3 <= STAB3_MAX; stab3++) {
            for (int stab2 = 0; stab2 <= STAB2_MAX; stab2++) {
                for (int stab1 = 0; stab1 <= STAB1_MAX; stab1++) {
                    
                    if (stab1 * STAB1_LAENGE + stab2 * STAB2_LAENGE + stab3 * STAB3_LAENGE == ZIEL_LAENGE) {
                        double gesamtGewicht = stab1 * STAB1_GEWICHT + stab2 * STAB2_GEWICHT + stab3 * STAB3_GEWICHT;
                        
                        if (gesamtGewicht < minGewicht) {
                            minGewicht = gesamtGewicht;
                            besteStab1 = stab1;
                            besteStab2 = stab2;
                            besteStab3 = stab3;
                        }
                    }
                }
            }
        }
        
        int prod1=STAB1_LAENGE*besteStab1;
        int prod2=STAB2_LAENGE*besteStab2;
        int prod3=STAB3_LAENGE*besteStab3;

        System.out.printf("Minimales Gewicht: %.2f kg%n", minGewicht);
        System.out.println("Anzahl Stablänge " + STAB1_LAENGE + ": " + besteStab1+ ", Produkt: "+prod1);
        System.out.println("Anzahl Stablänge " + STAB2_LAENGE + ": " + besteStab2+ ", Produkt: "+prod2);
        System.out.println("Anzahl Stablänge " + STAB3_LAENGE + ": " + besteStab3+ ", Produkt: "+prod3);
        System.out.println("Summe (2137): "+(prod1+prod2+prod3));
    }
}