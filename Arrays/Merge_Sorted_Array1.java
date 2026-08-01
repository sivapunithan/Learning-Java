package Arrays;

import java.util.Arrays;
public class Merge_Sorted_Array1 {

    public int[]  merge(int[] anyArray1, int m, int[] anyArray2, int n){
        for (int i=0; i<n; i++){
            // Here Copying the elements from the second array to the firt array 
            anyArray1[m+i] = anyArray2[i];
        }

        Arrays.sort(anyArray1);
        return anyArray1;
    }
    public static void main(String args[]){

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};

        Merge_Sorted_Array1 obj = new Merge_Sorted_Array1();
        int[] result = obj.merge(nums1, 3, nums2, 3);
        System.out.println("The Sorted Array is :"+Arrays.toString(result));
    }
}
