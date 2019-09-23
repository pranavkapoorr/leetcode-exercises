package amazon;
import java.util.*;

import com.sun.xml.internal.ws.util.StringUtils;
// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
// CLASS BEGINS, THIS CLASS IS REQUIRED
public class Solution
{ 
	// METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    public List<String> prioritizedOrders(int numOrders, List<String> orderList) 
	{
    	List<String> primeList = new ArrayList<>();
    	List<String> normalList = new ArrayList<>();
    	for(int i = 0; i < numOrders; i++) {
	    		String orderName = orderList.get(i);
	    		if(isPrime(orderName)){
	    			primeList.add(orderName);
	    		}else{
	    				normalList.add(orderName);
	    			}
	    	}
    	primeList.sort((String s1, String s2) -> {
    		String[] o1 = s1.split(" ");
    		String[] o2 = s2.split(" ");
    		if(o1[1].equals(o2[1])) {
    			if(o1[2].equals(o2[2])) {
    				return o1[0].compareTo(o2[0]);
    			}else {
    				return o1[2].compareTo(o2[2]);
    			}
    		}else {
    			return o1[1].compareTo(o2[1]);
    		}
    	});
    	orderList.clear();
    	orderList.addAll(primeList);
    	orderList.addAll(normalList);
    	primeList.clear();
    	normalList.clear();
		return orderList;
	}
    private boolean isPrime(String orderName) {
    	String[] order = orderName.split(" ");
		System.err.println(Arrays.toString(order));
		if(!Character.isDigit(order[1].charAt(0))){
			return true;
		}else {
			return false;
		}
    }
	// METHOD SIGNATURE ENDS
    public static void main(String[] args) {
    	List<String> orderList = new ArrayList<>();
    	orderList.addAll(Arrays.asList(
    			"zld 93 12",
    			"fp kindle book",
    			"10a echo show",
    			"17g 12 25 6",
    			"ab1 kindle book",
    			"125 echo dot second generation"
    			));
		new Solution().prioritizedOrders(orderList.size(), orderList).forEach(
				System.out::println);
	}
}