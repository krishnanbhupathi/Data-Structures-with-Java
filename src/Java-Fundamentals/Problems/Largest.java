// Problem : Take 2 numbers as input and print the largest number.
import java.util.Scanner;

class Largest {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a , b;
        System.out.print("Enter first number: ");
        a = input.nextInt();
        System.out.print("Enter second number: ");
        b = input.nextInt();
        if (a > b)
            System.out.print(a+" is largest among "+a+" and "+b);
        else
            System.out.print(b+" is largest among "+b+" and "+b);
    }
}
