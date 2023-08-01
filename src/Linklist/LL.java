package Linklist;

public class LL {

    private Node Head;
    private Node Tail;

    private int size;
    public LL(int size) {
        this.size = size;
    }

    private class Node{
        private int val;
        private Node next;
        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}

