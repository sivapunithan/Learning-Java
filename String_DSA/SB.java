package String_DSA;

import java.util.Arrays;

public class SB {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        for (int i=0; i<26; i++){
            char ch = (char) ('a'+i);
            builder.append(ch);
        }
        System.out.println(builder);
        System.out.println(Arrays.toString(builder.toString().toCharArray()));
        System.out.println(builder.indexOf("k"));
        System.out.println(builder.subSequence('a', 'h'));
    }
}
