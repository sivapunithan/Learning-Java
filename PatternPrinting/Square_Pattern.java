package Day_5;

public class File6 {
    public static void main(String[] args) {
        int n = 4;
       
        for (int i = 0; i < n; i++) {
             String row = "";
            for (int j = 0; j < n; j++) {
                row = row + "*";
            }
            System.out.println(row);
        }
        
    }
}
