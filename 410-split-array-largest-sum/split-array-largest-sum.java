class Solution {
    public int splitArray(int[] nums, int k) {
        if(nums.length<k)
          return -1;
        int max=Integer.MIN_VALUE,sum=0;
        for(int i=0;i<nums.length;i++)
        {
            max=Math.max(nums[i],max);
            sum=sum+nums[i];
        }
        int st=max,end=sum,ans=-1;
        while(st<=end)
        {
            int mid=st+(end-st)/2;
            if(isPossible(nums,mid,k))
            {
                ans=mid;
                end=mid-1;
            }
            else
                st=mid+1;
        }
        return ans;
    }
    public boolean isPossible(int []nums,int mid,int k)
    {
        int count=0,kCount=1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>mid)
               return false;
            count=count+nums[i];
            if(count>mid)
            {
                kCount++;
                count=nums[i];
            }
        }
        return kCount<=k;
    }
}