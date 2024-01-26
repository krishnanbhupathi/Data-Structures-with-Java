/* -> Decison making in programming is similar to decison-making in real life.In programming also we
 *    face some situations where we want a certain block of code to be executed when some condition 
 *    is fulfilled.
 * -> A programming language uses control statements to control the flow of execution of program based
 *    on certain condition.
 * -> The java if statement is used to test the condition.It checks the boolean conditions: true or false.
 *    There are various type of if statements in java
 * 
 * 1.If statement - if statement test the condition.Then it executes the if block only if condition is true.
 * 
 * 2.If-else statement - if-else statement also test the condition.Then it executes the if block only if 
 *   condition is true otherwise else block is execueted.
 *
 * 3.If-else-if ladder - The if-else-if ladder statement executes one condition from multiple statements.
 *
 * 4.Nested if statement - The nested if statement represents the if block within another if block. Here,
 *   the inner if block condition executes only when the outer if block condition is true.
 */

class DecisionMaking {

    public static void main(String args[]) {

        // Example for if statement
        int age = 21;
        if (age > 18) // checking the condition 
        {
            System.out.println("Age is greater than 18");
        }

        // Example for if-else statement
        int number = 19;
        if (number%2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }

        // Using ternary Operator
        String result = (number%2 == 0) ? "Even number" : "Odd number" ;

        System.out.println(result);

        // Example for if-else-if ladder
        int marks = 72;

        if (marks < 50) {
            System.out.println("Fail");
        } 
        else if (marks >= 50 && marks < 60) {
           System.out.println("Grade D");
        } 
        else if (marks >= 60 && marks < 70) {
           System.out.println("Grade C");
        } 
        else if (marks >= 70 && marks < 80) {
           System.out.println("Grade B");
        } 
        else if (marks >= 80 && marks < 90) {
           System.out.println("Grade A");
        } 
        else if (marks >= 90 && marks <= 100) {
           System.out.println("Grade A+");
        }
        else {
            System.out.println("Invalid input");
        } 

        //Example for Nested if statements
        age = 20;
        int weight = 48;

        if (age >= 18) {
            if (weight > 50) {
                System.out.println("You are eligible for blood donation");
            } 
            else {
                System.out.println("You are not eligible for blood donation");
            }
        }
        else {
            System.out.println("Age must be greater than 18");
        }


    }
}
