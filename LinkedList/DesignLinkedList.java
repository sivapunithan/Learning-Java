package LinkedList;

public class DesignLinkedList {

    private class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    private Node head;
    private int size;

    public void addAtHead(int val) {
        Node node = new Node(val);
        node.next = this.head;
        this.head = node;
        size++;
    }

    public void addAtTail(int val) {
        Node newNode = new Node(val);
        Node current = head;
        if (current == null) {
            head = newNode;
            size++;
            return;
        }
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        size++;
    }

    public void addAtIndex(int index, int val){
        
        Node node = new Node(val);
        Node cur = head;
        if(index == 0){
            addAtHead(val);
            return;
        };
        if (index == size){
            addAtTail(val);
            return;
        }
        if (index < 0 || index > size) return;

        for (int i=0; i<index-1; i++){
            cur = cur.next;
        }
        node.next = cur.next;
        cur.next = node;
        size ++;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.val + "-->");
            temp = temp.next;
        }
        System.out.println("The linked list reached the final node");
    }

    public int getAtIndex(int index){

        if (index < 0 || index >= size) return -1;
        Node cur = head;
        for(int i = 0; i<index; i++){
            cur = cur.next; 
        }
        return cur.val;
    }

    public void deleteAtIndex(int index){
        if (index < 0 || index >= size) return;
        if (index == 0){
            head = head.next;
            size--;
            return;
        }
        Node cur = head;
        for (int i=0; i<index-1; i++){
            cur = cur.next;
        }
        cur.next = cur.next.next;
        size--;
    }

    public static void main(String[] args) {

        DesignLinkedList list = new DesignLinkedList();

        list.addAtHead(10);
        list.addAtTail(20);
        list.addAtTail(30);

        list.printList();

    }
}
