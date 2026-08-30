package StackAndQueues.Stack;

import java.util.LinkedList;
import java.util.Queue;

public class MyStackUsingOneQueue {

    Queue q1 = new LinkedList<>();

    public void push(int i){
        q1.offer(i);
    }

    public int pop(){
        while (q1.size() > 1){
            q1.offer(q1.poll());
        }

        int ans = (int) q1.poll();
        return ans;
    }

    public int top(){
        while (q1.size() > 1){
            q1.offer(q1.poll());
        }

        int front = (int) q1.poll();
        q1.offer(front);

        return front;
    }

    public static void main(String[] args) {
        MyStackUsingOneQueue stack = new MyStackUsingOneQueue();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println(stack.q1.toString());
        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.top());
    }
}
