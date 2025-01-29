package Heaps.problemes;

import java.util.Collections;
import java.util.PriorityQueue;

// Problem Link: https://leetcode.com/problems/last-stone-weight/description/
public class LastStoneWeight {

    static int lastStoneWeight(int[] stones){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for(int stone : stones){
            maxHeap.offer(stone);
        }
        while(maxHeap.size() > 1){
            int a = maxHeap.poll();
            int b = maxHeap.poll();
            if(a != b){
                maxHeap.offer(Math.abs(a-b));
            }
        }
        return maxHeap.peek();
    }
    public static void main(String[] args) {
        int[] stones = {1};
        System.out.println(lastStoneWeight(stones));
    }
}
