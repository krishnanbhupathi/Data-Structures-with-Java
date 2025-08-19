package sprint1;

import java.util.Arrays;
import java.util.Scanner;

public class Palindrome {

    // method 1
    static void checkPalindrome(String s){
        int start = 0, end = s.length() - 1;

        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                System.out.println("Not a Palindrome");
                return;
            }else{
                start++;
                end--;
            }
        }
        System.out.println("Palindrome");
    }

    static String reverseString(String s){
        StringBuilder sb = new StringBuilder("");
        for(int i = s.length()-1; i >= 0; i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = s.toLowerCase();
        String reverse = reverseString(s);
        System.out.println(s+"-"+reverse);

        // method 2
        if(s.equals(reverse)){
            System.out.println("PALINDROME");
        }else{
            System.out.println("NOT A PALINDROME");
        }
        checkPalindrome(s);
    }
}
