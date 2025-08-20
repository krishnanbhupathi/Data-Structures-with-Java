package sprint1;

import java.util.ArrayList;

public class SubStrings {

    public static ArrayList<String> findSubStrings(String s){
        ArrayList<String> result = new ArrayList<>();

        for(int i = 0; i < s.length(); i++){

            for(int j = i; j < s.length(); j++){
                String sub = s.substring(i, j+1);
                result.add(sub);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "aabxcaabbbaa";

        System.out.println(findSubStrings(s));
    }
}
