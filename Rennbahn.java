
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
    }
    

    public Rennauto liefereSieger() {
        Rennauto sieger = null;
        double maxStrecke = 0;
        
        for (int i = 0; i < anzahlAutos; i++) {
            if (spuren[i] != null && spuren[i].gefahreneStrecke >= streckenlaenge) {
                if (spuren[i].gefahreneStrecke > maxStrecke) {
//tbd
                }
            }
        }
        return sieger;
    }
    
    public void rennenDurchfuehren() {
        System.out.println("Start");
        System.out.println("Streckenlänge: " + streckenlaenge);
        
     //tbd   
        System.out.println("\nWinner: " + sieger.fahrerName);
        System.out.println("Endstrecke: " + sieger.gefahreneStrecke);
    }
}