// Problem : https://leetcode.com/problems/container-with-most-water/description/

import java.util.Scanner;
import java.lang.Math;

class MaxArea {

    int maxArea(int[] height) {
        int left = 0 , right = height.length - 1;
        int area = 0;
        while (left < right) {
            int currentArea = Math.min(height[left], height[right])* (right - left);
            area = Math.max(area, currentArea);
            if (height[left] < height[right])
                left++;
            else
                right--;
        }
        return area;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of heights: ");
        int length = input.nextInt();

        int[] heights = new int[length];
        for (int i = 0 ; i < length ; i++) 
            heights[i] = input.nextInt();

        MaxArea object = new MaxArea();
        int result = object.maxArea(heights);
        System.out.println("Max area is: "+result);
    }
}
