package StackAndQueues.Stack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class MinStack {
    public MinStack(){

    }

    /*
    Approach :-
       Requirement is , need to perform getMin in the TC of O(1)
       stack is more likely an array to find the min element need to traverse all the element the TC is O(n)
       So while insertion we are adding a flag onto it, to keep track of min element

       why each line maintaining the flag, we have an option pop that's why
     */

    Deque<int[]> stack = new ArrayDeque<>();

    public void push(int value) {
        if (stack.isEmpty()){
            stack.push(new int[]{value, value});
        } else {
            int[] top = stack.peek();
            int min = top[1];
            if (value < min){
                stack.push(new int[]{value, value});
            } else {
                stack.push(new int[]{value, min});
            }

        }

    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        int[] top = stack.peek();
        return top[0];
    }

    public int getMin() {
        int[] top = stack.peek();
        return top[1];
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(10);
        minStack.push(20);
        minStack.push(5);

        System.out.println(Arrays.deepToString(minStack.stack.toArray()));
        minStack.pop();
        System.out.println(Arrays.deepToString(minStack.stack.toArray()));
        System.out.println(minStack.getMin());
    }
}
