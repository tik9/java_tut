package tk;

import java.util.Random;

public class LinksRechts {

    public static void main(String[] args) {

        Random rand = new Random();
        int[][] matrix = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrix[i][j] = rand.nextInt(1, 10);
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        
        int leftGes = 0, rightGes = 0, unentschiedenGes = 0;

        for (int i = 0; i < 10; i++) {
            int left = 0, right = 0, unentschieden = 0;
            int k = 9;
            for (int j = 0; j < 5; j++) {
                // vgl 09, 18,..
                if (matrix[i][j] > matrix[i][k])
                    left++;
                else if (matrix[i][j] < matrix[i][k])
                    right++;
                else
                    unentschieden++;
                System.out.print(matrix[i][j]);
                System.out.println(matrix[i][k]);
                k--;
            }

            if (left > right)
                leftGes++;
            else if (left < right)
                rightGes++;
            else
                unentschiedenGes++;

            System.out.println("Zeile: " + i + ": " + left + ":" + right);
        }
        System.out.println("Linke Hälfte Siege: " + leftGes);
        System.out.println("Rechte Hälfte Siege: " + rightGes);
        System.out.println("Unentsch. " + unentschiedenGes);

    }
}