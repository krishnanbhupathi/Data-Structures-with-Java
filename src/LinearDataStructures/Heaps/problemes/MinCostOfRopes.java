package Heaps.problemes;

import java.util.PriorityQueue;
import java.util.Scanner;

// Problem Link: https://www.geeksforgeeks.org/problems/minimum-cost-of-ropes-1587115620/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card
public class MinCostOfRopes {

    public static int minCost(int[] ropes){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int rope : ropes){
            minHeap.offer(rope);
        }
        int result = 0;
        while(minHeap.size() > 1){
            int a = minHeap.poll();
            int b = minHeap.poll();
            result += a + b;
            minHeap.offer(a+b);
        }
        return result;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] ropes = new int[n];
        for(int i = 0; i < n; i++)
            ropes[i] = sc.nextInt();

        System.out.println(minCost(ropes));
    }
}
