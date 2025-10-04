package Day_5;

public class File13 {
    public static void main(String[] args) {
        int n = 5;
        for (int i=0; i<n; i++){
            String row = "";
            int toggle = 1;
            for (int j=0; j<=i; j++){
                row = row + toggle;
                if (toggle == 1){
                    toggle = 0;
                } else{
                    toggle =1;
                }
            }
            System.out.println(row);
        }
    }
}
