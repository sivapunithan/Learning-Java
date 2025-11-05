package Arrays;
public class Move_Zeros {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeros(nums);
        System.out.println(java.util.Arrays.toString(nums));
    }

    public static int[] moveZeros(int[] anyArray){

        int x =0;
        for (int i=0; i<anyArray.length; i++){
            if (anyArray[i] != 0){
                anyArray[x] = anyArray[i];
                x++;
            }
        }
        for (int i=x; i< anyArray.length; i++){
            anyArray[i] = 0;
            x++;
        }
        
        return anyArray;
    }
}
