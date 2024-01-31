/* -> ArrayList is a part of Java collection framework and it is present in java.util
 *    package.This is slower than usual array but uses when user perform more operations
 *    on arrays.It is known as dynamic array in java.
 * -> The main advantage is we can declare the arraylist and don't need to mention the 
 *    size and if you want to mention its size also fine.
 * -> Only primitive data types used with arraylist in java.For primitive data type we can 
 *    use wrapper classes in java. For char -> Character and int -> Integer and for boolean
 *    we can use Boolean ....
 *    Syntax : 
 *          ArrayList<dataType> variable = new ArrayList<>(size); size is optional 
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

class ArrayListExample {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // syntax
        ArrayList<Integer> list = new ArrayList<>(5); // best practise is give the initial size.

        // To add element their is a method add()
        list.add(12);
        list.add(15);
        list.add(15);
        list.add(20);
        list.add(12);
        list.add(15);
        list.add(15);
        list.add(20);

        System.out.println(list); // printing the list

        // To check if element is present or not their is a method called contains() return boolean
        System.out.println(list.contains(20));
        System.out.println(list.contains(21));

        // To update element at particular index their is method called set() two paramenters index and value
        list.set(0,99);
        System.out.println(list);  

        // To remove a element from particular index remove() we need provide index as parameter
        list.remove(1); // 1 is index here not value
        System.out.println(list);

        // Iterate over the arraylist to get element from user and output the elements
        ArrayList<Integer> list1 = new ArrayList<>(5);

        for(int i = 0; i < 5; i++) {
            list1.add(input.nextInt());
        }

        for(int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i)+" "); // to get the element we need use get() method not list1[i]
        }
        System.out.println();

        //Using Enhanched for-loop
        for(int element : list1) 
            System.out.print(element+" ");
        System.out.println();

        list1.addAll(list); // addAll() method is used to append all the element that is passed in parameter 
                            // we can pass another collection as well                    
        System.out.println(list1);

        list1.addAll(1,list); // we can specify the index where we want to append the given collection
        System.out.println(list1);

        list1.clear(); // To remove all elements from that collection
        System.out.println(list1);

        int firstOccurence = list.indexOf(20);
        System.out.println("20 first occured at index of "+firstOccurence);

        System.out.println(list1.indexOf(99)); // returns -1 if the element is not present
        System.out.println(list1.isEmpty()); // return true if list is empty else false
                                             

    }
}
