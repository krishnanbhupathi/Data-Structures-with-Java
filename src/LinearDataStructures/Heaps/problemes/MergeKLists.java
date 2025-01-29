package Heaps.problemes;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

// Problem Link: https://leetcode.com/problems/merge-k-sorted-lists/description/

public class MergeKLists {
    static class Node{
        int val;
        Node next;

        public Node(int val){
            this.val = val;
        }
    }
    static void printList(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }

    static Node mergeKLists(List<Node> arr){
        PriorityQueue<Node> pq = new PriorityQueue<>(
                (a,b) -> a.val - b.val
        );

        for(Node list : arr){
            if(list != null)
                pq.offer(list);
        }
        Node dummy = new Node(-1);
        Node curr = dummy;
        while (!pq.isEmpty()){
            Node node = pq.poll();
            curr.next = node;
            curr = curr.next;

            if(node.next != null){
                pq.offer(node.next);
            }
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        List<Node> arr = new ArrayList<>();

        arr.add(new Node(1));
        arr.get(0).next = new Node(3);
        arr.get(0).next.next = new Node(5);
        arr.get(0).next.next.next = new Node(7);

        arr.add(new Node(2));
        arr.get(1).next = new Node(4);
        arr.get(1).next.next = new Node(6);
        arr.get(1).next.next.next = new Node(7);

        arr.add(new Node(0));
        arr.get(2).next = new Node(9);
        arr.get(2).next.next = new Node(10);
        arr.get(2).next.next.next = new Node(11);

        Node head = mergeKLists(arr);

        printList(head);
    }
}
