package Football_Project;

public class Hashtable {
    private static final int SIZE = 500;  //static ??
    private final Object[] table;

    public Hashtable() {
        this.table = new Object[SIZE];

    }

    private int getHash(int ID) {
        if (ID < 101) {
            return ID;
        }
        return ID % SIZE;
    }

    public void put(Team team) {
        int index = getHash(team.getTeamID());
        Node newNode = new Node(team.getTeamID(), team);
        if (table[index] == null) {
            table[index] = newNode;
        } else {
            Node current = table[index];
            while (current.next != null) {
                if (current.key.equals(team.getTeamID())) {
                    current.value = team;
                    return;
                }
                current = current.next;
            }
            if (current.key.equals(team.getTeamID())) {
                current.value = team;
            } else {
                current.next = newNode;
            }
        }
    }
    public void put(Player player) {
        int hash = getHash(player.getPlayerID());
        Node newNode = new Node(key, team);
        if (table[hash] == null) {
            table[hash] = newNode;
        } else {
            Node current = table[hash];
            while (current.next != null) {
                if (current.key.equals(key)) {
                    current.value = team;
                    return;
                }
                current = current.next;
            }
            if (current.key.equals(key)) {
                current.value = team;
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

    public void printHashtable() {
        for (int i = 0; i < table.length; i++) {
            Node current = table[i];
            while (current != null) {
                System.out.println(current.key + " " + current.value);
            }
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