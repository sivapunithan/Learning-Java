package Day_3;

import java.util.ArrayList;

public class File1 {

    public static int[] GetNegative(int anyArray[]){
      ArrayList<Integer> negative = new ArrayList<>();

      for(int i = 0; i < anyArray.length; i++){
        if(anyArray[i] < 0){
            negative.add(anyArray[i]);
        }
      }

      int[] result = new int[negative.size()];
      for (int i =0; i< negative.size(); i++){
        result [i] = negative.get(i);
      }
      return result;
    }
    public static void main(String[] args){
        int arr [] = {1,2,3,4,5,6,7,8,9,-1,-2,-3,-4,-5};
        int [] result = GetNegative(arr);
        for (int element : result){
            System.out.println("The Negative Elements are "+ " "+element);
        }
    }
}
