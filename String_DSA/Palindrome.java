package String_DSA;

public class Palindrome {
    public static boolean palindrome(String word){
        word = word.toLowerCase();
        if (word.isBlank()) return false;
        int left = 0;
        int right = word.length()-1;

        while (right > left){
            if (word.charAt(left) != word.charAt(right) ){
                return false;
            }
            ++left;
            --right;
        }

        return true;
    }

    public static void main(String[] args) {
        boolean result = Palindrome.palindrome("");
        System.out.println(result);
    }
}
