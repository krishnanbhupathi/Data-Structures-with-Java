// Arrays are mutable in java.(we can change the values)

import java.util.Scanner;

class methodsArray {

    public static void main(String[] args) {
        
        int[] data = {11, 22, 33, 44, 55};
        System.out.print("data before changing the last element: ");
        for(int element : data) 
            System.out.print(element+" ");
        System.out.println();

        // passing the reference to the modify method
        modify(data);
        System.out.print("data after changing the last element: ");
        for(int element : data)
            System.out.print(element+" ");
            
    }
    static void modify(int[] array) {
        // here array is also pointing to the data variable in heap memeory
        if( array.length <= 0 ) // checking if array is empty or not
            return;
        int length = array.length;
        array[length-1] = 53; // changing the last element of arrray
    }
}

