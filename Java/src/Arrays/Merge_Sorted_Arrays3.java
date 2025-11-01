package Arrays;
public class Merge_Sorted_Arrays3 {
    
    public int[] merge_Sorted_Arrays3(int[] nums1, int m, int[] nums2, int n){
        int p1 = m - 1;
        int p2 = n - 1;
        int i = m + n - 1;

        while (p1 >= 0 && p2 >= 0){
            if (nums1[p1] > nums2[p2]){
                nums1[i] = nums1[p1];
                p1--;
                i--;
            } else {
                nums1[i] = nums2[p2];
                p2--;
                i--;
            }
        }
        return nums1;
    }
    public static void main(String args[]){
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3;
        int n = 3;

        Merge_Sorted_Arrays3 obj = new Merge_Sorted_Arrays3();
        int[] result = obj.merge_Sorted_Arrays3(nums1, m, nums2, n);
        System.out.println("The Sorted Array is :"+ java.util.Arrays.toString(result));

        
    }
}
