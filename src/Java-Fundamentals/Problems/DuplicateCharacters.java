package Problems;

import java.util.HashSet;

public class DuplicateCharacters {

    public static void main(String[] args) {
        String s = "ananth kumar";

        char[] charArray = s.toCharArray();

        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < charArray.length; i++){
            for(int j = 0; j < charArray.length; j++){
                if(i != j && charArray[i] == charArray[j]){
                    set.add(charArray[i]);
                }
            }
        }
        System.out.println(set);
    }
}


//charArray = {'a', 'n', 'a', 'n', 't',}