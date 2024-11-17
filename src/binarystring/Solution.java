package binarystring;

public class Solution {
    public int solution(String S) {
        int n = S.length();
        int value = 0;
        int operations = 0;

        // Convert binary string to decimal value
        for (int i = 0; i < n; i++) {
            value = value * 2 + (S.charAt(i) - '0');
        }

        // Perform operations until value becomes 0
        while (value > 0) {
            if (value % 2 == 0) {
                value /= 2; // Divide by 2 if even
            } else {
                value--; // Subtract 1 if odd
            }
            operations++;
        }

        return operations;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("011100")); // Should print 7
        System.out.println(solution.solution("111")); // Should print 5
        System.out.println(solution.solution("1111010101111")); // Should print 22
        // Example with 400,000 '1's
        String largeInput = "1".repeat(400_000);
        System.out.println(solution.solution(largeInput)); // Should print 799,999
    }
}
