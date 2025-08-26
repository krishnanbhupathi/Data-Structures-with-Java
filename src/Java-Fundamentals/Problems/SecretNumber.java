// problem: https://codeforces.com/contest/2132/problem/B
package Problems;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SecretNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            Set<Long> xValues = new TreeSet<>();
            for(int k = 1; ; k++){
                long powTen = (long)  + Math.pow(10,k);
                powTen += 1;
                if(powTen > n)
                    break;
                if(n%powTen == 0)
                    xValues.add(n/powTen);
            }
            if(xValues.isEmpty())
                System.out.println(0);
            else{
                System.out.println(xValues.size());
                for(long val: xValues){
                    System.out.print(val+" ");
                }
                System.out.println();
            }
        }
    }
}
