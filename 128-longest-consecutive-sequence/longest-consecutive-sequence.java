class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0; // Handle the empty array case
        }
        int count=1,max_length=0,start,current;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++)
        {
            if(!(set.contains(nums[i]-1)))
            {
                start=nums[i];
                count=1;
                current=start;
                for(int j=0;j<nums.length;j++)
                {
                    if(set.contains(current+1))
                    {
                        count++;
                        current=current+1;
                    }
                    else
                      break;
                }
                if(count>max_length)
                   max_length=count;
                   continue;
            }
        }
        return max_length;
    }
}