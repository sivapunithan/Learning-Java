import java.util.Arrays;

public class RemoveDuplicate {


    public static void removeDuplicates(int[] array){

            int slow = 0;

            for(int fast = 0; fast < array.length; fast ++){
                if (array[fast] != array[slow]){
                    slow ++;

                    array[slow] = array[fast];
                }
            }

            
        }
    
    public static void main(String[] args) {
        
        int arr[] = {1,2,2,3,4,5,66,66,2222,222,9990,444444};
        removeDuplicates(arr);
    }
}
