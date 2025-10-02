package Day_3;

import java.util.Scanner;

// Write a function that searches for an element in a n array and returns the index, if the element is not found return -1

public class Search_Array {

    public static int  FindElement(int element, int arr[]){
        for (int i =0; i < arr.length; i++){
            if (arr[i] == element){
                return i;
            }        
        }
        return -1;
    }
    public static void main(String[] args){
        while (true){
        int arr [] = {1,2,3,4,5,6,7,8,9};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to be searched");
        int target = sc.nextInt();
        int result = FindElement(target,arr);
        System.out.println("The Index of the given element is :"+" "+ result);
        }
    }
}
