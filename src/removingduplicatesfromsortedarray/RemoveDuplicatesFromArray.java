package removingduplicatesfromsortedarray;

import java.util.Arrays;


public class RemoveDuplicatesFromArray{

    private int[] removeDuplicates(int[] array){
        return Arrays.stream(array).distinct().toArray();
    }

    public static void main(String[] args){ 
        int[] myArray = {1,2,2,3,3,4,5,6};
        System.out.println( Arrays.toString(new RemoveDuplicatesFromArray().removeDuplicates(myArray)));
    }
}