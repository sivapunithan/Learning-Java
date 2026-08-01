package Day_5;

public class File12 {
    public static void main(String[] args) {
        int n= 5;
        for(int i=0; i<n; i++){
            String row ="";
            // Adding Empty Spaces
            for (int j=0; j<n-(i+1); j++){
                row = row+ " ";
            }
            // Adding Stars
            for (int k=0; k<=i; k++){
                row = row+ "*";
            }
            System.out.println(row);
        }
    }
}
