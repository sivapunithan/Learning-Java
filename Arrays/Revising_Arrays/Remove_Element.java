package Revising_Arrays;

public class Remove_Element {
    
    public static int[] removeElement(int[] arr, int target){

        int x =0;
        for (int i = 0; i<arr.length; i++){
            if(arr[x] != target){
                arr[x] = arr[i];
                x++;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        
    }
}
