package HashMaps;

public class MyHashSet<E> {

    private MyHashMap<E, Object> map = new MyHashMap<>();
    private static final Object PRESENT = new Object();

    public void add(E e){
        map.put(e, PRESENT);
    }

    public boolean contains(E e){
        return map.get(e) != null;
    }

    public void remove(E e){
        map.remove(e);
    }

    public int size(){
        return map.size();
    }
}
