/*    Switch Statement in Java.
 * -> The switch statement is a multi-way branch statement.In simple words, the java switch statement executes
 *    one statement from multiple conditions. It provides an easy way to dispatch execution to different parts
 *    of code based on the value of expression.
 * 
 * -> The switch statemetn works with byte, short, int, long, enum type, String and some Wrapper types like Byte,
 *    Short, Int and Long.In simple words, switch statement tests the equality of variables against multiple values.
 *
 * Points to remember while using switch statement:
 * 1.There can be one or N number of case values for Switch expression.
 *
 * 2.The case value must be of switch expression type only.The case value must be literal or constant.It won't allow
 *   keywords. 
 *
 * 3.The case value must be unique.In case of duplicate value, it renders compile-time-error.
 *
 * 4.Each case statement can have a break statement which is optional.when the control reaches to the break statement,
 *   it jumps the control after the switch expression.If break statement is not found it executes the next case.
 *
 * 5.The case value can have default label, it execute when non of the case executed.It is optional.
 */

import java.util.Scanner;

class SwitchCase {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        
        //Example using switch expression
        System.out.println("Enter the input month :");
        int month = input.nextInt();

        //Storing the result
        String result = "";

        switch (month) {
            case 1:
                result = "January";
                break;
            case 2:
                result = "February";
                break;
            case 3:
                result = "March";
                break;
            case 4:
                result = "April";
                break;
            case 5:
                result = "May";
                break;
            case 6:
                result = "June";
                break;
            case 7:
                result = "July";
                break;
            case 8:
                result = "August";
                break;
            case 9:
                result = "September";
                break;
            case 10:
                result = "October";
                break;
            case 11:
                result = "Novomber";
                break;
            case 12:
                result = "December";
                break;
            default:
                result = "Invalid Month!";
        }

        // printing the result of input month
        System.out.println(result);
        
        // To prevent resource leak always close scanner object
        input.close();
    }
}
