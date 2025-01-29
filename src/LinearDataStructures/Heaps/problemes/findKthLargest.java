package Heaps.problemes;

import java.util.Collections;
import java.util.PriorityQueue;

// Problem Link: https://leetcode.com/problems/kth-largest-element-in-an-array/description/
public class findKthLargest {

    static int KthLargest(int[] arr, int k){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for(int value : arr){
            maxHeap.offer(value);
        }
        while(k > 1 && !maxHeap.isEmpty()){
            maxHeap.poll();
            k--;
        }

        return maxHeap.peek();
    }

    public static void main(String[] args) {
        int k = 4;
        int[] arr = {3,2,3,1,2,4,5,5,6};

        System.out.println(KthLargest(arr, k));
    }
}
