package sprint1;

import java.util.Scanner;

import static sprint1.PrimeNumber.isPrime;

public class RangePrime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();

        for(int i= start; i <= end; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
}
