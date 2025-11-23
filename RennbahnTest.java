
public class RennbahnTest {
    public static void main(String[] args) {
        Rennbahn rennbahn = new Rennbahn(100);
        
        Rennauto auto1 = new Rennauto("Anna", "wagen1", 50);
        Rennauto auto2 = new Rennauto("Ben", "wagen0.1", 30);
        Rennauto auto3 = new Rennauto("Chris");
        
        rennbahn.setzeAufSpur(auto1);
        rennbahn.setzeAufSpur(auto2);
        rennbahn.setzeAufSpur(auto3);
        
        rennbahn.rennenDurchfuehren();
    }
}