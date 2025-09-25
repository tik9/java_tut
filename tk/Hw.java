package tk;

import java.util.Random;

public class Hw {
    static final Random random = new Random();

    public static void main(String[] args) {
        for (int i = 1; i < 30; i++) {
            System.out.println("Rand 1-9: " + random.nextInt(1,10));
        }
    }
        }
