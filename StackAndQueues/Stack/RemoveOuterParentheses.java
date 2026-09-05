package StackAndQueues.Stack;

/*
   Approach :-
      (()()) ((()))  --> Need to remove the outer parenthesis the output will be ()() ()

      so we are making indices for the parenthesis, the outer parenthesis will have the indices of 0 , means size of the stack
      if the size of the stack is > 1 we have to write the current char to the string ,

      here when we enclose the parenthesis, we are performing the pop operation



 */

import java.util.ArrayDeque;
import java.util.Deque;

public class RemoveOuterParentheses {

    public String removeOuterParenthesis(String s){
        Deque<Character> stack = new ArrayDeque<>();
        String ans = "";

        for (int i=0; i<s.length(); i++){
            if (s.charAt(i) == '('){
                stack.push(s.charAt(i));
            } else {
                stack.pop();
            }
            /*   At the first the stack, ( -> ((
                 then here comes )
                 then the stack will be ( -> size will be one
                 due to that write won't perform so i had the last condition

            */

            if (stack.size() > 1 || stack.size() == 1 && s.charAt(i) == ')'){
                ans = ans + s.charAt(i);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        RemoveOuterParentheses removeOuterParentheses = new RemoveOuterParentheses();
        String ans = removeOuterParentheses.removeOuterParenthesis("((((()))))");
        System.out.println(ans);
    }
}
