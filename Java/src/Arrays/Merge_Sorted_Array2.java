package Arrays;

import java.util.Arrays;

public class Merge_Sorted_Array2 {

    public int[] merge1 (int[] nums1, int m, int[] nums2, int n){

        int p1 = 0;
        int p2 = 0;
        int i =0;
        int[] nums1Copy = new int[m+n];
        System.arraycopy(nums1, 0, nums1Copy, 0, m);

        while (p1 < m && p2< n){
            if (nums1Copy[p1] < nums2[p2]){
                nums1[i] = nums1Copy[p1];
                p1++;
                i++;
            } else {
                nums1[i] = nums2[p2];
                p2++;
                i++;
            }
        }
        while (p1 < m){
            nums1[i] = nums1Copy[p1];
            i++;
            p1++;
        }
        while (p2 < n){
            nums1[i] = nums2[p2];
            i++;
            p2++;
        }
        return nums1;
    }
    public static void main(String args[]){

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};

        Merge_Sorted_Array2 obj = new Merge_Sorted_Array2();
        int[] result = obj.merge1(nums1, 3, nums2, 3);
        System.out.println("The Sorted Array is :"+ Arrays.toString(result));
    }
    
}
