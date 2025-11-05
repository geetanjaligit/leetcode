class Solution {
    public int shipWithinDays(int[] weights, int days) {
        
        int st=0;
        for(int wt:weights)
            st=Math.max(st,wt);
        int end=0;
        for(int wt:weights)
            end=end+wt;
        int ans=st;
        while(st<=end)
        {
            int mid=st+(end-st)/2;
            if(isPossible(weights,mid,days))
            {
                ans=mid;
                end=mid-1;
            }
            else
                st=mid+1;
        }
        return ans;
    }
    public boolean isPossible(int []wt,int mid,int days)
    {
        int sum=0,dayCount=0;
        for(int i=0;i<wt.length;i++)
        {
            sum=sum+wt[i];
            if(sum>mid)
            {
                dayCount++;
                sum=0;
                i--;
            }
            else if(dayCount>=days)
            {
                dayCount++;
            }
        }
        return dayCount<=days;
    }
}