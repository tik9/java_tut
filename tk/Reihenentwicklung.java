package tk;

public class Reihenentwicklung {
    
    // 1/1+1/3-1/2-1/4+1/5+1/7-1/6-1/8+..+1/9

    public static void main(String[] args) {
        double summe = 0.0;
        int n = 1;      // Nenner für positives Glied
        int m = 3;      // Nenner für negatives Glied
        int anzahlGlieder = 0;
        boolean gefunden = false;
        
        // Reihenfolge: +, +, -, -, +, +, ..
        int phase = 0;  // 0: erstes positives, 1: zweites positives, 
                        // 2: erstes negatives, 3: zweites negatives
        
        while (!gefunden) {
            double glied = 0.0;
            
            switch (phase) {
                case 0: // erstes positives Glied
                    glied = 1.0 / n;
                    n += 4;  // nächster positiver Nenner
                    break;
                case 1: // zweites positives Glied  
                    glied = 1.0 / n;
                    n += 4;
                    break;
                case 2: // erstes negatives Glied
                    glied = -1.0 / m;
                    m += 4;  // nächster negativer Nenner
                    break;
                case 3: // zweites negatives Glied
                    glied = -1.0 / m;
                    m += 4;
                    break;
            }
            
            summe += glied;
            anzahlGlieder++;
            phase = (phase + 1) % 4;  // 0, 1,2,3,0..
            
            // Prüfe dritte Nachkommastelle
            int dritteNachkommastelle = (int)(summe * 1000) % 10;
            if (dritteNachkommastelle == 9) {
                gefunden = true;
            }
        }
        
        System.out.printf("Anzahl Glieder: "+ anzahlGlieder+", Summe: "+ summe);
    }
}