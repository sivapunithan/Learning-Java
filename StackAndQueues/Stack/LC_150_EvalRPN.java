package StackAndQueues.Stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class LC_150_EvalRPN {
    /*
    Approach:-
       Reverse polish notation --> a b + c -
                                   ( a + b ) - c

      10 6 9 3 + -11 * / * 17 + 5 +

      iterate the expression string , pushing the elements onto the stack
      if the element is a valid operator then,
          we need to pop the last elements from the stack perform the operation and again push back the value onto the stack

       stack ->  10, 6
       here we reached the "+" operator, then 10 +6
       stack -> 16, 9 , 3
     */

    public int evalRpn(String[] tokens){

        Deque<String> stack = new ArrayDeque<>();
        Map<String, BiFunction<Integer, Integer, Integer>> ops = new HashMap<>();
        ops.put("+", (a, b) -> a+b);
        ops.put("-", (a, b) -> a-b);
        ops.put("*", (a, b) -> a*b);
        ops.put("/", (a, b) -> a/b);

        for (String s : tokens){
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){
                /*
                a --> The second popped element
                b --> The first popped element
                 */
                int b = Integer.parseInt(stack.pop());
                int a = Integer.parseInt(stack.pop());

//                int result = switch (s) {
//                    case "+" -> a + b;
//                    case "-" -> a - b;
//                    case "*" -> a * b;
//                    default -> a / b;
//                };
                int result = ops.get(s).apply(a, b);

                stack.push(String.valueOf(result));

            } else {
                stack.push(s);
            }
        }

        System.out.println(stack);

        return Integer.parseInt(stack.pop());
    }

    public static void main(String[] args) {
        LC_150_EvalRPN obj = new LC_150_EvalRPN();
        System.out.println(obj.evalRpn(new String[]{"2","1","+","3","*"}));
        obj.evalRpn(new String[]{"4","13","5","/","+"});
    }
}
