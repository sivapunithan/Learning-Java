package Math;

public class Count_Digits {
    public static void main(String[] args) {
        int count = 0;
        int n=-5678;
        n= Math.abs(n);
        while(n>0){
            n =  n/10;
            count++;
        }
        System.out.println(count);
    }
}
