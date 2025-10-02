package tk;

import java.util.Random;

public class LinksRechts2 {

    public static void main(String[] args) {

        Random rand = new Random();

        int[][] matrix = new int[10][10];

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = rand.nextInt(1, 10);
                // System.out.print(matrix[i][j]);
            }
            // System.out.println();
        }
        int geslinks = 0, gesrechts = 0, unentsch = 0;
        for (int i = 0; i < 10; i++) {
            int left = 0;
            int right = 0;

            int k = 9;
            for (int j = 0; j < 5; j++) {
                // vgl 09,18,..
                if (matrix[i][j] > matrix[i][k]) {
                    left++;
                } else if (matrix[i][j] < matrix[i][k]) {
                    right++;
                }

                // System.out.print(matrix[i][j]);
                // System.out.println(matrix[i][k]);

                k--;

            }
            System.out.println("Zeile: " + (i + 1) + ": " + left + ": " + right);
            if (left > right)
                geslinks++;
            else if (left < right) {
                gesrechts++;
            }

            else
                unentsch++;

        }
        System.out.println("linke hälfte: " + geslinks + ", Rechte Hälfte: " + gesrechts);
        System.out.println("Unentsch.: " + unentsch);
    }
}