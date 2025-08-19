package sprint1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class GCD {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        int result = (int)Math.min(a,b);
        while(result > 0){
            if(a%result == 0 && b%result == 0){
                System.out.println("RESULT "+result);
                break;
            }
            result--;
        }
    }
}
