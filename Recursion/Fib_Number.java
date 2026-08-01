package Recursion;

public class Fib_Number {
    public static int fib(int n){
        if(n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }
    public static void main(String[] args){

        int result = fib(10);
        System.out.println("The fib result is"+" "+result);
    }
}
