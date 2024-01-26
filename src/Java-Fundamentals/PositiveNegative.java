//Java program to check if given number is Positive or Negative or Zero.
//Example for if-else ladder and nested-if statement

import java.util.Scanner;

class PositiveNegative {

    public static void main(String args[]) {

        // creating scanner object to take input
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the number: ");
        int number = input.nextInt();

        //Using if-else ladder
        if (number > 0) {
            System.out.println("Positive");
        } 
        else if(number < 0) {
            System.out.println("Negative");
        }
        else {
            System.out.println("Zero");
        }

        //Using Nested-if statement
        if (number >=0) {
            if (number==0) {
                System.out.println("Zero");
            } 
            else {
                System.out.println("Positive");
            }
        } else {
            System.out.println("Negative");
        }
        input.close();
    }
}
