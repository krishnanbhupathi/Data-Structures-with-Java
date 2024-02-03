// Problem : Take 4 numbers as input and print the largest number.
import java.util.Scanner;

class Largest3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a, b, c, d;
        System.out.print("Enter first number: ");
        a = input.nextInt();
        System.out.print("Enter second number: ");
        b = input.nextInt();
        System.out.print("Enter third number: ");
        c = input.nextInt();
        System.out.print("Enter fourth number: ");
        d = input.nextInt();

        if ((a > b) && (a > c) && (a > d))
                System.out.print(a+" is largest among "+a+", "+b+", "+c+" and "+d);
        else if((b > c) && (b > d))
            System.out.print(b+" is largest among "+a+", "+b+", "+c+" and "+d);
        else 
            if (c > d)
                System.out.print(c+" is largest among "+a+", "+b+", "+c+" and "+d);
            else 
                System.out.print(d+" is largest among "+a+", "+b+", "+c+" and "+d);
    }
}
