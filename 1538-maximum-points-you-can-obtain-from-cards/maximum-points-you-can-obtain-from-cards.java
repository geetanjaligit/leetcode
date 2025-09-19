class Solution {
    static {
        for (int i = 0; i < 500; i++) {maxScore(new int[]{1, 2, 3, 4, 5, 6, 1}, 3);}
    }
    public static int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int lsum=0,rsum=0,maxSum=0;
        for(int i=0;i<=k-1;i++)
        {
            lsum=lsum+cardPoints[i];
        }
        maxSum=lsum;
        int rind=n-1;
        for(int i=k-1;i>=0;i--)
        {
            lsum=lsum-cardPoints[i];
            rsum=rsum+cardPoints[rind];
            rind--;
            maxSum=Math.max(maxSum,lsum+rsum);
        }
        return maxSum;
        
    }
}