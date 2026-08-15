import java.util.Arrays;

public class TestingArray {
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4};
        int[] arr1 = {1, 2, 3, 4};

        System.out.println(arr);
        System.out.println(arr1);

        System.out.println(Arrays.toString(arr));

        Arrays.fill(arr1, 5);

        System.out.println(Arrays.toString(arr1));
        
    }
}
