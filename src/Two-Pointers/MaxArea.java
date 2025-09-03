// Problem : https://leetcode.com/problems/container-with-most-water/description/

import java.util.Scanner;
import java.lang.Math;

class MaxArea {

    static int maxArea(int[] height) {
        int left = 0 , right = height.length - 1;
        int maxArea = 0;
        while (left < right) {
            int currentArea = Math.min(height[left], height[right])* (right - left);
            maxArea = Math.max(maxArea, currentArea);
            if (height[left] < height[right])
                left++;
            else
                right--;
        }
        return maxArea;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int length = input.nextInt();

        int[] heights = new int[length];
        for (int i = 0 ; i < length ; i++) 
            heights[i] = input.nextInt();

        int result = maxArea(heights);
        System.out.println("Max area is: "+result);
    }
}
