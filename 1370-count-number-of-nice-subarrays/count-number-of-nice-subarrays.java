class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int count1=subarraysLessThanEqualsK(nums,k);
        int count2=subarraysLessThanEqualsKMinusOne(nums,k-1);
        return count1-count2;
    }
    public int subarraysLessThanEqualsK(int[] nums, int k) {
        int l=0,r=0,count1=0,sum=0;
        while(r<nums.length)
        {
            sum=sum+nums[r]%2;
            while(sum>k)
            {
                sum=sum-nums[l]%2;
                l++;
            }
            count1=count1+(r-l+1);
            r++;
        }
        return count1;
    }
    public int subarraysLessThanEqualsKMinusOne(int[] nums, int k) {
        if(k<0)
           return 0;
        int l=0,r=0,count2=0,sum=0;
        while(r<nums.length)
        {
            sum=sum+nums[r]%2;
            while(sum>k)
            {
                sum=sum-nums[l]%2;
                l++;
            }
            count2=count2+(r-l+1);
            r++;
        }
        return count2;
    }
}