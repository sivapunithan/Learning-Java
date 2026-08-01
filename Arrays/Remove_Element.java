// Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

// Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:

// Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
// Return k.

//  consider this a array nums [] = {1, 3,3,6,9,3}

package Arrays;

public class Remove_Element {
    public static int removeElement (int [] nums, int val){
        int x = 0;
        for (int i= 0; i< nums.length; i++){
            // Shift the elements only if 
            if (nums[i] !=  val){
                nums[x] = nums[i];
                x ++;
            }
        }
        return x + 1;
    }
    public static void main(String[] args) {
        int anyArray [] = {1,3,3,6,9,3};
        int val = 3;
        int result = removeElement(anyArray, val);
        System.out.println(result);
    }
}
