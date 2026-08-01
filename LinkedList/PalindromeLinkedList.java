package LinkedList;

public class PalindromeLinkedList {

    private class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    private Node head;
    private int size;

    private Node middleElement(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    private Node reverse(Node middleNode){
        Node prev = null;
        Node curr = middleNode;

        while (curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    private boolean isPalindrome(Node tail){
        Node headNode = head;
        Node tailNode = tail;
        
        while (tailNode != null) {
            if (headNode.val != tailNode.val) {
                return false;
            }
            headNode = headNode.next;
            tailNode = tailNode.next;
        }
       
        return true;
    }

    private void add(int val){
        Node newNode = new Node(val);

        if (head == null){
            head = newNode;
            size++;
            return;
        }

        Node cur = head;
        while(cur.next != null){
            cur = cur.next;
        }
        cur.next = newNode;
    }

    private void buildList(int[] list){
        if (list.length == 0) return;

        head = new Node(list[0]);
        Node cur = head;

        for (int i=0; i < list.length; i++){
            cur.next = new Node(list[i]);
            cur = cur.next;
        }
    }

    public static void main(String[] args) {

        PalindromeLinkedList list = new PalindromeLinkedList();

        list.head = list.new Node(1);
        list.head.next = list.new Node(2);
        list.head.next.next = list.new Node(3);
        list.head.next.next.next = list.new Node(3);
        list.head.next.next.next.next = list.new Node(2);
        list.head.next.next.next.next.next = list.new Node(1);

        Node middle = list.middleElement(list.head);
        System.out.println("The middle Middle Element : "+ middle.val);
        Node tail = list.reverse(middle);
        System.out.println("The tail element is : " + tail.val);
        boolean result = list.isPalindrome(tail);
        System.out.println(result ? "Palindrome" : "Not Palindrome");

    }
}
