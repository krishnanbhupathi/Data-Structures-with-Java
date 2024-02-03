// Problem : Take integer n as input from user and print sum of first n natural numbers.
import java.util.Scanner;

class NaturalSum {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter input N: ");
        int N = input.nextInt();

        int sum = 0;
        for(int i = 1 ; i <= N ; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of "+N+" natural numbers is "+sum+".");
        System.out.println("Sum of "+N+" natural number using formula is "+naturalSum(N)+".");
    }

    static int naturalSum(int n) {
        return (n*(n+1))/2;
    }
}
