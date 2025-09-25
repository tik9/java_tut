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
        
        int k = 9;

        for (int i = 0; i < 10; i++) {
            int left = 0, right = 0;
            for (int j = 0; j < 5; j++) {
                // vgl 09, 18,..
                if (matrix[i][j] > matrix[i][k])
                    left++;
                else if (matrix[i][j] < matrix[i][k])
                    right++;

                System.out.print(matrix[i][j]);
                System.out.println(matrix[i][k]);
                k--;
            }
            System.out.println("Zeile: "+i+": " + left + ":" + right);
        }
    }
}