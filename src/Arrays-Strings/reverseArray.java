// Reverse the element in the given array 

import java.util.Arrays;

class reverseArray {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6};

        System.out.println("Array before reverse: "+Arrays.toString(array));
        reverse(array);
        System.out.println("Array after reverse: "+Arrays.toString(array));
    }

    // swapping two values in side the array
    static void swap(int[] array,int index1,int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    static void reverse(int[] array) {
        int start = 0 , end = array.length - 1;
        while(start < end) {
            swap(array, start, end);
            start++;
            end--;
        }
    }
}
