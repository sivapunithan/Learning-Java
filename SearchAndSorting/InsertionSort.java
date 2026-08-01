package SearchAndSorting;

import java.lang.reflect.Array;
import java.util.Arrays;



public class InsertionSort {
    /*Insertion Sort */
    public static int[] insertionSort(int[] array){
        int n = array.length;
        for (int i=1; i < n; i++){
            int curr = array[i];
            int prev = i - 1;

            while (prev >=0 && array[prev] > curr){
                array[prev + 1] = array[prev];
                prev --;
            }
            array[prev + 1] = curr;
        }
        return array;

    }
    public static void main(String args[]) {
      int arr[] = {3, 84, 67, -32, 7, 0, 1};
      int result[] = insertionSort(arr);

      System.out.println("The Result is "+ " " +Arrays.toString(result));
}
}