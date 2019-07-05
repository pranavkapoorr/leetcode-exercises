package linearsearch;

public class LinearSearch{

    private int searchItem(int[] myArr,int element){
    
        for(int i = 0;i < myArr.length; i++){
            if(myArr[i]==element){
                return i;
            }
        }
        
        return -1;
    }

    public static void main(String[] args){
        int[] myArr = {2,3,1,4,5,30,9,11,64,57,20};
        int toBeSearched = 57;
        int result = new LinearSearch().searchItem(myArr,toBeSearched);
        System.out.println(result!=-1?toBeSearched + " found at index: "+result:toBeSearched + " Not found!");
    }
}