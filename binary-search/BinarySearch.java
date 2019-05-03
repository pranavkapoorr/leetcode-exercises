import java.util.Arrays;

public class BinarySearch{

    private int searchItem(int[] myArr,int element){
        System.out.println("new array: "+Arrays.toString(myArr));
        if(myArr.length-1 >= 1){
            int middleIndex = (myArr.length)/2 -1;
        
            if(element == myArr[middleIndex]){
                return middleIndex;
            }else if(element < myArr[middleIndex]){
                return searchIndex(Arrays.copyOfRange(myArr, 0, middleIndex ), element);
            }else{
                return searchIndex(Arrays.copyOfRange(myArr, middleIndex + 1, myArr.length), element);
            }
        }
        
        return -1;
    }

    public static void main(String[] args){
        int[] myArr = {2,3,1,4,5,30,9,11,64,57,20};
        Arrays.sort(myArr);
        int toBeSearched = 57;
        int result = new BinarySearch().searchItem(myArr,toBeSearched);
        System.out.println(result!=-1?toBeSearched + " found ":toBeSearched + " Not found!");
    }
}