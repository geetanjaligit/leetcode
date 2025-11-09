class Solution {
    public int removeDuplicates(int[] nums) {
        // HashSet<Integer>set=new HashSet<>();
        // int index=0;
        // for(int i=0;i<nums.length;i++)
        // {
        //     if(!set.contains(nums[i]))
        //     {
        //         set.add(nums[i]);
        //         nums[index]=nums[i];
        //         index++;
        //     }
        // }
        // return index;

        int i=0;
        for(int j=1;j<nums.length;j++)
        {
            if(nums[j]!=nums[i])
            {
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
        
    }
    
}