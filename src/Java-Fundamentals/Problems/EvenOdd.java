// Problem:  Write a program to print whether a number is even or odd, also take input from the user.

import java.util.Scanner;

class EvenOdd {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter input :");
        int number = input.nextInt();

        if (number%2 == 0)
            System.out.println(number+" is Even number.");
        else
            System.out.println(number+" is Odd number.");
    }
}
