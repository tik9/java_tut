package tk;

import java.util.Random;

public class Zufallsmatrix5 {
    private static final int ROWS = 6;
    private static final int COLS = 5;
    private static final Random random = new Random();
    static final int[] spalten = { 3, 2, 4, 1, 3, 5 };
    // static final int[] spalten = { 1, 1, 1, 1, 1, 1 };

    public static void main(String[] args) {
        int[][] matrix = new int[ROWS][COLS];
        int value = 0;
        int sum = 0;
        int versuche = 0;
        while (!(sum % 2 == 0) || sum == 0) {
            versuche++;
            sum = 0;
            for (int i = 0; i < ROWS; i++) {
                for (int j = 0; j < COLS; j++) {
                    matrix[i][j] = 0;
                }
                int zufallsspalte = 0;
                for (int j = 0; j < spalten[i]; j++) {

                    do {
                        zufallsspalte = random.nextInt(0, 5);
                        System.out.println(zufallsspalte);
                    } while (matrix[i][zufallsspalte] != 0);

                    value = random.nextInt(1, 10);
                    matrix[i][zufallsspalte] = value;
                    if (zufallsspalte == 2)
                        sum += value;
                }
            }
        }
        System.out.println("Versuche: " + versuche + ", Summe= " + sum);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < COLS; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}