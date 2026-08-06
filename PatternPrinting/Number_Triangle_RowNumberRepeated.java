package PatternPrinting;

public class Number_Triangle_RowNumberRepeated {
    public static void main(String[] args) {
        int n= 5;
        for (int i=1; i<=n; i++){
            String row = "";
            for(int j=1; j<=i; j++){
                row = row + i;
            }
            System.out.println(row);
        }
    }
}
