package LinkedList;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoLinkedList {

    private class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    private Node head;
    private int size;

    private void printList(Node headA, Node headB){
        System.out.print("List A: ");
        Node tempA = headA;
        while(tempA != null){
            System.out.print(tempA.val);
            if(tempA.next != null){
                System.out.print("-->");
            }
            tempA = tempA.next;
        }

        System.out.println();

        System.out.print("List B: ");
        Node tempB = headB;
        while (tempB != null) {
            System.out.print(tempB.val);
            if (tempB.next != null) {
                System.out.print("-->");
            }
            tempB = tempB.next;
        }
        
    }

    private Node findIntersectElement(Node headA, Node headB){

        Set<Node> nodesB = new HashSet<>();
        Node tempB = headB;
        Node tempA = headA;

        while (tempB != null) {
            nodesB.add(tempB);
            tempB = tempB.next;
        }

        while (tempA != null) {
            if (nodesB.contains(tempA)) return tempA;
            tempA = tempA.next;
        }

        return null;
    }
    
    private Node findIntersectTwoPointer(Node headA, Node headB){
        Node a = headA;
        Node b = headB;

        while (a != b) {
            a = (a == null)? headA : a.next;
            b = (b == null)? headB : b.next;
        }
        System.out.println("The Intersect Element is: " +a.val);
        return a;
    }

    public static void main(String[] args) {
        
        IntersectionOfTwoLinkedList list = new IntersectionOfTwoLinkedList();

        Node common = list.new Node(3);
        common.next = list.new Node(4);
        common.next.next = list.new Node(5);

        // FIRST Node
        Node headA = list.new Node(1);
        headA.next = list.new Node(2);
        headA.next.next = common;

        // SECOND Node
        Node headB = list.new Node(9);
        headB.next = list.new Node(8);
        headB.next.next = common;

        list.printList(headA, headB);
        list.findIntersectTwoPointer(headA, headB);
    }
}
