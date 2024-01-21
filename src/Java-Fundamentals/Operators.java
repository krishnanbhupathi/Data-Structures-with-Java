/*
 * Operators: Operators in java is a symbol that are used to perform operations. Example +,-,/..etc
 * There are many types of operators in java
 * 1.Unary Operator - unary operator require only one operand.This operator used to perform various
 *                     operations as follow:
 *                    a.Increment/Decrement a integer
 *                    b.Negating a expression
 *                    c.Inversion of boolean value
 *
 * 2.Arithmetic Operator - Arithmetic operator used to perfrom addition, subtraction,multiplication
 *                         and divison.
 *
 * 3.Shift Operator - There are two type of shift operators in java
 *                    a.Left shift
 *                    b.Right shift
 * Left shift - The java left shift operator << is used to shift all the bits in a value to the left
 *              side of a specified number of times.
 * Right shift - The java right shift operator >> is used to shift all the bits in a value to the 
 *               right side of a specified number of times.
 *
 * 4.Bitwise Operator - Bitwise operators used to perfroming the manipulating bits in a number.They
 *                      can be used with any integer (int,short,char etc).
 * a.Bitwise OR(|) - It returns bit by bit OR of input values,if either of bits is 1,it gives 1,else
 *                  it shows 0.
 * b.Bitwise AND(&) - It returns bit by bit AND of input values, if both bits are 1, it gives 1,else
 *                    it shows 0.
 * c.Bitwise XOR(^) - It returns bit by bit XOR of input values, if corresponding bits are different
 *                    it gives 1, else gives 0. 
 * d.Bitwise Complement(~) - It returns bit by bit one's complement of input value,with all inverted
 *                          bit values,means it gives 0 when it is 1 and 0 when it is 1.
 *
 * 5.Logical Operator - Logical operators are used making decisions in programming based on some other
 *                      conditions.Logical operators that used to combine multiple conditional statement.
 * Three types of logical operators are there AND , OR and NOT.
 * AND operator - returns true when both conditions are true,else return false.
 * OR operator - returns truen if anyone of the conditions is true, else return false.
 * NOT operator - operator accept single value and returns inverse of the value.This is unary operator
 *                unlike AND and OR.
 *
 * 6.Relational Operator - Java relational operators are a bunch of binary operators used to check for
 *                         relations between two operands,including equality, greater than,less than etc.
 *                         They return a boolean result after the comparision and are extensively used in
 *                         looping statements as well as if-else statements.
 * 7.Ternary Operator - Java ternary operator is used as one line replacement for if-then-else statement 
 *                      and used a lot in java programming.It is the only conditional operator which takes
 *                      three operands.
 *  Syntax: (condition) ? true : false ;
 *
 * 8.Assignment Operator - Java assignment operator is one of the most common operators.It is used to assign
 *                         the value on its right to the operand on its left.some of the operators show below
 *                        =, += , -=, *=, /= ,&= ..etc
*/

class Operators {

    public static void main(String args[]) {

        int x = 10;
        
        System.out.println(x++); //prints 10 and x = 11
        System.out.println(++x); //prints 12 and x = 12
        System.out.println(--x); //prints 11 and x = 11
        System.out.println(x--); //prints 11 and x = 10
                         
        int a = 10, b = 10;

        System.out.println(a++ + ++a); //10 + 12 = 22
        System.out.println(b++ + b++); //10 + 11 = 21

        //negation(~) operator variable = -variable - 1;
        a = 10;  b = -10;

        System.out.println(~a); // -10 - 1 = -(10+1) = -11 prints -11
        System.out.println(~b); // -(-10)-1 = 10-1 = 9     prints 9 

        boolean c = true , d = false;

        System.out.println(!c); // prints false
        System.out.println(!d); // prints true

        a = 10 ;  b = 5; 
        
        System.out.println(a+b); // prints 15
        System.out.println(a-b); // prints 5
        System.out.println(a*b); // prints 50
        System.out.println(a/b); // prints 2
        System.out.println(a%b); // prints 0
                                
        System.out.println(12<<4); //12*2^4 = 12*16 = 192 prints 192
        System.out.println(10<<3); //10*2^3=10*8=80  
        System.out.println(20<<2); //20*2^2=20*4=80  
        System.out.println(15<<4); //15*2^4=15*16=240  

        System.out.println(30>>3); //30/2^3 = 30/8 = 3 prints 3
        System.out.println(20>>2);//20/2^2=20/4=5  
        System.out.println(20>>3);//20/2^3=20/8=2  
                                  
        System.out.println( a<b && c ); // prints false
        System.out.println( a>b || d ); // prints true
        int e = 5;
        System.out.println(a>b||a<e);//true || true = true  
        System.out.println(a>b|a<e);//true | true = true  
        
        // || vs |  
        System.out.println(a>b||a++<e);//true || true = true  
        System.out.println(a);//10 because second condition is not checked  
        System.out.println(a>b|a++<e);//true | true = true  
        System.out.println(a);//11 because second condition is checked  
                             
        a = 12; b = 21;
        int min = (a<b) ?  a : b;
        System.out.println(min); // prints 12

        a = 10;
        a += 3;
        
        System.out.println(a); // 10 + 3 = 13

        a -=4;
        System.out.println(a); // 13 - 4 = 9

        a *= 2;
        System.out.println(a); // 9 * 2 = 18

        a /= 2;
        System.out.println(a); // 18 / 2 = 9
                               
        a %= 3;
        System.out.println(a); // 18 % 2 = 0


    }
}
