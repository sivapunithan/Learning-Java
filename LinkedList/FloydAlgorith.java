package LinkedList;

public class FloydAlgorith {
    
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
       
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null){
           
            fast = fast.next.next;
            slow = slow.next;
             if (fast == slow) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        FloydAlgorith list = new FloydAlgorith();
        list.head = list.new Node(1);
        list.head.next = list.new Node(2);
        Node cycle = list.head.next;
        list.head.next.next = cycle;

        boolean hasCycle = list.hasCycle(list.head);
        System.out.println(hasCycle);
    }
}
