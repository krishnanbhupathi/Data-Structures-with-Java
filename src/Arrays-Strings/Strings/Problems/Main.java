package Strings.Problems;

import HashMaps.MyHashMap;
import Strings.MyArrayList;

public class Main {

    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println(list); //[Apple,Banana,Cherry]
        list.remove(1);
        System.out.println(list); // [Apple,Cherry]
        list.add("Mango");
        System.out.println(list);// [Apple,Cherry,Mango]
        list.set(1, "Orange");
        System.out.println(list); // [Apple,Orange,Mango]

        System.out.println(list.get(2));
        System.out.println(list.size()); // size = 3


        MyHashMap<String, Integer> map = new MyHashMap<>();
        map.put("Apple", 3);
        map.put("Banana", 5);
        System.out.println(map.get("Banana")); // 5
        System.out.println(map.size()); // 2
        map.put("Dinesh", 10);
        System.out.println(map.containsKey("Krishna")); // false
        System.out.println(map.containsKey("Dinesh")); // true
        System.out.println("Before removing size "+map.size()); // 3
        map.remove("Banana");
        System.out.println("After removing size "+map.size()); // 2
        map.put("Orange", 9);
        System.out.println(map.keySet());

    }
}
