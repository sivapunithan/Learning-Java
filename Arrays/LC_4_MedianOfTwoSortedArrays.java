import java.util.Arrays;

public class LC_4_MedianOfTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2){
        int[] arr= mergeArrays(nums1, nums2);
        int len = arr.length;
        double median = 0;
        if (len%2 == 0){
            int middleElement = arr.length/2;
            int nextElement = middleElement - 1;
            System.out.println("The middle element: "+middleElement+" The next element: "+nextElement);
            median = (double) (arr[middleElement] + arr[nextElement])/2;
        } else {
            int middleElement = arr.length/2;
            median = arr[middleElement];
        }
        System.out.println(median);
        return median;
    }

    private int[] mergeArrays(int[] nums1, int[] nums2){
        int length = nums1.length + nums2.length; // 6
        int[] mergedArr = new int[length];
        int right =0;
        int left =0;
        for (int i=0; i<length; i++){
            if (nums1.length <= left){
                mergedArr[i] = nums2[right];
                right++;
            }
            else if (nums2.length <= right){
                mergedArr[i] = nums1[left];
                left++;
            }
            else if (nums1[left] < nums2[right]){
                mergedArr[i] = nums1[left];
                left++;
            } else {
                mergedArr[i] = nums2[right];
                right++;
            }
        }
        System.out.println(Arrays.toString(mergedArr));
        return mergedArr;
    }

    public static void main(String[] args) {
        LC_4_MedianOfTwoSortedArrays obj = new LC_4_MedianOfTwoSortedArrays();
        obj.findMedianSortedArrays(new int[]{1, 2, 3}, new int[]{4, 5, 6});
        //obj.mergeArrays(new int[]{1, 2, 3}, new int[]{4, 5, 6});
    }
}
