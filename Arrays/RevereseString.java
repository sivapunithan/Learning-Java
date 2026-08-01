package Arrays;
public class RevereseString {

    public static void revereseString (String[] s){
        int start = 0;
        int end = (int) Math.floor(s.length /2);

        for (int i=0; i<end; i++){
            String top = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = top;
        }
    }
    public static void main(String args[]){
        String anyArray [] = {"h","e","l","l","o"};
        revereseString(anyArray);
    }
}
