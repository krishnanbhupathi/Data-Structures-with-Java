package Strings;

/*
1. Add the element
2. Get the element
3. Set the element
4. Remove the element
5. Resize automatically
6. size tracking
 */

import java.util.Arrays;

public class MyArrayList<T> {

    private T[] data;
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;

    // Constructor
    public MyArrayList(){
        data = (T[]) new Object[DEFAULT_CAPACITY];
    }

    // adding new element at end
    public void add(T element) {
        ensureCapacity();
        data[size++] = element; // data[size] = element;  size++;
    }

    // get the element at index
    public T get(int index) {
        checkIndex(index);
        return data[index];
    }

    // set the element at index
    public void set(int index, T element){
        checkIndex(index);
        data[index] = element; // just updating element at given index
    }

    // remove the element at index
    public T remove(int index){
        checkIndex(index);
        T removed = data[index];
        for(int i = index; i < size - 1; i++){
            data[i] = data[i+1];
        }
        data[--size] = null; // size--; data[size] = null; // GC take care of this
        return removed;
    }

    // get the size of list
    public int size(){
        return size;
    }

    // check if list is empty or not
    public boolean isEmpty(){
        return size == 0;
    }

    // index bound checking
    private void checkIndex(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index "+index+" out of bound for size "+size);
        }
    }

    // Ensur's no room for new element, double the capacity if full
    private void ensureCapacity() {
        if(size == data.length){
            int newCapacity = data.length * 2;
            data = Arrays.copyOf(data, newCapacity);
        }
    }

    // clearing the list
    public void clear(){
        Arrays.fill(data, 0, size, null);
        size = 0;
    }

    // to string method to convert to string arrayList
    @Override
    public String toString(){
        if(size == 0) return"[]";
        StringBuilder sb = new StringBuilder("[");
        for(int i = 0; i < size-1 ; i++){
//            sb.append(data[i]);
//            sb.append(",");
              sb.append(data[i]).append(",");
        }
        sb.append(data[size-1]).append("]");
        return sb.toString();
    }



}



// 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
// insert new element 11
// 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0