// Problem : https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/

import java.util.Scanner;

class RemoveDuplicates {

    int removeDuplicates(int[] nums, int n) {
        int j = 0;
        for (int i = 0 ; i < n-1 ; i++) 
            if(nums[i] != nums[i+1])
                nums[j++] = nums[i];
        nums[j++] = nums[n-1];
        return j;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        RemoveDuplicates object = new RemoveDuplicates();
        System.out.print("Enter the lenght of array: ");
        int n = input.nextInt();
        int[] nums = new int[n];
        
        for(int i = 0 ; i < n ; i++)
            nums[i] = input.nextInt();

        n = object.removeDuplicates(nums,n);
        System.out.println("Length of nums after removal duplicates: " +n);
        for(int i = 0 ; i < n ; i++)
           System.out.print(nums[i]+" "); 
    }
}
