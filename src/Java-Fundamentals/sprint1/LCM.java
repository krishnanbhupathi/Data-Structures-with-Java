package sprint1;

import java.util.Scanner;

public class LCM {
    // find the greater number among a,b
    // check if the greater number divisible by both a and b.
    // if it is divisible then it is lcm
    // otherwise , increase the greater value and again check for divisibility

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();

        int greater = Math.max(a, b);
        while(true){
            if(greater%a == 0 && greater%b ==0){
                System.out.println("LCM->"+greater);
                break;
            }
            greater += 1;
        }
    }
}
