package PatternPrinting;

public class Number_Triangle_Reverse {
    public static void main(String[] args) {
        int n =5;
        for (int i=0; i<n; i++){
            String row = "";
            for (int j=0; j<n-i; j++){
                row =  row + (j+1);
            }
            System.out.println(row);
        }
    }
}
