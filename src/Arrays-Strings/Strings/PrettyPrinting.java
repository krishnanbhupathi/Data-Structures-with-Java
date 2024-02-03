import java.util.ArrayList;

class PrettyPrinting {

    public static void main(String[] args) {

        float num = 342.12375f;
        System.out.printf("Formatted number is %.3f\n",num);
        
        System.out.println(Math.PI);
        System.out.printf("Formatted PI value is %.2f\n",Math.PI);

        System.out.printf("My name is %s and I am %s.%n","Krishna","cool");
        /*There are many format specifiers we can use. Here are some common ones:
         * %c - Character
         * %d - Decimal number (base 10)
         * %e - Exponential floating-point number
         * %f - Floating-point number
         * %i - Integer (base 10)
         * %o - Octal number (base 8)
         * %s - String
         * %u - Unsigned decimal (integer) number
         * %x - Hexadecimal number (base 16)
         * %t - Date/time
         * %n - Newline
         */

        System.out.println('a' + 'b'); // print sum of ascii values
        System.out.println("a" + "b"); // print ab
        System.out.println((char)('a' + 1)); // prints b
        
        System.out.println("a" + 1); // same as "a" + "1" 
        // integer will be converted to Integer and calls toString() method
        
        System.out.println("Krishna" + new ArrayList<>());
        System.out.println("Krishna" + Integer.valueOf(12));

        String ans = Integer.valueOf(1) +"_"+ new ArrayList<>();
        System.out.println(ans);
    }
}
