import java.util.*;

public class Solution1 {
	public int solution(int X, int[] A) {
		List<Integer> indexes = new ArrayList<>();
		int K = -1;
		int lastIndex = A.length -1 ;
        for(int i = 0; i < A.length; i++) {
        	if(X == A[i] ) {
        		indexes.add(i);
        	}
        }
        if(indexes.size() < 1){
        	K = lastIndex + 1;
        }else {
        	K = lastIndex + 1 - indexes.size();
        	if(indexes.contains(K)) {
        		K = K-1;
        	}
        }
         
        return K;
    }
	public static void main(String[] args) {
		
		System.out.println(new Solution1().solution(5, new int[] {5,5,1,7,2,5,4}));
	}
}
