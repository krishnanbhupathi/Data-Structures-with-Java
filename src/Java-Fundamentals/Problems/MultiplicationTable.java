// Problem: Take integer n as input and print multiplication table upto 20.
import java.util.Scanner;

class MultiplicationTable {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number to get table: ");
        int number = input.nextInt();

        for(int i = 1; i <= 20; i++) {
            System.out.println(number+" x "+i+" = "+number*i);
        }
    }
}
