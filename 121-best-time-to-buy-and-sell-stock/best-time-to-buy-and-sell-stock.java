class Solution {
    public int maxProfit(int[] prices) {
       int b=prices[0];
        int p=0;
        for (int i=1;i<prices.length;i++) {
            if (b>prices[i]) {
                b=prices[i];
            }
            p=Math.max(p,prices[i]-b);
        }
        return p;  
    }
}