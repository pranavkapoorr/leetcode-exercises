package findingsmallestmissinginteger;

import java.util.Arrays;

public class Solution {
    public int solution(int[] A) {
        A = Arrays.stream(A).sorted().filter(e -> e > 0).distinct().toArray();
        if(A.length>0) {
        	int temp = 0;
        	for(int i = 0; i < A.length; i++) {
        		if(temp + 1 == A[i] && i == A.length - 1) {
        			return temp + 2;
        		}else if(temp + 1 == A[i]) {
            			temp = A[i];
            	}else {
        			return temp + 1;
        		}
            	
            }
        }
    	return 1;
    }
    public static void main(String[] args) {
    	int[] A = {0,1,2,3,4,5,7,8,9};
		System.out.println(new Solution().solution(A));
	}
}
