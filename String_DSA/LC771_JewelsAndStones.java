package String_DSA;

import java.util.HashSet;
import java.util.Set;

public class LC771_JewelsAndStones {

    /*
    Approach
       -> Iterate the jewels string as the outer loop
          and stones as the innerLoop
       -> if we found the jewels in the stones string increase the counter by one
     */
    public static int numJewelsInStones(String jewels, String stones){
        int count = 0;

        for (int i=0; i<jewels.length(); i++) {
            for (int j = 0; j < stones.length(); j++) {
                if (jewels.charAt(i) == stones.charAt(j)) {
                    count++;
                }
            }
        }
        return count;
    }

      /*
        Approach 2
         --> Create a hashset and add the jewels characters onto it
         --> Check the stones character in the hashset
         */

    public static int numJewelsInStonesOptml(String jewels, String stones){
        int count = 0;
        Set<Character> jewelSet = new HashSet<>();

        for (char jewel : jewels.toCharArray()){
            jewelSet.add(jewel);
        }

        for (int i=0; i<stones.length(); i++){
            if (jewelSet.contains(stones.charAt(i))){
                count ++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(LC771_JewelsAndStones.numJewelsInStones("aA", "aAAbbbb"));
        System.out.println(LC771_JewelsAndStones.numJewelsInStonesOptml("aA", "aAAbbbb"));
    }
}
