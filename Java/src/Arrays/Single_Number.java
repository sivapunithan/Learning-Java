package  Arrays;

import java.util.HashMap;

public class Single_Number {


    public static void main(String[] args){
    int[] nums = {4,1,2,1,2};
    int result = Single_Number.singleNumber(nums);
    System.out.println("The Single Number is :"+ " " +result);
    }

    public static int singleNumber (int[] nums){


        HashMap hash =  new HashMap<>();

        for (int i =0; i < nums.length; i++){
            if (hash.containsKey(nums[i])){
                hash.put(nums[i], (int) hash.get(nums[i]) + 1);
            } else {
                hash.put(nums[i], 1);
            }
        }

        for (int i= 0; i<nums.length; i++){
           if ( (int) hash.get(nums[i]) == 1 ){
               return nums[i];
           }
        }
        return -1;
    }
}
