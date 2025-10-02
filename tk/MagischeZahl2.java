package tk;

public class MagischeZahl2 {
    
    public static boolean istMagischeZahl(int n) {
        double summe = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                summe += 1.0 / i;
            }
        }
        return summe==2; 
    }
    
    public static void main(String[] args) {
        int letzteEinerstelle = -1;
        boolean ersteZahl = true;
        boolean unterscheide2 = true;
        
        for (int zahl = 6; zahl <= 496; zahl++) {
            if (istMagischeZahl(zahl)) {
                System.out.println(zahl);
                
                int einerstelle = zahl % 10;
                if (!ersteZahl) {
                    int diff = Math.abs(einerstelle - letzteEinerstelle);
                    if (diff != 2) {
                        unterscheide2 = false;
                    }
                }
                letzteEinerstelle = einerstelle;
                ersteZahl = false;
            }
        }
        
        if (unterscheide2) {
            System.out.println("Alle Zahlen unterscheiden sich an Einerstelle um 2");
        } else {
            System.out.println("Alle Zahlen unterscheiden sich nicht an  Einerstelle um 2");
        }
    }
}