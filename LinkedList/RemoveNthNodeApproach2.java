package LinkedList;

public class RemoveNthNodeApproach2 {

    private Node head;
    private int size;


    private Node removeNthElement(Node head, int n){
        Node sentinel = new Node(0);
        sentinel.next = head;

        Node first = sentinel;
        for(int i=0; i<n; i++){
            first = first.next;
        }

        Node second = sentinel;
        System.out.println("First pointer At :" +first.val);
        System.out.println("Second pointer At :" +second.val);

        while (first != null && first.next != null) {

            
            second = second.next;
            first = first.next;
        }

        Node removedNode = second.next;
        second.next = second.next.next;

        System.out.println("The removed Element : "+removedNode.val);

        return sentinel.next;
    }
    

    public static void main(String[] args) {
        
        RemoveNthNodeApproach2 list = new RemoveNthNodeApproach2();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);

        LinkedListPrinter.print(list.head);

        Node newHead = list.removeNthElement(list.head, 5);

        LinkedListPrinter.print(newHead);

    }
}
