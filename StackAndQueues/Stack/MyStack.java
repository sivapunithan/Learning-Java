package StackAndQueues.Stack;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {

    /*
    Using queues, have to build a stack, internally it need to use queues and need to perform the stack operations

     */

    Queue q1 = new LinkedList<>();
    Queue q2 = new LinkedList<>();

    public MyStack() {

    }

    public void push(int x) {
        q1.offer(x);
    }

    public int pop() {

        /*
        How pop is going to working

        we have two queues q1 and q2
          --> when we do q1.pop then we need to poll all the elements and add it to the q2
              and we are going to return the last element
              i.e

              1, 2, 3, 4, 5
              q1.pop()

              in q2 we have
              1, 2, 3, 4 and we will return the last element
         */

        while (q1.size() > 1){
            q2.offer(q1.poll());
        }
        int ans = (int) q1.poll();
        Queue temp = q1;
        q1 = q2;
        q2 = temp;

        return ans;
    }

    public int top() {
        while(q1.size() > 1){
            q2.offer(q1.poll());
        }
        int front = (int) q1.poll();
        q2.offer(front);

        Queue temp = q1;
        q1 = q2;
        q2 = q1;

        return front;
    }

    public boolean empty() {
        return q1.isEmpty();
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.q1.toString());
    }
}
