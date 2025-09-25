package tk;

import java.util.Random;

public class LinksRechts2 {

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
        int j = 9,left=0,right=0;

        for (int i = 0; i < 5; i++) {
            // vgl 09, 18,..
            if (matrix[0][i] > matrix[0][j])
                left++;
            else if (matrix[0][i] < matrix[0][j])
                right++;

            System.out.print(matrix[0][i]);
            System.out.println(matrix[0][j]);
            j--;
        }
        System.out.println("Zeile: 1: "+ left+":"+right);

    }
}