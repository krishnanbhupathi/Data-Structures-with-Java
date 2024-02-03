import java.util.Arrays;

class StringMethods {

    public static void main(String[] args) {

        String name = "Krishna";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase()); // converts each character to lowercase
        System.out.println(name.toUpperCase()); // converts each character to uppercase
        System.out.println(name.length()); // returns the length of string
        System.out.println(name.charAt(2)); // returns character at 2 index
        System.out.println(name.indexOf('a')); // returns index of first occurence 
        System.out.println(name.contains("i")); // checks if string contain i string
        System.out.println(name.startsWith("K")); // checks if string starts with specified string
        System.out.println(name.endsWith("a"));
        
        // methods for string builder
        StringBuilder string = new StringBuilder("Krishna");
        System.out.println(string);

        //another way
        StringBuilder anotherString = new StringBuilder();
        anotherString.append("Krishna"); // append() method is used to append the values at end of string
        System.out.println(anotherString);

        anotherString.insert(0,"Bhupathi "); // insert() used to insert new string at specified position
        System.out.println(anotherString); 
        anotherString.delete(0,9); // delete() used to delete string from start to end index
        System.out.println(anotherString);
    }
}

