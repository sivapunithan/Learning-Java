package Day_5;

public class File11 {
    public static void main(String[] args) {
        int n= 5;
        for(int i=0; i<n; i++){
            String row = "";
            for (int j=0; j<n-i; j++){
                row = row + "*";
            }
            System.out.println(row);
        }
    }
}
