import java.util.*;

class BankTrans {
    public int solution(int[] A, String[] D) {
        int balance = 0;
        Map<String, List<Integer>> monthlyCardPayments = new HashMap<>();

        for (int i = 0; i < A.length; i++) {
            int amount = A[i];
            String date = D[i];
            String month = date.substring(0, 7);

            // Update balance
            balance += amount;

            // Track card payments per month
            if (amount < 0) {
                monthlyCardPayments.putIfAbsent(month, new ArrayList<>());
                monthlyCardPayments.get(month).add(amount);
            }
        }

        // Calculate monthly fees
        for (int month = 1; month <= 12; month++) {
            String monthStr = String.format("2020-%02d", month);
            List<Integer> payments = monthlyCardPayments.getOrDefault(monthStr, new ArrayList<>());

            if (payments.size() < 3 || payments.stream().mapToInt(Integer::intValue).sum() > -100) {
                balance -= 5;
            }
        }

        return balance;
    }

    public static void main(String[] args) {
        BankTrans sol = new BankTrans();
        int[] A1 = {100, 100, 100, -10};
        String[] D1 = {"2020-12-31", "2020-12-22", "2020-12-03", "2020-12-29"};
        System.out.println(sol.solution(A1, D1)); // 230

        int[] A2 = {180, -50, -25, -25};
        String[] D2 = {"2020-01-01", "2020-01-01", "2020-01-01", "2020-01-31"};
        System.out.println(sol.solution(A2, D2)); // 25

        int[] A3 = {1, -1, 0, -105, 1};
        String[] D3 = {"2020-12-31", "2020-04-04", "2020-04-04", "2020-04-14", "2020-07-12"};
        System.out.println(sol.solution(A3, D3)); // -164

        int[] A4 = {100, 100, -10, -20, -30};
        String[] D4 = {"2020-01-01", "2020-02-01", "2020-02-11", "2020-02-05", "2020-02-08"};
        System.out.println(sol.solution(A4, D4)); // 80

        int[] A5 = {-60, 60, -40, -20};
        String[] D5 = {"2020-10-01", "2020-02-02", "2020-10-10", "2020-10-30"};
        System.out.println(sol.solution(A5, D5)); // -115
    }
}
