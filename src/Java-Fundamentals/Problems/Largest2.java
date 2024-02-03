// Problem : Take 3 numbers as input and print the largest number.
import java.util.Scanner;

class Largest2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a, b, c;
        System.out.print("Enter first number: ");
        a = input.nextInt();
        System.out.print("Enter second number: ");
        b = input.nextInt();
        System.out.print("Enter third number: ");
        c = input.nextInt();
        
        if ((a > b) && (a > c))
            System.out.print(a+" is largest among "+a+", "+b+" and "+c);            
        else 
            if (b > c)
                System.out.print(b+" is largest among "+a+", "+b+" and "+c);
            else
                System.out.print(c+" is largest among "+a+", "+b+" and "+c);

    }
}
