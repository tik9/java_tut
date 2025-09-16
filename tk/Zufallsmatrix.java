package tk;

import java.util.Random;

public class Zufallsmatrix {
    private static final int ROWS = 6;
    private static final int COLS = 5;
    private static final int[] ZEILEN_FUELLUNG = { 3, 2, 4, 1, 3, 5 };
    private static final Random random = new Random();

    public static void main(String[] args) {
        int versuche = 0;
        int[][] matrix;

        do {
            versuche++;
            matrix = new int[ROWS][COLS];

            for (int i = 0; i < ROWS; i++) {
                for (int j = 0; j < COLS; j++) {
                    matrix[i][j] = 0;
                }

                for (int k = 0; k < ZEILEN_FUELLUNG[i]; k++) {
                    int pos;
                    do {
                        pos = random.nextInt(COLS);
                    } while (matrix[i][pos] != 0);

                    matrix[i][pos] = random.nextInt(9) + 1;
                }
            }
        } while (!istMittlereSpalteGerade(matrix));

        int summe_2 = 0;
        for (int i = 0; i < ROWS; i++) {
            summe_2 += matrix[i][2];
            for (int j = 0; j < COLS; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Summe 2. Spalte: " + summe_2 + ", " + versuche + " Versuch(e)");
    }

    private static boolean istMittlereSpalteGerade(int[][] matrix) {
        int summe = 0;

        for (int i = 0; i < ROWS; i++) {
            summe += matrix[i][2];
        }

        return summe % 2 == 0;
    }
}