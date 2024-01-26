/* -> Labeled For Loop : we can have name of each java for loop.To do so, we use lable 
 *                     before the for loop.It is useful while using the nested for loop
 *                     as we can break/continue a specific loop.
 *  
 * -> Syntax : lablename:
 *           for (initialization; condition; updation) 
 *              // body of for loop
 * -> Break and continue keywords are used to break/continue innermost for loop respectively. 
 */

class LabeledForLoop {

    public static void main(String args[]) {

        // outer for loop
outerloop:
        for (int i = 1; i <= 3; i++) {
            //inner for loop
innerloop:
            for (int j = 1; j <= 3; j++) {
                if (i==2 && j==2)
                    break outerloop;
                else
                    System.out.println(i+" "+j);
            }
        }

    }
}
