package LinkedList;

public class LinkedListPrinter {
    public static void print(Node head){

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.val);
            if (temp.next != null) {
                System.out.print("-->");
            }
            temp = temp.next;
        }
        System.out.println();
    }
}
