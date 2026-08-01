package DayTwo;

public class Loops {

    public static String Greeting(){
         return "Hello Punithan";
    }
       

    public static void main(String [] args){
        for (int i=0; i<=10; i++){
            System.out.println("The value of i is :" + i);
            String greet= Greeting();
            System.out.println("Inviking the Greeting Method : " + greet);
        }
    }
    
}
