import java.util.*;

public class ThreeSum {

    public static List<List<Integer>> threeSumBruteForce(int[] nums){
        List<List<Integer>> result = new ArrayList<>();

        // {2, 1, -1, 0, 1, 2}
        for (int i=0; i<nums.length-1; i++){
            for (int j=i+1; j<nums.length-1; j++){
                for (int k=j+1; k<=nums.length-1; k++ ){
                    if (nums[i] + nums[j] + nums[k] == 0){
                        List<Integer> triplet = new ArrayList<>();
                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplet.add(nums[k]);

                        Collections.sort(triplet);

                        if (!result.contains(triplet)){
                            result.add(triplet);
                        }
                    }
                }
            }
        }

        return result;
    }

    public static List<List<Integer>> threeSum(int[] nums){

        // Sort the Array now the Array will become {-4, -1, -1, 0, 1, 2}
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();

        for (int i=0; i<nums.length-2; i++){
            int j = i+1;
            int k = nums.length-1;

            while (k>j){
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0){
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[j]);
                    triplet.add(nums[k]);

                    result.add(triplet);

                    --k;
                    ++j;
                } else if (sum < 0) {
                    ++j;
                } else {
                    --k;
                }
            }
        }


        return new ArrayList<>(result);
    }

    public static void main(String[] args) {
        List<List<Integer>> ans =ThreeSum.threeSum(new int[]{-1,0,1,2,-1,-4});
        System.out.println("The result is : "+ ans);
    }
}
