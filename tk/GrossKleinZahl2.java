package tk;

import java.util.Random;

public class GrossKleinZahl2 {

    static Random rand = new Random();

    public static void main(String[] args) {
       
        char[] kleinbuchstaben = new char[26];
        char[] grossbuchstaben = new char[26];

        for (int i = 0; i < kleinbuchstaben.length; i++) {
            kleinbuchstaben[i] = (char) ('a' + i);
        }
        
        for (int i = 0; i < grossbuchstaben.length; i++) {
            grossbuchstaben[i] = (char) ('A' + i);
        }

        char zufall;
        for (int i = 1; i < 4; i++) {
            zufall = (char) rand.nextInt(kleinbuchstaben.length);
            System.out.print(kleinbuchstaben[zufall]+""+grossbuchstaben[zufall]+rand.nextInt(10));
        }
    }
        }
