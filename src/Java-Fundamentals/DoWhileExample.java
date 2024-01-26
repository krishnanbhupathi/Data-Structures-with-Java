/* -> In java, do-while loop is a control flow statement that execute a block of code repeatedly
 *    until a specified condition evalutes to false. Unlike while loop, Do-while loop which test
 *    the condition before entering the loop, do-while loop executes the loop body for the first
 *    iteration and then evaluates the condition.
 *    
 *    Syntax: do {
 *              // statements to execute
 *            } while (condition);
 * -> Infinite while possible with do-whil
 *    do{
 *      // statements to execute
 *    } while (true);
 */

import java.util.Scanner;

class DoWhileExample {

    public static void main(String args[]) {

        // Example for do-while loop
        int value = 1;
        do {
            System.out.print(value+" ");
            value += 1;
        } while (value <= 10);
        System.out.println();
          
        // The java program that prompts the user to guess the number the between 1 and 10.The loop
        // continues until the user gusses the correct number.

        Scanner input = new Scanner(System.in);
        
        // Generating a random number between 1 and 10.
        int randomNumber = (int) (Math.random()*10) + 1;
        int guess;
        boolean correctGuess = false;

        // Loop until the user gusses correct number
        do {
            System.out.print("Guess a number between 1 to 10: ");
            guess = input.nextInt();

            if (guess == randomNumber) {
                System.out.println("Congratulations! You guessed the correct number");
                correctGuess = true;
            } else {
                System.out.println("Incorrect guess, Try again!");
            }
        } while( !correctGuess);

        // Finding the factorial of given number

        System.out.print("Enter the number to get Factorial: ");
        int number = input.nextInt();
        int factorial = 1 , count = 1;
        do {
            factorial *= count;
            count++;
        } while (count <= number);
        System.out.printf("Factorial of %d is : %d ",number,factorial);

        input.close();
    }
}
