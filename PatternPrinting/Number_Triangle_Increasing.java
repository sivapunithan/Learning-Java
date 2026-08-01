package Day_5;

public class File8 {
    public static void main(String[] args) {
        int n=5;
        for(int i=0; i<=n; i++){
            String row= "";
            for(int j=1; j<=i; j++){
                row = row + j;
            }
            System.out.println(row);
        }
    }
    
}
