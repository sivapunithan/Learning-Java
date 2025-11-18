package Recursion;

public class Sum_Of_N_Numbers {
    public static int sum(int n){
        Thread.dumpStack();
        if (n == 0){
            return 0;
        }
        return n + sum(n-1);
    }
    public static void main(String[] args){

        int result = sum(5);
        System.out.println("The Sum is :"+" "+result);
    }
}
