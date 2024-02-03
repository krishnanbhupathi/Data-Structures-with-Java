// Problem: Take name as input and print a greeting message for that particular name.

import java.util.Scanner;

class Greeting {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // creating scanner object

        System.out.print("Enter you name : ");
        String name = input.nextLine();
        System.out.print("Welcome! "+name+".");
    }
}
