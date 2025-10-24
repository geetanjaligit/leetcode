class Solution {
    public int search(int[] nums, int target) {
        int l=0,u=nums.length-1;
        while(l<=u)
        {
            int mid=l+(u-l)/2;
            if(target==nums[mid])
            {
                return mid;
            }
            else if(target>nums[mid])
               l=mid+1;
            else
               u=mid-1;
        }
        return -1;
    }
}