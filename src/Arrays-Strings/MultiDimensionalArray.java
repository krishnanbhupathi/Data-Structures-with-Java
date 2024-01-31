import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

class MultiDimensionalArray {

    public static void main(String[] args) {
        /* 2D Arrays are nothging but matrix. Representation as follow:
         *     1 2 3
         *     4 5 6
         *     7 8 9
         */

        Scanner input = new Scanner(System.in); // creating scanner input object

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

        // getting elements from the user of 3 rows and 2 columns 
        int[][] array = new int[3][2];
        
        System.out.println("Rows present in array : "+array.length);
        
        for(int row = 0; row < array.length; row++) {
            // for each row getting elements of column size 2
            for(int col = 0; col < array[row].length; col++) {
                array[row][col] = input.nextInt();
            }
        }

        System.out.println("Printing the array elements : ");
        for(int row = 0 ; row < array.length; row++) {
            for(int col = 0; col < array[row].length ; col++) {
                System.out.print(array[row][col]+" ");
            }
            System.out.println();
        }

        // Printing 2 dimension array with multi-size column array
        System.out.println("Two Dimension with multi-size column: ");
        for(int i = 0 ; i < 3 ; i++) {
            System.out.println(Arrays.toString(array2D[i]));
        }

        //Enhanced for-loop for two-dimensional array 
        System.out.println("Using Enhanced for-loop :"); 
        for(int[] arr : array2D)
            System.out.println(Arrays.toString(arr));

        // Multidimensional array using dynamic array - ArrayList 
        // Declaring two-dimensional arraylist
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        
        // Initialzing arraylist into matrixArray 
        // in normal arrays we are declaring as new int[3][];
        for(int i = 0; i < 3 ; i++) {
            matrix.add(new ArrayList<>());
        }
        
        //Adding the elements
        for(int i = 0 ; i < 3; i++) {
            for(int j = 0 ; j < 3; j++) {
                matrix.get(i).add(input.nextInt());
            }
        }
        System.out.println(matrix);

        //Accessing the arraylist elements 
    }
}
