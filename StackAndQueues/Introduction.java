package StackAndQueues;

/*  
         *** STACK ***
    -> LIFO (Last in first out)
    * push, pop, peek/top
    * Restricted access (top only)
    * Cannot modify random index

        *** QUEUE ***
     -> FIFO (first in first out)
     * enqueue(add), dequeue(remove), peek/front
 */

import java.util.*;

public class Introduction {


    public static void main(String[] args) {

        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

//        System.out.println(stack);
//
//        stack.pop();
//        System.out.println(stack);

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println(queue);
    }
}
