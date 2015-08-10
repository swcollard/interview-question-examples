package prep.interview.linkedlist;

/**
 * Implementation of a double ended queue using a doubly linked list
 */
public class LinkedDeque {

    private static class Node {
        public Node prev;
        public Node next;
        public Object val;
    }

    private Node first;
    private Node last;
    private int size;

    private void init(Object obj) {
        size = 1;
        Node node = new Node();
        node.val = obj;
        first = node;
        last = node;
    }

    public void insertFirst(Object val) {
        if (size == 0) {
            init(val);
            return;
        }
        Node node = new Node();
        node.val = val;
        node.next = first;
        first.prev = node;
        first = node;
        size++;
    }

    public void insertLast(Object val) {
        if (size == 0) {
            init(val);
            return;
        }
        Node node = new Node();
        node.val = val;
        node.prev = last;
        last.next = node;
        last = node;
        size++;
    }

    @Override
    public String toString() {
        String list = "";
        Node node = first;
        for (int i = 0; i < size; i++) {
            list += node.val.toString() + " ";
            node = node.next;
        }
        return list;
    }
}

