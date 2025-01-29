//package Heaps.problemes;
//
//import java.util.*;
//
//import javafx.util.Pair;
//
//// Problem Link: https://leetcode.com/problems/top-k-frequent-elements/description/
//public class TopKFrequent {
//
//    static int[] topKFrequent(int[] arr,int k){
//        ArrayList<Integer> list = new ArrayList<>();
//        HashMap<Integer, Integer> map = new HashMap<>();
//        PriorityQueue<Pair<Integer,Integer>> pq = new PriorityQueue<>(
//                (a,b) -> a.getValue() - b.getValue()
//        );
//        for(int value : arr){
//            map.put(value, map.getOrDefault(value,0)+1);
//        }
//        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
//            pq.offer(new Pair<>(entry.getKey(),entry.getValue()));
//            if(pq.size() > k)
//                pq.poll();
//        }
//        while(!pq.isEmpty()){
//            Pair<Integer,Integer> p = pq.poll();
//            list.add(p.getKey());
//        }
//        int[] result = new int[list.size()];
//        for(int i = 0; i < list.size(); i++)
//            result[i] = list.get(i);
//
//        return result;
//    }
//    public static void main(String[] args) {
//        int k = 2;
//        int[] arr = {1,1,1,2,2,3};
//
//        System.out.println(Arrays.toString(topKFrequent(arr, k)));
//    }
//}
