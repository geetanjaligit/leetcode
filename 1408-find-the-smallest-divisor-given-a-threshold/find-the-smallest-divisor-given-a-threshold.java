class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int st=1,end=0;
        for(int i:nums)
           end=Math.max(i,end);
        int ans=st;

        while(st<=end)
        {
            int mid=st+(end-st)/2;
            if(isPossible(nums,mid,threshold))
            {
                end=mid-1;
                ans=mid;
            }
            else
                st=mid+1;
        }
        return ans;
    }
    public boolean isPossible(int []arr,int mid,int limit)
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+ (arr[i]+mid-1)/mid;
        }
        return sum<=limit;
    }
}