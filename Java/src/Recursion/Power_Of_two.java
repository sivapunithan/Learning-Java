package Recursion;

public class Power_Of_two {
    public static boolean isPowerOf2(int n){

        if (n ==1 ) return true;
        if ((n < 1) || (n % 2 != 0)) return false;
       
        return isPowerOf2(n/2);
    }
    public static void main(String[] args){
        int anyNumber = 64;
        boolean result = isPowerOf2(anyNumber);
        System.out.println("The given is power of 2"+" "+result);
    }
}
