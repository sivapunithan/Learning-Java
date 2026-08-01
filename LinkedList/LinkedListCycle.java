package LinkedList;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {

    private class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    private Node head;
    private int size;

    private Boolean hasCycle(Node head) {
        Node cur = head;
        Set<Node> seenNodes = new HashSet<>();
        while (cur != null) {
            if (seenNodes.contains(cur)) {
                return true;
            }
            seenNodes.add(cur);
            cur = cur.next;
        }
        return false;
    }

    public static void main(String[] args) {
        LinkedListCycle list = new LinkedListCycle();
        list.head = list.new Node(1);
        list.head.next = list.new Node(2);
        Node cycle = list.head.next;
        list.head.next.next = cycle;

        boolean hasCycle = list.hasCycle(list.head);
        System.out.println(hasCycle);
    }
}