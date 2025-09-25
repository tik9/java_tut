package tk;

/*
1/2 + 1/3 - 2/4 - 2/5 + 3/6 + 3/7 - 4/8 - 4/9 + ..
Vorzeichen: ++--++--.. alle 2 Terme wechselt Vorzeichen

Zähler: 1,1,2,2,3,3.. jede Zahl 2× verwendet
Nenner: 2,3,4,5,.. steigt um 1
*/

public class Reihe {
    static int elems = 0;
    public static void main(String[] args) {

        float reihe = 0;
        while (reihe <= 0.89) {
            int nenner = elems + 2; // 2,3,4,..
            double vorzeichen = Math.pow(-1, Math.floor(elems / 2));// ++ -- ++
            int zaehler = (int) Math.floor(elems / 2) + 1; // 1,1,2,2,..
            
            reihe += vorzeichen * zaehler / nenner;
            elems++;
        }

        System.out.println("Glieder: "+elems+", Summe: "+reihe);
    }
    
        }
