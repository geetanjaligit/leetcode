class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums.length==0)
            return 0;
        int l=0,u=nums.length-1,ans=nums.length;
        while(l<=u)
        {
            int mid=l+(u-l)/2;
            if(nums[mid]>=target)
            {
                ans=mid;
                u=mid-1;
            }
            else
                l=mid+1;
        }
        return ans;
    }
}