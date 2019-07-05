package removenthelementfromlinkedlistend;

import java.util.Arrays;
import java.util.LinkedList;

public class RemoveFromList{

    private LinkedList removeFromEnd(LinkedList list, int index){
        if(list != null && index >= 0){
            list.remove(list.size()-index);
        }
        return list;
    }

    public static void main(String[] args){
        LinkedList list = new LinkedList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println(new RemoveFromList().removeFromEnd(list,2));
    }
}