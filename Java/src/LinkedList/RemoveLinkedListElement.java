package LinkedList;

public class RemoveLinkedListElement {

    private class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    private Node head;
    private int size;

    private void print(Node head){

        System.out.print("List A: ");
        Node tempA = head;
        while(tempA != null){
            System.out.print(tempA.val);
            if(tempA.next != null){
                System.out.print("-->");
            }
            tempA = tempA.next;
        }
    }

    private Node removeElement(int val){
        Node sentinel = new Node(0);
        sentinel.next = head;
        Node prev = sentinel;

        while (prev != null && prev.next != null) {
            if (prev.next.val == val){
                // WHILE DELETING THE NODE THE PREV POINTER NEED TO STAY AT THE SAME PLACE
                prev.next = prev.next.next;
            } else{
                prev = prev.next;
            }
        }

        return sentinel.next;
    }

    public static void main(String[] args) {
        RemoveLinkedListElement list = new RemoveLinkedListElement();

        list.head = list.new Node(1);
        list.head.next = list.new Node(2);
        list.head.next.next = list.new Node(3);
        list.head.next.next.next = list.new Node(3);
        list.head.next.next.next.next = list.new Node(2);
        list.head.next.next.next.next.next = list.new Node(1);

        Node newHead = list.removeElement(1);
        list.print(newHead);
    }
}
