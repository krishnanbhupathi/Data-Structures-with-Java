package Heaps.problemes;

import java.util.PriorityQueue;
import java.util.Scanner;

// Problem Link : https://leetcode.com/problems/maximize-sum-of-array-after-k-negations/description/
public class MaxSumAfterKNegations {

    public static int largestSumAfterKNegations(int[] nums, int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int value : nums){
            minHeap.offer(value);
        }

        while(k > 0 && !minHeap.isEmpty()){
            int value = minHeap.poll();
            value = -value;
            minHeap.offer(value);
            k--;
        }
        int result = 0;
        while(!minHeap.isEmpty()){
            result += minHeap.poll();
        }
        return result;
    }
    public static void main(String[] args) {
        int n , k;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n ; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println(largestSumAfterKNegations(nums, k));
    }
}
