package LinkedList;

import java.util.ArrayList;
import java.util.List;

public class LLTraversal {

    public List<Integer> LLTraversal(Node head){

        List<Integer> result = new ArrayList<>();

        while (head != null){
            result.add(head.val);
            head = head.next;
        }

        return result;
    }


}
