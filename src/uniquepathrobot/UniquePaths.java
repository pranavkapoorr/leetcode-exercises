package uniquepathrobot;

public class UniquePaths{
/* 
A robot is located at the top-left corner of a m x n grid .

The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid .

How many possible unique paths are there?


*/



    private int calculatePaths(int m,int n){
        if(m != 0 && n != 0){
            int[][] totalPaths = new int[m][n];
        
            for(int i = 0; i < m; i++){ //for left border
                totalPaths[i][0] = 1;
            }

            for(int j = 0; j < n; j++){ //for top border
                totalPaths[0][j] = 1;
            }

            for(int i = 1; i < m; i++){ //number of unique paths to other squares on the left border would be the sum of the number of unique paths to its previous left square and top square.
                for(int j = 1; j < n; j++){
                    totalPaths[i][j] = totalPaths[i - 1][j] + totalPaths[i][j - 1];
                }
            }

            return totalPaths[m - 1][n - 1];
        }else{
            return 0;
        }
        
    }

    public static void main(String[] args) {
        System.out.println(new UniquePaths().calculatePaths(3,7));
    }
}