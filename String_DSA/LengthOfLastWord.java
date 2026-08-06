package String_DSA;

public class LengthOfLastWord {

    public static int lengthOfLastWord(String s){

        int length = 0;
        for(int i = s.length()-1; i >= 0; i--){
            if (s.charAt(i) != ' ') {
                length ++;
            } else{
                if(length > 0) return length;
            }
        }
        
        return length;
    }
    public static void main(String[] args) {
        LengthOfLastWord l = new LengthOfLastWord();
        int result = l.lengthOfLastWord("Hello punithan");
        System.out.println("The length :" + result);
    }
}
