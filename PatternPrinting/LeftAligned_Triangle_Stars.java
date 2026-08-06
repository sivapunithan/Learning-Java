package PatternPrinting;

public class LeftAligned_Triangle_Stars {
    public static void main(String[] args) {
        int n=5;
       
        for(int i=0; i<n; i++){
             String row ="";
            for (int j=0; j<=i; j++){
                row = row+"*";  
            }
             System.out.println(row);
        }
    }
}
