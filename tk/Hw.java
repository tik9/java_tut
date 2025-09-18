package tk;

import java.util.Random;

public class Hw {
         static final Random random = new Random();

         public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            System.out.println(random.nextInt(1, 10));
        }
    }

}