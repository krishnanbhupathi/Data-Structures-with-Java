package Problems;

import java.util.HashMap;
import java.util.Map;

public class MaxCharacter {

    public static void main(String[] args) {
        String s = "geeksforgeeks";

        char[] st = s.toCharArray();

        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch : st){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        System.out.println(map);

        Integer maxFreq = -1 ;
        Character ans = ' ';

        for (Map.Entry<Character, Integer> entry : map.entrySet()){

            Character character = entry.getKey();
            Integer freq = entry.getValue();
            if(freq > maxFreq){
                ans = character;
                maxFreq = freq;
            }
            System.out.println(ans);
        }
        System.out.println(ans);


    }
}
