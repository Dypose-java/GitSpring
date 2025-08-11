package ru.dypose.springcore.generic.task2;

public class Pair<K,V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }
    public K getKey(){
        return this.key;
    }
    public void setKey(K key){
        this.key=key;
    }

    public V getValue(){
        return this.value;
    }
    public void setValue(V value){
        this.value=value;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

    public static void main(String[] args) {
        Pair<Integer,String> pair = new Pair<>(5,"str");
        System.out.println(pair);
    }
}
