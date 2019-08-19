package finddayafterdays;

public class Solution {
	
	public String solution(String S, int K) {
		String[] days = {"Mon","Tues","Wed","Thu","Fri","Sat","Sun"};
        if(K < 0 || K > 500) {
        	return S;
        }
		String temp = "";
        int day = K%7;
        int sIndex = 0;
        for(int i = 0; i < days.length-1; i++) {
        	if(days[i].equals(S)) {
        		sIndex = i;
        		break;
        	}
        }
        int timeShift = days.length - sIndex;
        days = shiftTimes(days, timeShift);
        temp = days[day];
        return temp;
    }
	private String[] shiftTimes(String[] A, int times) {
		if(A.length < 1) {
			return A;
		}
		for(int i = 1; i <= times; i++) {
			A = shift(A);
		}
		
		return A;
	}
	private String[] shift(String[] Arr) {
		String[] temp = new String[Arr.length];
		temp[0] = Arr[Arr.length-1];
		for(int i = 0; i < Arr.length-1; i++) {
			temp[i+1] = Arr[i];
		}
		return temp;
	}
	public static void main(String[] args) {
		
		System.out.println(new Solution().solution("Sat",23));
	}
}
