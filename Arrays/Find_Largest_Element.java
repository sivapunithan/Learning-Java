package Day_4;

public class File2 {

    public static int FindLargest(int arr[]){
        int largest = arr[0];
        for (int i=0; i<arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,533,22,78,343,643,-56,89,244};
        int result = FindLargest(arr);
        System.out.println("The largest Number in an array is :"+" "+result);
    }
}
