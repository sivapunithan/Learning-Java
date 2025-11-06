package Arrays;

import java.util.Arrays;

public class Missing_Number {

    public static int findMissingNumber(int[] anyArray){

        int n = anyArray.length;
        int total =0;
        int sum = (n*(n+1)) / 2;
        for (int i=0; i<n; i++){
            total = total + anyArray[i];
        }
        int Missing = sum - total;

        return Missing;
    } 
    public static void main(String[] args){
        int nums[] = {9,6,4,2,3,5,7,0,1};
        int result = findMissingNumber(nums);
        System.out.println("The Missing Number is :"+" "+result);
    }
}
