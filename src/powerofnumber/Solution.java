package powerofnumber;

public class Solution {
	public long power(long num, long pow) {
		long result = num;
		if(pow != 0) {
			while(pow > 1) {
				result = result * num;
				pow --;
			}
		}else {
			result = 0;
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(new Solution().power(12,2));
	}

}
