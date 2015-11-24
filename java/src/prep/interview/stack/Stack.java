package prep.interview.stack;

/**
 * A simple implementation of a stack data structure
 */
public class Stack {

    private class Node {
        public Node next;
        public Object value;

        public Node(Node next, Object value) {
            this.next = next;
            this.value = value;
        }
    }

    private Node top = null;

    public void push(Object val) {
        if (val == null) {
            return; // Reject null values
        }
        Node node = new Node(top, val);
        top = node;
    }
    
    public Object pop() {
        if (top == null) {
            return null; // Stack is empty
        }
        Object val = top.value;
        top = top.next;
        return val;
    }

    @Override
    public String toString() {
        String list = "";
        Node node = top;
        while (node != null) {
            list += node.value.toString() + " ";
            node = node.next;
        }
        return list;
    }
}
