// Arrays are mutable in java.(we can change the values)

import java.util.Scanner;
import java.util.Arrays;

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
        System.out.println();

        int[] array = new int[5];
        for(int i = 1; i < 6 ; i++){
            array[i-1] = i; 
        }
        System.out.println("Before swapping: "+Arrays.toString(array));
        swap(array,0,4); // swapping first and last elements
        System.out.println("After swapping: "+Arrays.toString(array));    
        
        //Finding the maximum element
        System.out.println("Maximum element in array is: "+maximum(array));

        //Finding the maximum element in a range
        int maxInRange = maximumRange(new int[] {3,2,4,9,11,21,3},1,4);
        System.out.println(Arrays.toString(new int[]{3,2,4,9,11,21,3}));
        System.out.println("Maxim element is : "+maximum(new int[]{3,2,4,9,11,21,3}));
        System.out.println("Maximum element from index 1 to 4: "+maxInRange); 
    }

    static int maximumRange(int[] array,int start,int end) {
        if(array.length == 0)
            return -1;
        if(end < start) 
            return -1;
        int result = array[start];
        for(int i = start; i <= end; i++) {
            if(result < array[i])
                result = array[i];
        }
        return result;
    }

    static int maximum(int[] array) {
        if(array.length == 0) // check for empty array
            return -1;
        int max = array[0];
        for(int i = 1; i < array.length; i++) {
            if(max < array[i]) 
                max = array[i];
        }
        return max;
    }

    static void swap(int[] array,int firstIndex,int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }

    static void modify(int[] array) {
        // here array is also pointing to the data variable in heap memeory
        if( array.length <= 0 ) // checking if array is empty or not
            return;
        int length = array.length;
        array[length-1] = 53; // changing the last element of arrray
    }
}

