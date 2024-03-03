// Problem : https://leetcode.com/problems/merge-strings-alternately/

import java.util.Scanner;

class MergeString {

    String mergeString(String word1, String word2) {
        int x = 0;
        StringBuilder result = new StringBuilder();
        while (x < word1.length() || x < word2.length()) {
            if (x < word1.length())
                result.append(word1.charAt(x));
            if (x < word2.length())
                result.append(word2.charAt(x));
            x++;
        }
        return result.toString();
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String word1 = input.nextLine();
        String word2 = input.nextLine();
        
        MergeString object = new MergeString();
        String ans = object.mergeString(word1, word2);
        System.out.println(ans);
    }
}
