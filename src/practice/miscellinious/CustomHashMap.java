package practice.miscellinious;

import org.w3c.dom.Node;

import java.util.Map;
import java.util.Objects;

public class CustomHashMap<K,V> {
    private static final int DEFAULT_CAPACITY = 10;
    private Node<K, V> table[];
    private int size;

    private static class Node<K, V> {
        K key;
        V value;
        Node<K, V> next;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }

    }

    CustomHashMap() {
        table = new Node[DEFAULT_CAPACITY];
        size = 0;
    }

    private int hash(K key) {
        return Math.abs(Objects.hashCode(key)) % table.length;
    }

    public void put(K key, V value) {
        int index = hash(key);
        Node<K, V> newNode = new Node<>(key, value);
        if (table[index] == null) {
            table[index] = newNode;
        } else {
            Node<K, V> current = table[index];
            Node<K, V> prev = null;
            while (current != null) {
                if (current.key.equals(key)) {
                    current.value = value;
                    return;
                }
                prev = current;
                current = current.next;
            }
            prev.next = newNode;

        }
        size++;
    }

    public int size(){
        return  size;
    }

    public void printMap() {
        for (int i = 0; i < table.length; i++) {
            System.out.print(i + ": ");
            Node<K, V> current = table[i];
            while (current != null) {
                System.out.print("[" + current.key + " -> " + current.value + "] ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CustomHashMap<String, Integer> map = new CustomHashMap<>();
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);
        map.put("Alice", 26);
        map.printMap();


    }


}
