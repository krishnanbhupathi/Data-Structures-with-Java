import java.util.Scanner;

class stringsExample {

    public static void main(String[] args) {

        String name = "Krishna";
        System.out.println(name);
        
        char[] ch = {'K','r','i','s','h','n','a'};
        String name1 = new String(ch);

        // The below statement will do same as above two statements
        String a = "krishna";
        System.out.println(a);
        a = "Murali"; // Here i'm not changing instead creating new object
        System.out.println(a);

        // Comparison of two strings
        String x = new String("name");
        String y = new String("name");

        System.out.println(x == y); // return false. coz, == compares both values and objects
        System.out.println(x.equals(y)); // return true 
        // equals() method is used to equality of values between two different objects  

        String xx = "Krishna";
        String yy = xx; // This way of storing also uses string pool
        System.out.println(yy == xx); // returns true
                                      
        // To access every character in a string
        for(int i = 0 ; i < xx.length() ; i++) {
            System.out.print(xx.charAt(i)+" ");
        }
        System.out.println();
    }
}
