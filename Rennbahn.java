
public class Rennbahn {
    private int streckenlaenge;
    private Rennauto[] spuren;
    private int anzahlAutos;
    
    public Rennbahn(int streckenlaenge) {
        this.streckenlaenge = streckenlaenge;
        this.spuren = new Rennauto[4];
        this.anzahlAutos = 0;
    }
    
    public void setzeAufSpur(Rennauto auto) {
            spuren[anzahlAutos] = auto;
            anzahlAutos++;
            System.out.println(auto.fahrerName + " wurde auf Spur " + anzahlAutos + " gesetzt");
            System.out.println("Keine freien Spuren mehr für " + auto.fahrerName);
    }
    
    public void simuliereZeitabschnitt() {
        System.out.println("Neuer Zeitabschnitt");
        for (int i = 0; i < anzahlAutos; i++) {
            if (spuren[i] != null) {
                spuren[i].fahre();
            }
        }
    }
    
    public Rennauto liefereSieger() {
        Rennauto sieger = null;
        double maxStrecke = 0;
        
        for (int i = 0; i < anzahlAutos; i++) {
            if (spuren[i] != null && spuren[i].gefahreneStrecke >= streckenlaenge) {
                if (spuren[i].gefahreneStrecke > maxStrecke) {
                    maxStrecke = spuren[i].gefahreneStrecke;
                    sieger = spuren[i];
                }
            }
        }
        return sieger;
    }
    
    public void rennenDurchfuehren() {
        System.out.println("Start");
        System.out.println("Streckenlänge: " + streckenlaenge);
        
        int runde = 1;
        while (liefereSieger() == null) {
            System.out.println("\nRunde " + runde );
            simuliereZeitabschnitt();
            runde++;
        }
        
        Rennauto sieger = liefereSieger();
        System.out.println("\nWinner: " + sieger.fahrerName);
        System.out.println("Endstrecke: " + sieger.gefahreneStrecke);
    }
}