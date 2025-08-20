package sprint1;

public class LongestPalindrome {

    public static boolean  isPalindrome(String s, int start, int end){
        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static String longestPalindrome(String s){ // O(n^3)
        if(s == null || s.length() < 1){
            return "";
        }
        String longest = "";
        int n = s.length();
        for(int i = 0; i < n; i++){
            for(int j = i; j < n ; j++){
                if(isPalindrome(s, i, j) && (j - i + 1) > longest.length()){
                    System.out.println(longest);
                    longest = s.substring(i,j+1);
                }
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        String s = "aabbaac";
        System.out.println(longestPalindrome(s));

        int n = 6;

        int val = 1;
        for(int i = 1; i <= n ; i++){
            for(int j = 1; j <= n ; j++){
                System.out.print(val + " ");
                val++;
            }
            System.out.println();
        }
    }
}


// 1.First find all the substrings
// 2.iterate over the substrings
//      a. You need to check for unique characters
//          if it is unique then check for longer length
// 3.repeat the process for all substring and return result.


