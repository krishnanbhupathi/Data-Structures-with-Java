/*
 * Variable - A variable is container which holds the value while java Program is exicuted.A variable
 * is assigned with dataType.Basically, it it name of memory location.
 * There are three types of variables 1) Local Variables
 *                                    2) Instance Variables
 *                                    3) Static Variables
 * 
 * Local Variables - A variable declared inside body of a method then it is local variable.You can only
 *                  use this variable within this method, Other method in this class don't even know this
 *                  variable existance.(It cannot be static variable)
 * Instance Variable - A variable declared inside the class but outside the body of the method is called
 *                     instance variables.(Not declared as static)
 * Static Variable - A variable declared as static then it is static variable.You can create single copy
 *                  of this static variable and share it among all the instance of class.Memory allocation
 *                  for static variable happens only when the class is loaded in the memory.
 */
public class Variables {

    static int staticVariable = 20; // static variable

    void method() {
        int data = 1; // Local Variable
        System.out.println(data);
    }
    public static void main(String[] args) {
        // Instance variable
        int a = 20; 
        // Here data is variable and 20 is value stored in data
        int b = 10;
        int c = a + b;
        System.out.println(c);   

        // Example for Widening
        int x = 10;
        float f = x;
        System.out.println(x);
        System.out.println(f);

        // Example for Narrowing (TypeCasting)
        float fvalue = 10.5f;
        int data = (int)fvalue;
        System.out.println(fvalue);
        System.out.println(data);
    }
}
