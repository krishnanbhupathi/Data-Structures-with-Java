/* -> The java while loop is used to iterate a part of the program repeatedly until
 *    the specific boolean condition is true.As soon as the boolean condition is false
 *    while loop automatically stops.
 * -> The while loop is considered as repeated if loop.if the number of iterations are 
 *    not fixed, we can use while loop.
 *
 * Syntax: while (expression) {
 *              // body part
 *              update_expression;
 *         }
 * expression - if this expression is true after evaluation then the body part of the 
 *              code executed and then goes to update that expression.
 *
 * update_expression - After executing the body part of while loop the expression has to
 *                     update either increment or decrement,to avoid infinite loop.        
 *
 * Infinite While loop
 *  we can create infinite while loop by passing true in condition
 *  the condition never turn into false
 *
 *  while (true) {
 *      // infine loop
 *  }
 */

import java.lang.Math;

class WhileLoop {
    public static void main(String args[]) {

        int count = 0;
        while (count < 5) {
            System.out.println("Count : "+count);
            count = count + 1;
        }

        // Example to get the sum of first 10 natural numbers
        count = 1;
        int sum = 0;
        while (count <= 10) {
            sum += count;
            count++;
        }
        System.out.println(sum);

        // Example for Nested while loop
        int i = 0;
        while (i < 3) {   //outer while loop
            int j = 0;
            while (j < 3) {  //inner while loop
                System.out.println("i-> "+i+" j-> "+j );
                j++;
            }
            i++; 
        }

        // We can combine while and for loop for Nested loops 
        // Example for combined nested loops is print primeFactors of number
        int number = 80085;

        System.out.printf("Prime Factors of %d are ",number); 
        while (number%2 == 0) {
            System.out.print(2+" ");
            number /= 2;
        }

        for(i = 3; i < Math.sqrt(number); i += 2) {

            while (number%i == 0) {
                System.out.print(i+" ");
                number /= i;
            }
        }

        if (number > 2)
            System.out.print(number+" ");
    }
}
