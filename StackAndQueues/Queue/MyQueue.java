package StackAndQueues.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class MyQueue {

    Deque<Integer> s1 = new ArrayDeque<>();
    Deque<Integer> s2 = new ArrayDeque<>();

    public MyQueue(){

    }

    public void push(int x){
        /*
        just a normal push the data into the stack
         */
        s1.push(x);
    }

    /*
    Here the data entered into s1, then the stack will be
         10, 20, 30, 40
    Insert the data into s2 by popping the data from s1
         40, 30, 20, 10

    Here we are have to implement the queue, means if s2 is not empty then we can
    perform the standard stack operation and I can get the pop and peek

    if I pop s2, 10 will be removed and returned
    then if I do peek it will return me 30

    if s2 is empty then we need to insert the data from s1 to s2
     */

    public int pop(){
        transferIfNeeded();
        return s2.pop();
    }

    public int peek(){
        transferIfNeeded();
        return s2.peek();
    }

    public boolean empty(){
        return s1.isEmpty() && s2.isEmpty();
    }

    private void transferIfNeeded(){
        if (s2.isEmpty()){
            while (!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.push(10);
        queue.push(20);
        queue.push(30);
        queue.push(40);

        System.out.println(queue.s1);
        System.out.println(queue.pop());
        System.out.println(queue.s1);
    }
}
