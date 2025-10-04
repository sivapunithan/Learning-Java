package Day_4;

public class File3 {
    public static int FindSecondLargest(int anyArr[]){
        if(anyArr.length<2){
            return 0;
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i=0; i < anyArr.length; i++){
            if (anyArr[i] > largest){
                secondLargest = largest;
                largest = anyArr[i];
            } else if (anyArr[i] > secondLargest && anyArr[i] != largest){
                secondLargest = anyArr[i];
            }
        }
        return secondLargest;
    }
    public static void main(String[] args){
        int arr[] = {1000,67548,5,-85849,73829,65,0,-3,674};
        int result = FindSecondLargest(arr);
        System.out.println("The Second largest element in an array :"+" "+ result);
    }
}
