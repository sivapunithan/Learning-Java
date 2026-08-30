package String_DSA;

import java.util.*;

public class LC3541_MaxFreqSum {

    public static void main(String[] args) {


        System.out.println(LC3541_MaxFreqSum.maxFreqSum("aeiaeia"));
    }

    /*
    Approach
     -->Initializing a set with vowels and a hashmap cuz need to check how many char appear how many times **(Pair and value)**

     --> Iterate the string if vowels set contain it then we need to add it in vowels else add it to consonants
     */

    public static int maxFreqSum(String s) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        Map<Character, Integer> resultMap = new HashMap<>();

        int con=0, vow= 0;

        for (char ch: s.toCharArray()){
            resultMap.put(ch, resultMap.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> result : resultMap.entrySet()){
            char ch = result.getKey();
            int count = result.getValue();
            if (vowels.contains(ch)) {
                vow = Math.max(count, vow);
            } else {
                con = Math.max(count, con);
            }
        }
        return vow + con;
    }
}
