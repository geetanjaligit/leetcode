class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0; // Handle the empty array case
        }
        int max_length=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++)
        {
            if(!set.contains(nums[i]-1))
            {
                int current=nums[i];
                int count=1;
                while(set.contains(current+1))
                {
                    current++;
                    count++;
                }
                //update max_length
                max_length=Math.max(max_length,count);   
            }
        }
        return max_length;
    }
}