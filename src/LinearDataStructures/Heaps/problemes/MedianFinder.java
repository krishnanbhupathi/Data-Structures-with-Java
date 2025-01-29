package Heaps.problemes;

import java.util.Collections;
import java.util.PriorityQueue;

// Problem Link: https://leetcode.com/problems/find-median-from-data-stream/description/
public class MedianFinder {

    private final PriorityQueue<Integer> minHeap;
    private final PriorityQueue<Integer> maxHeap;

    public MedianFinder(){
        this.minHeap = new PriorityQueue<>();
        this.maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    }

    public void addNum(int value){
        if(maxHeap.isEmpty() || value < maxHeap.peek())
            maxHeap.offer(value);
        else
            minHeap.offer(value);
        if(maxHeap.size() > minHeap.size()+1)
            minHeap.offer(maxHeap.poll());
        else if(maxHeap.size() < minHeap.size())
            maxHeap.offer(minHeap.poll());
    }

    public double findMedian(){
        if(!minHeap.isEmpty() && !maxHeap.isEmpty() && minHeap.size() == maxHeap.size())
            return (minHeap.peek() + maxHeap.peek()) / 2.0;
        return maxHeap.peek();
    }

    public static void main(String[] args) {
        MedianFinder obj = new MedianFinder();
        obj.addNum(1);
        obj.addNum(2);
        System.out.println(obj.findMedian());
        obj.addNum(3);
        System.out.println(obj.findMedian());
    }
}
