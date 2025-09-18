package tk;

import java.util.Random;

public class Zufallsmatrix2 {
    private static final int ROWS = 6;
    private static final int COLS = 5;
    private static final Random random = new Random();

    public static void main(String[] args) {
        int[][] matrix = new int[ROWS][COLS];
        int value = 0;
        int sum = 0;
        for (int i = 0; i < ROWS; i++) {
            value = random.nextInt(1, 10);
            matrix[i][2] = value;
            System.out.println(matrix[i][2]);
            sum += value;
        }
        
        System.out.println("Spaltensumme gerade? "+(sum%2==0));

    }
}
