package LinkedList;

public class RemoveNthNode {


    private Node head;
    private int size;

    private int lengthOfList(Node head){
        
        int size = 0;
        while (head != null) {
            head = head.next;
            size++;
        }
        System.out.println("The length of the linked list is :" +size);
        return size;
    }

    private Node removeNthElement(Node head, int length, int n){
        Node sentinel = new Node(0);
        sentinel.next = head;

        int prev = length - n;
        Node prevNode = sentinel;

        /*
        At the first time both sentinel and prev point to the samw dummy 
        if length - n = 0 loop wont run 
        prevnode is the sentinel node 
        we are re-point the sentinel node next to next.next 
        thats our new head  */

        for(int i=0; i<prev; i++){
            prevNode = prevNode.next;
            System.out.println("Printing the sentinel node :" +sentinel.next.val);
            System.out.println("Printing the prev node :" +prevNode.val);
        }
        prevNode.next = prevNode.next.next;

        System.out.println("The Removed Element is :" +prevNode.next.val);

        return sentinel.next;
    }

    


    public static void main(String[] args) {

        RemoveNthNode list = new RemoveNthNode();

        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(3);
        list.head.next.next.next.next = new Node(2);
        list.head.next.next.next.next.next = new Node(1);

        LinkedListPrinter.print(list.head);

        int length = list.lengthOfList(list.head);
        Node newHead = list.removeNthElement(list.head, length, 3);

        LinkedListPrinter.print(newHead);
        
    }
}
