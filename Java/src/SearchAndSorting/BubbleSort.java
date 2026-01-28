package SearchAndSorting;

import java.util.Arrays;

public class BubbleSort {

    public static int [] bubbleSort(int[] anyArray){

        int lengthArray = anyArray.length;
        for (int i=0; i < lengthArray - 1; i++ ){
            Boolean isSwapped = false;
            for (int j=0; j < lengthArray - 1 -i; j++){
                if (anyArray[j] > anyArray[j+1]){
                    int temp = anyArray[j];
                    anyArray[j] = anyArray[j+1];
                    anyArray[j+1] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped){
                break;
            }
        }
        return anyArray;
        
    }
    public static void main(String args[]){

        int array[] = {5, 7, 1, -8, 77, 0, 1};
        int result[] = bubbleSort(array);
        System.out.println("The result is "+" "+Arrays.toString(result));
    }
}


/*  TIME AND SPACE COMPLEXITY OF THIS ALG
    FOR THE WORST CASE THE ALG WILL RUN FOR 0(N ^ 2 )
   
    SPACE COMPLEXITY IS CONSTANT
    O(1)

    IN A CONDTION WE PROVING A MILLION OF SORTED ELEMENTS AND THE BUBBLE SORT WILL RUN TILL THE LAST
    HOW TO IMPROVE THE SOLUTION 

    PROVIDE A TOGGLE AND IF ANY SAPPING HAPPENED GO ON ELSE BREAK THE LOOP

*/