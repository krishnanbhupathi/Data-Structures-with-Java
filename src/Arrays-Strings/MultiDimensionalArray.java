import java.util.Scanner;

class MultiDimensionalArray {

    public static void main(String[] args) {
        /* 2D Arrays are nothging but matrix. Representation as follow:
         *     1 2 3
         *     4 5 6
         *     7 8 9
         */

        int[][] twoDimension = new int[2][2];
        twoDimension[0][0] = 1;
        twoDimension[0][1] = 2;
        twoDimension[1][0] = 3;
        twoDimension[1][1] = 4;

        // we don't need to mention the column size while declaring.we can do like below
        int[][] secondArray = new int[3][];
        
        // we can access each element in two-dimensional array like follow
        System.out.println(twoDimension[1][0]); // it will gives you first element of second row
        
        // Iterating over 2 dimensional array
        System.out.println("Two Dimension Array : ");
        for(int i = 0 ;i < twoDimension.length; i++) {
            for(int j = 0; j < twoDimension[i].length; j++) {
                System.out.print(twoDimension[i][j]+" ");
            }
            System.out.println();
        }

        /*Column size can be different of each row
          Individual array size can be different */
        int[][] array2D = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9} 
        };

        // Printing 2 dimension array with multi-size column array
        System.out.println("Two Dimension with multi-size column: ");
        for(int i = 0 ; i < 3 ; i++) {

            for(int j = 0 ; j < array2D[i].length; j++) {
                System.out.print(array2D[i][j]+" ");
            }
            System.out.println();
        }

    }
}
