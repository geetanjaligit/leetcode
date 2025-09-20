class Solution {
    public int longestOnes(int[] nums, int k) {
        int max_len=0,len=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            int count=0;
            for(int j=i;j<n;j++)
            {
                if(nums[j]==0)
                  count++;
                if(count>k)
                  break;
                len=j-i+1;
                max_len=Math.max(len,max_len);
            }
        }
        return max_len;
    }
}