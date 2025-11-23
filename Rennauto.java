
public class Rennauto {
    public String fahrerName;
    public String fahrzeugtyp;
    public int maxGeschwindigkeit;
    public int gefahreneStrecke;
    
    public Rennauto(String fahrerName, String fahrzeugtyp, int maxGeschwindigkeit) {
        this.fahrerName = fahrerName;
        this.fahrzeugtyp = fahrzeugtyp;
        this.maxGeschwindigkeit = maxGeschwindigkeit;
        this.gefahreneStrecke = 0;
    }
    
    public Rennauto(String fahrerName) {
        this(fahrerName, "Standardauto", 100);
    }
    
    public void fahre() {
        double streckeInZeitabschnitt = Math.random() * maxGeschwindigkeit;
       //tbd
        System.out.println(fahrerName + " fuhr " + (int)streckeInZeitabschnitt + " Einheiten. Gesamt: " + gefahreneStrecke);
    }
}