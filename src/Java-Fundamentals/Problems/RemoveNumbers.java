package Problems;

public class RemoveNumbers {

    public static void main(String[] args) {
        String s = "an1an11th23vij12jakka3";

        StringBuilder ans = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                continue;
            }else {
                ans.append(ch);
            }
        }
        System.out.println(ans);
    }
}
