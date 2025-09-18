package tk;

import java.util.Random;

public class Hw {
         static final Random random = new Random();

         public static void main(String[] args) {
             // for (int i = 1; i < 100; i++) {
             // System.out.println("Rand 1-9: " + random.nextInt(1, 10));
             // }

             for (int i = 1; i <= 10; i++) {
                 for (int j = 1; j <= i; j++) {
                     for (int k = 1; k <= j; k++) {
                         System.out.print(k + "\t");
                         continue;
                     }
            }
            System.out.println();
        }

            }
        }