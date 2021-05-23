package chanagecellstate;

//IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
import java.util.*;
import java.util.stream.Collectors;
//SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
//DEFINE ANY CLASS AND METHOD NEEDED
//CLASS BEGINS, THIS CLASS IS REQUIRED
public class Solution{        
// METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
 public List<Integer> cellCompete(int[] states, int days){
	 List<Integer> temp = new ArrayList<>();
	 for(int i = 0; i < states.length; i ++) {
		 if(days%2!=0) {
			 if(states[i]==1) {
				 temp.add(0);
			 }else {
				 temp.add(1);
			 }
		 }else {
			 temp.add(states[i]);
		 }
	 }
	 return temp;
 }
public static void main(String[] args) {
	new Solution();
	//[1,0,0,0,0,1,0,0]
	//[0,1,0,0,1,0,1,0]
}
}