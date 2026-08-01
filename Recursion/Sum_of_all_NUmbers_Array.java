package Recursion;

public class Sum_of_all_NUmbers_Array {

    static int [] array1 = {5, 4, 0, 2, 1};

    public static int sum(int n){
        if (n == 0){
            return array1[0];
        }

        return array1[n] + sum(n - 1);
    }
    public static void main(String[] args){
        
        int result = sum(array1.length - 1);
        System.out.println("The Sum is "+" "+result);
    }
}
