
class Solution {
    int solution(int M, int[] A) {
        int N = A.length;
        int[] count = new int[M + 1];
        for (int i = 0; i <= M; i++)
            count[i] = 0;
        int maxOccurence = 1;
        int index = -1;
        for (int i = 0; i < N; i++) {
        	System.err.println(count[A[i]]);
            if (count[A[i]] > 0 && i <=M) {
                int tmp = count[A[i]];
                if (tmp > maxOccurence) {
                    maxOccurence = tmp;
                    index = i;
                }
                count[A[i]] = tmp + 1;
            } else {
                count[A[i]] = 1;
            }
        }
        return A[index];
    }
    public static void main(String[] args) {
    	int M = 1;
    	int[] A = new int[] {1,2,3,3,1,3,1};
		System.out.println(new Solution().solution(M, A));
	}
}
