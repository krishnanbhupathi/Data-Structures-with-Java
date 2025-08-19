package sprint1;
import java.util.Scanner;

public class PrimeNumber{

    public static boolean isPrime(int n){
        if(n == 1)
            return true;
        for(int i = 2; i*i <= n; i++){
            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if(isPrime(n)) {
            System.out.println("Prime");
        }else{
            System.out.println("Not a prime");
        }
    }
}