package greatestintegerinarray;

import java.util.Arrays;

public class Solution {
	public int findGreatestUsingStreams(int[] arr) {
		return Arrays.stream(arr).max().getAsInt();
	}
	public int findGreatest(int[] arr) {
		int greatest = 0;
		for(int i = 0; i < arr.length; i ++) {
			if(greatest < arr[i]) {
				greatest = arr[i];
			}
		}
		return greatest;
	}
	public static void main(String[] args) {
		System.out.print(new Solution().findGreatest(new int[]{10,2,4,1,2,8,7,6,3,7,9,4}));
	}
}
