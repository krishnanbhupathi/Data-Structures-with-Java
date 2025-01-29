package Heaps.problemes;

import java.util.PriorityQueue;

//Problem Link : https://leetcode.com/problems/kth-largest-element-in-a-stream/description/
public class KthLargest {

    private PriorityQueue<Integer> minHeap;
    private int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.minHeap = new PriorityQueue<>(k);

        for(int num : nums){
            minHeap.offer(num);
            if(minHeap.size() > k)
                minHeap.poll();
        }
    }

    public int add(int val) {
        minHeap.offer(val);
        if(minHeap.size() > k)
            minHeap.poll();
        if(minHeap.isEmpty())
            return -1;
        return minHeap.peek();
    }
    public static void main(String[] args) {
        int[] arr = {4, 5, 8, 2};
        KthLargest obj = new KthLargest(3, arr);
        System.out.print(obj.add(3)+" ");
        System.out.print(obj.add(5)+" ");
        System.out.print(obj.add(9)+" ");
        System.out.print(obj.add(10)+" ");
        System.out.println(obj.add(4)+" ");

        // another example
        int[] anotherArr = {7, 7, 7, 7, 8, 3};
        KthLargest obj1 = new KthLargest(4, anotherArr);
        System.out.print(obj1.add(2)+" ");
        System.out.print(obj1.add(10)+" ");
        System.out.print(obj1.add(9)+" ");
        System.out.println(obj1.add(9)+" ");

    }
}
