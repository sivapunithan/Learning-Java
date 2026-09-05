package String_DSA;

import java.util.HashSet;
import java.util.Set;

public class LC_3_LengthOfLongestSubString {

    /*
    Approach -->
        Brute force approach
              Calculates the substring for every iteration and check the repeated value present or not

     */

    private int lengthOfLongestSubString(String s){
       int maxLen =0;
       for (int i=0; i<s.length(); i++){
           for (int j=i; j<s.length(); j++){
               String sub = s.substring(i, j+1);
               if (!hasRepeat(sub)){
                   maxLen = Math.max(maxLen, sub.length());
               }
           }
       }
       return maxLen;
    }

    private boolean hasRepeat(String sub){
        Set<Character> seen = new HashSet<>();
        for (char c : sub.toCharArray()){
            if (seen.contains(c)) return true;
            seen.add(c);
        }

        return false;
    }

    /*
    Optimizing the solution using two pointer by maintaining a window

    given String  abcded
     */

    private int lenghtOfSubString(String s){
        int left =0;
        int maxLen = 0;

        HashSet<Character> window = new HashSet<>();

        for(int right=0; right<s.length(); right++){
            char ch = s.charAt(right);

            while (window.contains(ch)){
                window.remove(s.charAt(left));
                left++;
            }

            window.add(ch);

            int len = right - left + 1;
            maxLen = Math.max(maxLen, len);
        }

        return maxLen;
    }

    public static void main(String[] args) {

    }
}
