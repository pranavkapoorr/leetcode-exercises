package hcf;

public class Solution {
	public int generalizedGCD(int num, int[] arr){
		int temp = 1;
       for(int i = 0; i < arr.length; i ++) {
    	   int j = 0;
    	   int count = 0;
    	   while(j<arr.length) {
    		   if(arr[j]%arr[i]==0) {
    			   count ++;
    		   }else {
    			   
    		   }
    			   j++;
    	   }
    	   if(count==arr.length) {
    		   temp = arr[i];
    		   break;
    	   }
       }
       return temp;
    }
	public static void main(String[] args) {
		int[] arr = {2,4,6,8,10,20,28,50};
		System.out.println(new Solution().generalizedGCD(5, arr));
	}
}
