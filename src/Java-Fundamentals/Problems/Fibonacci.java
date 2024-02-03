// Problem : To calculate Fibonacci Series up to n numbers.
import java.util.Scanner;

class Fibonacci {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the input: ");
        int n  = input.nextInt();
        long a = 0 , b = 1, next;
        System.out.print("Fibonacci series is: "+a+" "+b+" ");
        while ( n != 0 ) {
            next = a + b;
            System.out.print(next+" ");
            a = b;
            b = next;
            n -= 1;
        }
    }
}
