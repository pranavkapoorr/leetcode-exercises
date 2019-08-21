package reversealist;

import java.util.*;

public class ReverseList {

    //basic implementation can be used in any oo language
    private List<Integer> reverseList(List<Integer> intList){
        List<Integer> tempList = new ArrayList<>();
        for(int i = intList.size()-1;i>=0;i--){
            tempList.add(intList.get(i));
        }
        return tempList;
    } 

    public static void main(String[] args){
        System.out.println(new ReverseList().reverseList(Arrays.asList(1,2,3,4)));
    }

}