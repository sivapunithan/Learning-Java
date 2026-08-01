package Recursion;

public class Sum_of_Odd_no {

    int [] arr = {5, 4, 0, 2, 1};
    
    public int oddSum(int n){
        Boolean isodd = (arr[n] % 2) != 0;
        if (n == 0){
            if (isodd){
                return arr[n];
            } else{
                return 0;
            }
        }
        if(isodd){
            return arr[n] + oddSum(n-1);
        } else{
            return oddSum(n-1);
        }
    }
    public static void main(String[] args){
        Sum_of_Odd_no s = new Sum_of_Odd_no();
        int result = s.oddSum(s.arr.length - 1);
        System.out.println("The Odd sum :"+" "+result);
    }
}
