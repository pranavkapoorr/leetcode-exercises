package findunpairedelementinarray;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public int solution(int[] A) {
    	HashMap<Integer,Integer> valCount = new HashMap<>();
    	int unpairedValue = 0;
    	Arrays.sort(A);
    	int[] temp = Arrays.stream(A).distinct().toArray();
    	for(int i = 0;i < temp.length;i++) {
    		valCount.put(temp[i], countOccurence(A, temp[i]));
    	}
    	unpairedValue = valCount.entrySet().stream().filter(v -> v.getValue()%2!=0).collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue())).entrySet().iterator().next().getKey();
    	return unpairedValue;
    }
    private int countOccurence(int[] arr, int toCount) {
    	int temp = 0;
    	for(int i = 0; i < arr.length; i++) {
    		if(arr[i]>toCount) {
    			break;
    		}else {
    			if(arr[i]==toCount) {
    				temp ++;
    			}
    		}
    	}
    	return temp;
    }
    public static void main(String[] args) {
    	int[] A = {9,3,9,3,9,7,9};
		System.err.println("sol is -> " + new Solution().solution(A));
	}
}