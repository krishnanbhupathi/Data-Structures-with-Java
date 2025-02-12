package Problems;

import java.util.HashSet;

public class RemoveDuplicates {

    static int removeDuplicates(int[] arr){
        HashSet<Integer> set = new HashSet<>();

        int index = 0;
        for(int i = 0; i < arr.length; i++){
            if(!set.contains(arr[i])){
                set.add(arr[i]);
                arr[index] = arr[i];
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args) {

        int[] a = {1,2,2,3,4,4,4,5,5,6,7,7,8,8,8};

        int newSize = removeDuplicates(a);
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        for(int i = 0; i < newSize; i++)
            System.out.print(a[i] +" ");
        System.out.println();


        int[] arr = {1,5,3,3,2,7,2,5};
        HashSet<Integer> set = new HashSet<>();
        for(int value : arr){
            set.add(value);
        }


        System.out.println(set);
    }
}
