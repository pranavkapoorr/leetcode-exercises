package shiftarrayelements;

import java.util.Arrays;

public class BestSolution {
	public int[] solution(int[] A, int K) {
		if(A.length < 1) {
			return A;
		}
		for(int i = 1; i <= K; i++) {
			A = shift(A);
		}
		
		return A;
	}
	private int[] shift(int[] Arr) {
		int[] temp = new int[Arr.length];
		temp[0] = Arr[Arr.length-1];
		for(int i = 0; i < Arr.length-1; i++) {
			temp[i+1] = Arr[i];
		}
		return temp;
	}
	public static void main(String[] args) {
		int[] A = {1,2,3,4};
		Arrays.stream(new BestSolution().solution(A, 5)).forEach(System.out::print);
	}
}
