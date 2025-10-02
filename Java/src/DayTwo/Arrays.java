package DayTwo;

public class Arrays {
    public static void main(String [] args){
        int arr[] = { 10, 20, 30, 40 ,50};
        for(int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 0){
                System.out.println("The value is even :" + arr[i]);
            }
            System.out.println("The value at te index " +" "+ i+ " " + "is"+ " " + arr[i]);
        }
    }
}
