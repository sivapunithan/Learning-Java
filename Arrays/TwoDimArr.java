import java.util.Arrays;

public class TwoDimArr {

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {4, 5, 6, 7}};
//        System.out.println(Arrays.toString(arr[0]));
//        System.out.println(arr);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(arr.length);
//        System.out.println(Arrays.deepToString(arr));

        TwoDimArr.traverse(arr);


    }

    public static void traverse(int[][] arr){

        for (int[] a: arr){
            System.out.println(Arrays.toString(a));
        }
    }

}
