package com;
import java.util.Scanner;

public class Solution {


    public int minDifficulty(int[] jobDifficulty, int d) {
        if(jobDifficulty.length < d) {
            return -1;
        }
        int n = jobDifficulty.length;
        int[][] dp = new int[d][n];
        int max = 0;
        for(int i=0; i<n; i++) {
            max = Math.max(max, jobDifficulty[i]);
            dp[0][i] = max;
        }
        for(int i=1; i<d; i++) {
            for(int j=i; j<n; j++) {
                max = 0;
                int minSum = Integer.MAX_VALUE;
                for(int k=j; k>=i; k--) {
                    max = Math.max(max, jobDifficulty[k]);
                    minSum = Math.min(minSum, dp[i-1][k-1]+max);
                }
                dp[i][j] = minSum;
            }
        }
        return dp[d-1][n-1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[] data = new int[n];
        for (int i = 0; i < n; i++)
            data[i] = scanner.nextInt();
        Solution solution = new Solution();
        System.out.println(solution.minDifficulty(data, m));

    }

}
