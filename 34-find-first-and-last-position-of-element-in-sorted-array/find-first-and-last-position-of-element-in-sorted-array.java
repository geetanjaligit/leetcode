class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{firstPos(nums,target),lastPos(nums,target)};
    }
    public int lastPos(int[]nums,int target)
    {
        int ans=-1,l=0,u=nums.length-1;
        while(l<=u)
        {
            int mid=l+(u-l)/2;
            if(nums[mid]==target)
            {
               ans=mid;
               l=mid+1;
            }
            else if(nums[mid]<target)
               l=mid+1;
            else 
               u=mid-1;
        }
        return ans;
    }
    public int firstPos(int []nums,int target)
    {
        int ans=-1,l=0,u=nums.length-1;
        while(l<=u)
        {
            int mid=l+(u-l)/2;
            if(nums[mid]==target)
            {
                ans=mid;
                u=mid-1;
            }
            else if(nums[mid]<target)
                l=mid+1;
            else 
                u=mid-1;
        }
        return ans;
    }
}