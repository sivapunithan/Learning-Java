package SearchAndSorting;

import java.util.Arrays;

public class SelectionSort {

    public static int[] selectionSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = a[i];
                a[i] = a[min];
                a[min] = temp;
            }
        }
        return a;
    }

    public static void main(String args[]) {
        int arr[] = { 3, 84, 67, -32, 7, 0, 1 };
        int result[] = selectionSort(arr);
        System.out.println("The result is " + " " + Arrays.toString(result));
    }
}


/*
   TIME COMPLEXITY --> 
   TWO LOOPS RUNNING IN THE O(N)   SO O(N^2)

   SPACE COMPLEXITY 
   O(1)
 */