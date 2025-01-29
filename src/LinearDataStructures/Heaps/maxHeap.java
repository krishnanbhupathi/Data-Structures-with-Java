package Heaps;

import java.util.ArrayList;

public class maxHeap<T extends Comparable<T>> {

    private ArrayList<T> list;

    public maxHeap(){
        list = new ArrayList<>();
    }

    private int parent(int index){
        return (index - 1)/2;
    }

    private int left(int index) {
        return index * 2 + 1;
    }

    private int right(int index) {
        return index * 2 + 2;
    }

    private void swap(int first, int second) {
        T temp = list.get(first);
        list.set(first,list.get(second));
        list.set(second,temp);
    }

    public void offer(T val){
        list.add(val);
        upHeap(list.size() -1);
    }

    private void upHeap(int index) {
        if (index == 0)
            return;
        int p = parent(index);
        if(list.get(index).compareTo(list.get(p)) > 0){
            swap(p,index);
            upHeap(p);
        }
    }

    public T poll() throws Exception{
        if(list.isEmpty())
            throw new Exception("Removing from empty heap!");
        T temp = list.get(0);
        T last = list.get(list.size()-1);
        list.set(0,last);
        downHeap(0);
        return temp;
    }

    private void downHeap(int index){
        int max = index;
        int left = left(index);
        int right = right(index);

        if(left < list.size() && list.get(max).compareTo(list.get(left)) < 0)
            max = left;

        if(right < list.size() && list.get(max).compareTo(list.get(right)) < 0)
            max = right;

        if(max != index) {
            swap(max, index);
            downHeap(max);
        }
    }

    public T peek() throws Exception{
        if(list.isEmpty())
            throw new Exception("Accessing from empty heap!");
        return list.get(0);
    }

    public static void main(String[] args) throws Exception {
        maxHeap<Integer> pq = new maxHeap<>();

        pq.offer(23);
        pq.offer(21);
        pq.offer(44);

        pq.offer(33);


        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq.peek());
    }
}
