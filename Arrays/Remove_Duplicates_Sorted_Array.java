package Day_7;

import java.util.Arrays;

public class File17 {

    public static int[] Out(int[] anyArr){
    
        int x =0;
        for (int i=0; i<anyArr.length; i++){
            if( anyArr[i] > anyArr[x]){
                x++;
                anyArr[x] = anyArr[i];
            }
        }
        return anyArr;  // If Want to Return the No of Unique Elements Return X+1
    }
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,4,5,66,66,2222,222,9990,444444};
        int result[] = Out(arr);
        System.out.println("Our Result"+" "+Arrays.toString(result));
    }
    
}
