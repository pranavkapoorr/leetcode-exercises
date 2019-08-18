package shiftarrayelements;

import java.util.Arrays;

public class Solution {
	public int[] solution(int[] A, int K) {
		if(A.length < 1 || A.length < K) {
			return A;
		}
		int[] temp = new int[A.length];
		int[] front = new int[K];
		int[] back = new int[A.length-K];
		int j = K-1;
		for(int i = A.length-1; i > A.length-1-K; i--) {
			front[j] = A[i];
			j--;
		}
		for(int i = 0; i < A.length -K; i++) {
			back[i] = A[i];
		}
		System.arraycopy(front, 0, temp, 0, front.length);
		System.arraycopy(back, 0, temp, front.length, back.length);
		return temp;
	}
	public static void main(String[] args) {
		int[] A = {};
		Arrays.stream(new Solution().solution(A, 3)).forEach(System.out::print);
	}
}
