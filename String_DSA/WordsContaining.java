package String_DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordsContaining {

    public static List<Integer> findWordsContaining(String[] words, char x){

        List<Integer> result = new ArrayList<>();
        // ["abc","bcd","aaaa","cbc"] --> given array of words
        // Iterate it
        for (int i=0; i< words.length; i++){
            String word = words[i];
            for (int j =0; j< word.length(); j++){
                if (word.charAt(j) == x){
                    result.add(i);
                    break;
                }
            }
        }
        return result;
    }



    public static void main(String[] args) {
        List<Integer> output = WordsContaining.findWordsContaining(new String[]{"abc","bcd","aaaa","cbc"}, 'a');

        String[] testing = new String[]{"abc","bcd","aaaa","cbc"};
        System.out.println(testing[1].indexOf('d'));
        //System.out.println(output);
    }
}
