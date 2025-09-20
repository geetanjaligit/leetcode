class Solution {
    //brute force
    // public int longestOnes(int[] nums, int k) {
    //     int max_len=0,len=0;
    //     int n=nums.length;
    //     for(int i=0;i<n;i++)
    //     {
    //         int count=0;
    //         for(int j=i;j<n;j++)
    //         {
    //             if(nums[j]==0)
    //               count++;
    //             if(count>k)
    //               break;
    //             len=j-i+1;
    //             max_len=Math.max(len,max_len);
    //         }
    //     }
    //     return max_len;
    // }

    //optimized (O(2n))
    public int longestOnes(int[] nums, int k)
    {
        int l=0,r=0,len=0,max_len=0,count=0;
        int n=nums.length;
        while(r<n)
        {
            if(nums[r]==0)
               count++;
            while(count>k)
            {
                if(nums[l]==0)
                  count--;
                l++;
            }
            len=r-l+1;
            max_len=Math.max(len,max_len);
            r++;
        }
        return max_len;
    }
}