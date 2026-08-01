class Solution {
    int solve(int n , int x, int [][]dp){
        if(n == 1) return x;
        if(dp[n][x] != -1) return dp[n][x];
        int sum =0 ;
        for(int i=0;i<x;i++){
            sum += solve(n-1 , x - i , dp);
        }
        dp[n][x] = sum;
        return dp[n][x];
    }
    public int countVowelStrings(int n) {
        int[][]dp = new int[n+1][6];
        for(int num[] : dp) {
            Arrays.fill(num , -1);
        }
        return solve(n , 5 , dp);
    }
}