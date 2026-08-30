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
