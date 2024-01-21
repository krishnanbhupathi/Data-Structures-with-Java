/* In java various streams with its I/O package that helps that user perform all java 
 * input-output operations.These streams supports all types of objects,data types etc..
 * to fully execute I/O operations.There are two method to read input from user
 * 1)BufferedReader class
 * 2)Scanner class
 *
 * Scanner class is advanced version of taking input in java.(adv version of BufferedReader)
 * Scanner can read formatted input and it has different functions for different data types.
 * we need to import Scanner class from util package and create instance of scanner class.
 *  Scanner <obj_name> = new Scanner(System.in);
 *
 *  There are some inbuilt Scanner functions
 *  nextInt() - used to read integer value from user
 *  nextShort() - used to read short value from user
 *  nextLong() - used to read long value from user
 *  nextByte() - used to read byte value from user
 *  nextFloat() - used to read float value from user
 *  nextDouble() - used to read double value from user
 *  nextBoolean() - used to read boolean value from user
 *  next() or nextLine() - used to read strings from user
 *
 *  There are some other functions are their similar to these 
 *  hasNextInt() - returns a boolean value true or false
 *                 It is used to check if the next input token is int data type or not.if 
 *                 the data type is int returns true else false.
 *  hasNext() , hasNextShort() ... etc 
 * Sytem.out.print(); covered in first java program
 * print() - takes single parameter.This method prints the text on console and curser remains 
 *           in same line, next printing takes from the just here.
 * println() - takes single parameter.This method prints the text on console and curese goes 
 *             to next line of the console.bascially printing in single line.
 * System.err - This is standard error stream that is used to output all the error data that 
 *              a program might throw.useful in debugging programs.
 * Syntax: System.err.print("Error Message");
 * 
 * Output formatting similar to printf() in c.
 * printf() - this function is used to print the output in specific format.Similar to printf()
 *            function in c.
 *           - For number formatting
 *           - For Boolean formatting
 *           - For character formatting
 *           - For String formatting
 *           - For Date and time formatting ...etc 
 */

import java.util.Scanner;
import java.util.Date;

class InputOutput {
    
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in); //Scanner object
        
        String employeeName = input.nextLine();

        int age = input.nextInt();

        double salary = input.nextDouble();
       
        System.out.println("Employee Name: "+employeeName);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);

        input.close();

        int a = 10000;

        System.out.printf("%,d%n",a);

        double d = 3.14159265359;

        System.out.printf("%f\n",d);
        System.out.printf("%.3f\n",d);
        System.out.printf("%.2f\n",d);

        Boolean b = true , c = false;
        Integer e = null;

        System.out.printf("%b\n",a);
        System.out.printf("%B\n",b);
        System.out.printf("%b\n",c);
        System.out.printf("%B\n",e);
            
        char ch = 'c';

        System.out.printf("%c\n",ch);
        System.out.printf("%C\n",ch);

        String name = "krishna";
        String place = "PARIS";

        System.out.printf("%s\n",name); 
        System.out.printf("%S\n",name); // lower-case to upper-case
        System.out.printf("%s\n",place); // upper-case to lower-case not possible                               

        Date time = new Date();
        
        System.out.printf("Current Time: %tT\n",time); 
        System.out.printf("Hours: %tH Minutes: %tM Seconds: %tS\n",time,time,time);
        System.out.printf("%1$tH: %1$tM: %1$tS %1$tp %n",time);
    }
}
