
class Palindrome {

    public static void main(String[] args) {

        String s1 = "abcba";
        String s2 = "abaaaba";
        String s3 = "abc";
        System.out.println(isPalindrome(s1));
        System.out.println(isPalindrome(s2));
        System.out.println(isPalindrome(s3));
    }

    static boolean isPalindrome(String string) {
        if(string == null || string.length()==0)
            return true;

        string = string.toLowerCase();
        
        for(int i = 0 ; i < string.length()/2 ; i++) {
           char start = string.charAt(i);
           char end = string.charAt(string.length()-i-1);
           if(start != end)
               return false;
        }
        return true;
    }
}
