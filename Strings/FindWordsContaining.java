package Strings;

import java.util.ArrayList;
import java.util.List;

public class FindWordsContaining {
    
    public static List<Integer> findWordsContaining(String[] words, char x){

        int len = words.length-1;

        // "SIVA", "PUNITHAN"

        List<Integer> count = new ArrayList<Integer>();

        for(int i=0; i<=len; i++){
            int n = words[i].length() - 1;
            String word = words[i];
            for(int j=0; i<=n; j++){
                if (word.charAt(j) == x){
                    count.add(i);
                    continue;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        
        String[] words = {"siva", "punithan"};

        List<Integer> output = FindWordsContaining.findWordsContaining(words, 'i');
        System.out.println("The output is :" + output);

    }
}
