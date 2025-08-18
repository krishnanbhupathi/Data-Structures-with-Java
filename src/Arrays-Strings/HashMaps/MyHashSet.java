package HashMaps;

import java.util.Set;

public class MyHashSet<E> {

    private MyHashMap<E, Object> map = new MyHashMap<>();
    private static final Object PRESENT = new Object();

    public void add(E e){
        if(! map.containsKey(e)){
            map.put(e, PRESENT);
        }
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

    public String toString(){
        if(map.size() == 0) return "[]";
        Set<E> set = map.keySet();
        StringBuilder sb = new StringBuilder("[");
        for(E e : set){
            sb.append(e).append(",");
        }
        sb.deleteCharAt(sb.length()-1);
        sb.append("]");
        return sb.toString();
    }
}
