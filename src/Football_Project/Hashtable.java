package Football_Project;

public class Hashtable {
    private static final int SIZE = 450;  //static ??
    private final Node[] table;

    public Hashtable() {
        this.table = new Node[SIZE];
    }

    private int getHash(String key) {
        int hashValue = 0;
        for (int i = 0; i < key.length(); i++) {
            hashValue += key.charAt(i);
        }
        return hashValue % SIZE;
    }

    public void put(String key, Object value) {
        int hash = getHash(key);
        Node newNode = new Node(key, value);
        if (table[hash] == null) {
            table[hash] = newNode;
        } else {
            Node current = table[hash];
            while (current.next != null) {
                if (current.key.equals(key)) {
                    current.value = value;
                    return;
                }
                current = current.next;
            }
            if (current.key.equals(key)) {
                current.value = value;
            } else {
                current.next = newNode;
            }
        }
    }

    public Object get(String key) {
        int hash = getHash(key);
        Node current = table[hash];
        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }

    public void remove(String key) {
        int hash = getHash(key);
        Node current = table[hash];
        Node prev = null;
        while (current != null) {
            if (current.key.equals(key)) {
                if (prev == null) {
                    table[hash] = current.next;
                } else {
                    prev.next = current.next;
                }
                return;
            }
            prev = current;
            current = current.next;
        }
    }

    private static class Node {
        String key;
        Object value;
        Node next;

        public Node(String key, Object value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }
}