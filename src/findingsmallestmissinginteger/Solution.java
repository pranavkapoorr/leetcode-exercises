package findingsmallestmissinginteger;

import java.util.Arrays;

public class Solution {
    public int solution(int[] A) {
        int temp = 0;
        Arrays.sort(A);
        A = Arrays.stream(A).distinct().toArray();
    	for(int i = 0; i < A.length; i++) {
    		if(temp + 1 == A[i] && i == A.length - 1) {
    			return temp + 2;
    		}else if(temp + 1 == A[i]) {
        			temp = A[i];
        	}else {
    			return temp + 1;
    		}
        	
        }
    	return 0;
    }
    public static void main(String[] args) {
    	int[] A = {1,2,3};
		System.out.println(new Solution().solution(A));
	}
}
