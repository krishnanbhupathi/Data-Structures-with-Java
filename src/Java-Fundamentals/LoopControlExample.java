/* -> In java, loop control refers to the mechanism used to manage the control flow and behaviour
 *    of loops. Java provides various loop controls statements such as break and continue to alter
 *    the normal execution flow of loop.
 *  
 *  1.break - The break statement is used to exit a loop perminently. When we encounter a break 
 *            statement within the loop, the break satement causes the program to immediate exit
 *            of the loop, regardless of loop condition has been met or not.
 *  
 *  2.continue - The continue statement is used to skip the current iteration and proceed directly
 *               to next iterations in the loop. It particularly used when certain iteration of the 
 *               loop should be skipped based on specific condition.
 */

class LoopControlExample {

    public static void main(String args[]) {

        // Example for break statement using do-while loop

        int i = 0;
        do {
            if (i == 3) {
                break; // exit do-while loop when i equals to 3
            }
            System.out.print(i+" ");
            i = i + 1;
        } while (i < 5);
        System.out.println();

        // Example for continue statment using do-while loop
        i = 0;
        do {
            if (i == 2) {
                i++;  
                continue; // Ignore the iteration when i equals to 2
            }
            System.out.print(i+" ");
            i += 1;  
        } while (i < 5);
        System.out.println();

        // Another example for break and continue statements
        for(int x = 0 ; x < 15 ; x +=1) {
            if (x%2 == 0) 
                continue; // ignore all the even numbers 
            System.out.print(x+" ");
        }
        System.out.println();

        for(int x = 0 ; x < 10 ; x += 1) {
            if (x == 5)
                break; // exits the loop when x equals to 5
            System.out.print(x+" ");
        } 

    }
}
