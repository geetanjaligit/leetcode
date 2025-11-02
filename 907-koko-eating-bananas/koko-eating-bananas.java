class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int st=1,end=0;
        for(int p:piles)
            end=Math.max(end,p);
        
        int ans=end;
        while(st<=end)
        {
            int mid=st+(end-st)/2;
            if(isPossible(piles,h,mid))
            {
                ans=mid;
                end=mid-1;
            }
            else
                st=mid+1;
        }
        return ans;
    }
    public boolean isPossible(int []piles,int h, int k)
    {
        long totalHours=0;
        for(int bananas:piles)
        {
            totalHours=(long)(totalHours+Math.ceil((double)bananas/k));
            if(totalHours>h)
               return false;
        }
        return totalHours<=h;
    }
}