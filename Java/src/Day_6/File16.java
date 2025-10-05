package Day_6;

import java.util.Scanner;

public class File16 {

    public static boolean isPalindrome(int anyNumber){
        anyNumber = Math.abs(anyNumber);
        int reversed =0;
        int digit =0;
        int original = anyNumber;

        while (anyNumber > 0){
            digit = anyNumber%10;
            anyNumber = anyNumber/10;
            reversed = reversed*10 + digit;
        }
        if (reversed == original) {
           return true; 
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number tocheck whether it is palindrome or not :");
        int num = sc.nextInt();
        boolean result = isPalindrome(num);
        //if (result == true)? System.out.println("Yes it is palindrome"); : System.out.println("No it is not !");

        System.out.println(result? "Yes it is Palindrome !" : "No, it is not !");
    }
    
}
