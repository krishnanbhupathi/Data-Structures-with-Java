/*
 * Problem Statement: Write a java program to create a ATM transaction.In the ATM program, the
 * user has to select an option displayed on the screen.The options are shown below:
 *
 * 1.Withdraw the amount - we simply get the withdrawal amount from user and remove the amount 
 *                        from total balance and print successful message.
 *
 * 2.Deposite the amount - we simply get the deposit ammount from the user,add it to the total
 *                        balanceand print the successful message.
 *
 * 3.Check balance - we simply print the total balance of user.
 *
 * 4.Exit - Exit from the current transaction mode and return the user to initial screen.
 */

import java.util.Scanner;

class ATMExample {

    public static void main(String args[]) {

        //Declare and initialize balance, withdraw and deposite
        int balance = 300000, withdraw, deposite;

        //Creating Scanner object to get input from user
        Scanner input = new Scanner(System.in);

        while (true) { 
            System.out.println("Automated Teller Machine");
            System.out.println("Choose 1 for withdraw");
            System.out.println("Choose 2 for deposite");
            System.out.println("Choose 3 for check balance");
            System.out.println("Choose 4 for exit");

            // Getting the choice from user
            int choice = input.nextInt();

            switch (choice) {
               case 1 :
                   System.out.println("Enter the amount to withdraw");

                   //getting withdraw amount from user 
                   withdraw = input.nextInt();

                   //checking if available balance is sufficient to withdraw
                   if (balance >= withdraw) {
                       balance -= withdraw;
                       System.out.println("Please collect your amount");
                   } 
                   else {
                       System.out.println("Insufficient amount");
                   }
                   System.out.println("");
                   break;

               case 2:
                   System.out.println("Enter the amount to deposite");

                   //getting deposite amount from user
                   deposite = input.nextInt();

                   //Adding despoiste amount to the user balance
                   balance = balance + deposite;

                   System.out.println("Your amount has been deposited Successfully");
                   System.out.println("");
                   break;

               case 3:
                   System.out.println("Balance :"+balance);
                   System.out.println("");
                   break;
                   
               case 4:
                   // using exit() to exit from menu
                   // exit() - This method to exit the program at any point by terminating running JVM,based on
                   //          conditions or programming logic. exit() present in java.lang.System class.
                   System.exit(0);
            }
        }
    }
}
