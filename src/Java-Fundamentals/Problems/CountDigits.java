package Problems;

public class CountDigits {

    public static void main(String[] args) {
        int n = 46512;

        int digitCount = 0;

        while(n > 0){
            n = n / 10;
            digitCount++;
        }
        System.out.println(digitCount);
    }
}
