package Strings.Problems;

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


    }
}
