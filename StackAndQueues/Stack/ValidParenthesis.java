package StackAndQueues.Stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;


public class ValidParenthesis {

    Deque<Character> stack = new ArrayDeque<>();
    Map<Character, Character> map = new HashMap<>();

    public boolean isValid(String s){

        map.put('{', '}');
        map.put('[', ']');
        map.put('(', ')');

        for (int i =0; i<s.length(); i++){
            char c = s.charAt(i);
            if (map.containsKey(c)){
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if (c != map.get(top)) return false;

            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParenthesis validParenthesis = new ValidParenthesis();
        validParenthesis.isValid("{()}");
        System.out.println(validParenthesis.stack);
        System.out.println(validParenthesis.stack.size());
    }
}
