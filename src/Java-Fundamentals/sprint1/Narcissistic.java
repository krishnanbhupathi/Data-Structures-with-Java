package sprint1;

import java.util.Scanner;

public class Narcissistic {

    static int digitCount(int n){
        int count = 0;
        while(n > 0){
            count++;
            n /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 153
        int temp = n;
        int digits = digitCount(n); // 3
        int sum = 0;
        while(temp > 0){
            int lastDigit = temp%10;  // 1
            int summation = 1;
            for(int i = 1; i <= digits; i++){ // 3 iterations
                summation *= lastDigit; // 1 * 1 * 1
            }
            sum += summation; // 152 + 1 = 153
            temp = temp/10; // 153 -> 15 -> 1
        }

        if(n == sum){
            System.out.println("NARCISSISTIC NUMBER");
        }else{
            System.out.println("NOT A NARCISSISTIC NUMBER");
        }
    }
}
