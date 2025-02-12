package Problems;

public class VowelCount {


    static int vowelCount(String s){
        int count = 0;

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "hello world";

        String b = "ananth vijay";

        System.out.println(vowelCount(s));
        System.out.println(vowelCount(b));

    }
}
