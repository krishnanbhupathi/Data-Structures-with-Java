import java.util.Scanner;

public class ValidPalindrome {

    static boolean helper(String s, int start,int end){
        while(start < end){
            if(s.charAt(start) != s.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
    static boolean validPalindrome(String s){
        int start = 0, end = s.length() - 1;

        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                return helper(s,start+1, end) || helper(s,start,end-1);
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        System.out.println(validPalindrome(s)? "true" : "false");
    }
}
// aba
//  se
