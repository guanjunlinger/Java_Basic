package com.algorithm.dp;


public class Floyd {

    /**
     * dp[k][i][j]:只允许选择1-k顶点作为中间节点时,i-j的最小距离
     * dp[k][i][j]=max(dp[k-1][i][j],dp[k-1][i][k]+dp[k-1][k][j])
     * 优化:滚动数组
     */
    public int[][] dp(int[][] nums) {
        int n = nums.length;
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = nums[i][j];
            }
        }
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int local = result[i][k] + result[k][j];
                    if (result[i][j] > local) {
                        result[i][j] = local;
                    }
                }
            }
        }
        return result;
    }
}
