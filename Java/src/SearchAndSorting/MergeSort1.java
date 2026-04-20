package SearchAndSorting;

public class MergeSort1 {

    public static int[] merge(int left[], int right[]){
        int res[] = new int[left.length + right.length];
        int i=0, j=0, k =0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]){
                res[k++] = left[i++];
            } else{
                res[k++] = right[j++];
            }
        }

        while (i < left.length) res[k++] = left[i++];
        while (j < right.length) res[k++] = right[j++];
        return res;
    }

    public static int[] sortArray(int[] arr){
        if (arr.length <= 1) return arr;
        int mid = arr.length / 2;

        int[] left = sortArray(copy(arr, 0, mid));
        int[] right = sortArray(copy(arr, mid, arr.length));

        return merge(left, right);
    }
    
    public static int[] copy(int[] arr, int from, int to){
        int[] res = new int[to - from];
        for (int i = 0; i < res.length; i++){
            res[i] = arr[from + i];
        }
        return res;
    }

    public static void main(String[] args){
        int[] nums = {5, 3, 2, 1};
        int[] sorted = sortArray(nums);

        for (int n : sorted){
            System.out.println(n + " ");
        }
    }
}
