// Problem : Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

class SimpleIntrest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float principal, rate, time, simple_intrest;
        System.out.print("Enter principal amount:");
        principal = input.nextFloat();
        System.out.print("Enter rate of intrest:");
        rate = input.nextFloat();
        System.out.print("Enter time period:");
        time = input.nextFloat();

        simple_intrest = (principal * rate * time) / 100;
        System.out.print("The simple intreset is "+simple_intrest);
    }
}
        
