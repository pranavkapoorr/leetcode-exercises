import java.util.Arrays;

public class SearchInsertPosition {

    private int search(int[] myArr, int element) {
        int index = -1;
        if(myArr != null){
            if(myArr.length == 0){
                index = 0;
            }else{
                index = searchItemIndex(myArr, 0, myArr.length - 1, element);
            }
        }
        return index;
    }

    private int searchItemIndex(int[] myArr, int start, int end, int element){
        if(myArr.length-1 >= 1){
            int middleIndex = start + (end - start)/2;
            System.out.println("start: "+start+"  end:"+end +"   middle:"+middleIndex);
            if(element == myArr[middleIndex]){
                return middleIndex;
            }else if(element < myArr[middleIndex]){
                return searchItemIndex(myArr, 0, middleIndex -1, element);
            }else{
                return searchItemIndex(myArr, middleIndex + 1, end, element);
            }
        }
        
        return -1;
    }

    public static void main(String[] args) {
        int[] myArr = {1,2,4,5,6,7,11};
        int result = new SearchInsertPosition().search(myArr, 3);
        System.out.println(result);
    }
}