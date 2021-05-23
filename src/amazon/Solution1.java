package amazon;

import java.util.*;

public class Solution1 {
	// METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    int minimumDistance(int numRows, int numColumns, List<List<Integer>> area)
    {	
    	area.forEach(l -> {
    		System.err.println(l);
    	});
    	for(int i = 0 ; i< area.size();i++) {
    		
    		for(int j = 0; j < area.get(i).size();j++) {
    			System.out.println();
    		}
    	}
        return 0;
    }
    // METHOD SIGNATURE ENDS
    public static void main(String[] args) {
    	List<List<Integer>> area = new ArrayList<List<Integer>>();
    	List<Integer> l1 = new ArrayList<Integer>();
    	List<Integer> l2 = new ArrayList<Integer>();
    	List<Integer> l3 = new ArrayList<Integer>();
    	l1.add(1);
    	l1.add(0);
    	l1.add(0);
    	l2.add(1);
    	l2.add(0);
    	l2.add(0);
    	l3.add(1);
    	l3.add(9);
    	l3.add(1);
    	area.add(l1);
    	area.add(l2);
    	area.add(l3);
  
		System.out.println(new Solution1().minimumDistance(3, 3, area));
	}
}
