package SearchAndSorting;

public class BinarySearch {
    public static int Binary(int[] anyArr, int target){

        
        int left = 0;
        int right = anyArr.length - 1;

        while (right >= left) {
            int middle = (right + left) / 2;
            if (target == anyArr[middle]) {
                return anyArr[middle];
            } 
            else if (target > anyArr[middle]) {
                left = middle + 1;
            }
            else{
                right = middle - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int arr[] = {-5, -3, 0, 6, 7, 9};
        System.out.println("The index of the target is :"+" "+Binary(arr, -3));

    }
}
