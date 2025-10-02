package tk;

/*
1/2 + 1/3 - 2/4 - 2/5 + 3/6 + 3/7 - 4/8 - 4/9 +..+ 5/10+5/11
Vorzeichen: ++--++--.. alle 2 Terme wechselt Vorzeichen

Zähler: 1,1,2,2,3,3.. jede Zahl 2× verwendet
Nenner: 2,3,4,5,.. steigt um 1
*/

public class Reihe {
    public static void main(String[] args) {
        float reihe = 0;

        int anzahl = 0;

        int zaehler = 0, nenner = 1;

        // while (reihe <= 0.89) {
        while (reihe < 0.89) {
            nenner++;

            zaehler = anzahl / 2 + 1;
            int vorzeichen = (int) Math.pow(-1, anzahl / 2);

            reihe += vorzeichen * (float) zaehler / nenner;

            anzahl++;
        }
        System.out.println(anzahl + ", Reihe: " + reihe);
    }
    
        }
