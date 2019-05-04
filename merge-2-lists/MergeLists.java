import java.util.*;

public class MergeLists {
    public List<Integer> mergeTwoLists(List l1, List l2) {
        l1.addAll(l2);
        Collections.sort(l1);
        return l1;
    }
   

    public static void main(String[] args){
        List l1 = new ArrayList(Arrays.asList(1,2,4));
        List l2 = new ArrayList(Arrays.asList(1,3,4));
        System.out.println(new MergeLists().mergeTwoLists(l1,l2));
    }
}