package tk;

public class Wegebau2 {

    public static void main(String[] args) {
        final int ZIEL_LAENGE = 2137;
        final int STAB1_LAENGE = 13;
        final int STAB1_MAX = 44;
        
        final int STAB2_LAENGE = 21;
        final int STAB2_MAX = 55;
        
        final int STAB3_LAENGE = 53;
        final int STAB3_MAX = 66;
        
        int kombis = 0;
        for (int stab3 = 0; stab3 <= STAB3_MAX; stab3++) {
            for (int stab2 = 0; stab2 <= STAB2_MAX; stab2++) {
                for (int stab1 = 0; stab1 <= STAB1_MAX; stab1++) {

                    int prod1 = STAB1_LAENGE * stab1;
                    int prod2 = STAB2_LAENGE * stab2;
                    int prod3 = STAB3_LAENGE * stab3;
                    if (prod1 + prod2 + prod3 == ZIEL_LAENGE) {
                        System.out.println("Stablängen*Anzahl 1-3:" + prod1 + " m, " + prod2 + " m, " + prod3+" m");
                        kombis++;

                    }
                }
            }
        }
  System.out.println("Anzahl mit 2137 m: "+kombis );
    }
}