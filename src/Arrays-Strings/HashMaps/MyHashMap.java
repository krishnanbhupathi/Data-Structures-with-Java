package HashMaps;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class MyHashMap<K, V>{

    // inner class
    private static class Node<K, V>{
        K key;
        V value;

        Node<K, V> next;

        // constructor
        Node(K key, V value){
            this.key = key;
            this.value = value;
        }
    }

    // data memebers
    private int capacity = 16;
    private int size = 0;
    private float loadFactor = 0.75f;
    private Node<K, V>[] buckets; // declaration of array with type Node

    // constructor
    public MyHashMap() {
        buckets = (Node<K, V>[])new Node[capacity];
    }

    private int hash(K key){
        return (key == null) ? 0 : Math.abs(key.hashCode() % capacity);
    }

    public void put(K key, V value){
        // get the index
        int index = hash(key);
        Node<K, V> head = buckets[index];

        // check if key is already exist
        while(head != null){
            if(Objects.equals(head.key, key)){
                head.value = value; // update
                head = head.next;
            }
        }

        // inserting at head
        Node<K,V> newNode = new Node<>(key, value);
        newNode.next = buckets[index];
        buckets[index] = newNode;
        size++;

        // resize if load factor is exceeded
        if( (1.0 * size)/capacity >= loadFactor){
            resize();
        }
    }

    public V get(K key){
        // get the index;
        int index = hash(key);
        Node<K, V> head = buckets[index]; // single list

        // iterating over the single list and returing
        while(head != null){
            if(Objects.equals(head.key, key)){
                return head.value;
            }
        }
        return null;
    }

    public void remove(K key){
        int index = hash(key);
        Node<K, V> head = buckets[index];
        Node<K, V> prev = null;

        while(head != null){
            if(Objects.equals(head.key, key)){
                if(prev != null) {
                    prev.next = head.next;
                }else{
                    buckets[index] = head.next;
                }
                size--;
                return;
            }
            prev = head;
            head = head.next;
        }
    }

    // return true if hashmap contains key else false
    public boolean containsKey(K key){
        int index = hash(key);
        Node<K, V> head = buckets[index];

        while(head != null){
            if(Objects.equals(head.key, key))
                return true;
            head = head.next;
        }
        return false;
    }

    // getting each and every key in the hashmap
    public Set<K> keySet(){
        Set<K> keys = new HashSet<>();

        for(Node<K, V> bucket : buckets){
            Node<K, V> head = bucket;
            while(head != null){
                keys.add(head.key);
                head = head.next;
            }
        }
        return keys;
    }

    private void resize(){
        Node<K, V>[] oldBuckets = buckets;
        capacity *= 2;
        buckets = (Node<K, V>[])new Node[capacity];

        size = 0;
        for(Node<K, V> bucket: oldBuckets){
            Node<K, V> headNode = bucket;
            while(headNode != null){
                put(headNode.key, headNode.value); //Rehash and put
                headNode = headNode.next;
            }
        }

    }
    public int size(){
        return size;
    }
}


