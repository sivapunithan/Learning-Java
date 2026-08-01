package DayTwo;

import java.util.Scanner;


public class EvenOrOdd {

    public static String CheckEvenOdd(int n){
    if (n%2==0){
        return "Even";
    } else {
        return "Odd";
    }
}

    public static void main(String[] args){
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        number = scanner.nextInt();
        String result  = CheckEvenOdd(number);
        System.out.println("The number is:" + result);
    }
}
