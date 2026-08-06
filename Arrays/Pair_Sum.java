import java.util.ArrayList;
import java.util.Arrays;

public class Pair_Sum {
    

    public static ArrayList<Integer> pair_sum_brute_force(ArrayList<Integer> nums, int target){

        int n = nums.size();

        for (int i =0; i< n; i++){
            for (int j = i+1; j< n; j++){
                if(nums.get(i) + nums.get(j) == target){
                    ArrayList<Integer> result = new ArrayList<>();
                    result.add(i);
                    result.add(j);

                    return result;
                }
            }
        }

        return new ArrayList<>();
    }


    public static ArrayList<Integer> pair_sum(ArrayList<Integer> nums, int target){

        int left = 0, right = nums.size()-1;

        while (left < right) {
            
            int sum = nums.get(left) + nums.get(right);

            if (sum < target){
                left ++;
            } else if (sum > target){
                right --;
            } else{
                ArrayList<Integer> result = new ArrayList<>();
                result.add(left);
                result.add(right);

                return result;
            }
        }



        return new ArrayList<>();
    }

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        ArrayList<Integer> output = pair_sum(nums, 7);

        System.out.println(output);
    }
}
