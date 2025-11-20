package Recursion;

public class Sum_of_Odd_no {

    int [] arr = {5, 4, 0, 2, 1};
    
    public int oddSum(int n){
        if (n < 0){
            return 0;
        }
        if(n % 2 == 0){
            return oddSum(n-1);
        }
        if(n == 0){
            return arr[0];
        }

        return arr[n] + oddSum(n-1); 
    }
    public static void main(String[] args){
        Sum_of_Odd_no s = new Sum_of_Odd_no();
        int result = s.oddSum(s.arr.length - 1);
        System.out.println("The Odd sum :"+" "+result);
    }
}
