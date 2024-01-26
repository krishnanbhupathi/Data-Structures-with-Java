/* -> Loop statements are used to repeat a block of code/program for doing certain task within
 *    a certain time period. Looping statements in java is continous execution until the 
 *    evalution of expression turns out to be false.
 *
 * -> The Java for loop is used to iterate the part of program/code serveral times. If the 
 *    number of iterations are fixed, it is recommended to use for loop.
 *
 * -> There are three types of for-loops in java.They are
 *    1.Simple for-loop (Nested for-loop comes under this)
 *    2.for-each loop
 *    3.Labled for-loop
 *    
 * Simple for loop is divided into various parts
 * a.Initialization Expression - we have to initialize the counter to some value.
 *
 * b.Test Expression - In this expression, we have to test the conditon, if the condition evaluate
 *                     true,we will execute the body of for loop and then we will go to update 
 *                     expression.If the condition is false, we will exit from for-loop.
 *
 * c.Update Expression - After executing the body of for loop, this expression increment/decrement
 *                       the loop variable by some value.
 *
 */


import java.util.Scanner;

class ForLoop {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number to get multiples :");
        int number = input.nextInt();
        
        // Printing first 10 multiples of number using for loop
        for (int i = 1 ; i <= 10; i++) {
            System.out.print(number*i+" ");
        } 
        System.out.println("");

        //Nested For loops - if we have a loop inside the another loop, it is known as nested loop.The
        //                   inner loop executed completly whenever the outer loop executes.
        //Example for nested loop is printing grid of starts(*)

        System.out.println("Square Grid of 5x5 : ");
        for (int x = 0; x < 5 ; x++) {
            for (int y = 0 ; y < 5 ; y++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        //Java For-each loop is used to traverse the arrray or Collection in java.It is easier to use than
        //simple for loop , don't need to do increment/decrement and subscript notation.It works on the basis
        //of element not on the index.It return the values one by one in the defined variable.

        int[] numbers = {10, 20, 30, 40, 50};

        //Iterating over the numbers array using for-each loop
        for (int num : numbers) {
            System.out.print(num+" ");
        }
        System.out.println();
            
        input.close();
    }
}
