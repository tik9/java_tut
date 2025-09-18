package tk;

import java.util.Random;

public class Zufallsmatrix4 {
    private static final int ROWS = 6;
    private static final int COLS = 5;
    private static final Random random = new Random();

    public static void main(String[] args) {
        int[][] matrix = new int[ROWS][COLS];
        int value = 0;
        int sum = 0;
        int versuche = 0;
        boolean summe_gerade = false;
        while (!summe_gerade) {
            versuche++;
            sum = 0;
            for (int i = 0; i < ROWS; i++) {
                for (int j = 0; j < COLS; j++) {
                    value = random.nextInt(1, 10);
                    matrix[i][j] = value;
                    if (j == 2)
                        sum += value;
                }
            }
            if (sum % 2 == 0) {
                summe_gerade = true;
            }
        }
            System.out.println("Versuche: " + versuche + ", Summe= " + sum);
            for (int i = 0; i < matrix.length; i++) {
                System.out.println(matrix[i][2]);
            }
    }
}