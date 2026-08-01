package DayTwo;

import java.util.Scanner;

public class Methods {


    public static int add (int x, int y){
        return x+y;
    }

    public static String CheckEligibility(int age){
        if (age>=18){
            return "You are eligible for voting";
        } else {
            return "You are not eligible for voting";
        }
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int sum = add(a, b);
        System.out.println("Sum: " + sum);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = scanner.nextInt();


        
    }
    
}
