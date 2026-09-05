package patterns;

import java.util.Arrays;

public class Intro {

    public int[] insertArr(int[] arr, int pos, int val){

        System.out.println("The length of the arr: "+ arr.length);

       for (int i = arr.length-1; i > pos; i--){
           arr[i] = arr[i-1];
       }
       arr[pos] = val;

        return arr;
    }

    public int[] deleteArr(int[] arr, int pos){

        for (int i=pos; i<arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = 0;
        return arr;
    }



    public static void main(String[] args) {
        Intro introArr = new Intro();
        int[] ans = introArr.insertArr(new int[]{1, 2, 3, 5, 0}, 3, 4);
        System.out.println(Arrays.toString(ans));

        int[] deleteArr = introArr.deleteArr(ans, 3);
        System.out.println(Arrays.toString(ans));
    }
}
