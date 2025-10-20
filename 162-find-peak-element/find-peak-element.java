class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        int l=0,u=n-1;
        while(l<=u)
        {
            int mid=l+(u-l)/2;
            if((mid==0||nums[mid]>nums[mid-1]) && (mid==n-1||nums[mid]>nums[mid+1]))
            {
                return mid;
            }
            else if(nums[mid]<nums[mid+1])
            {
                l=mid+1;
            }
            else
            {
                u=mid-1;
            }
        }
        return -1;
    }
}