class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        //Bruteforce technique
        // for(int i=0;i<nums.length-1;i++)
        // {
        //     for(int j=i+1;j<nums.length;j++)
        //     {
        //         if(nums[i]+nums[j]==target)
        //         {
        //             return new int[]{i,j};
        //         }
        //     }
        // }
        // return null;
        
//using HashMap
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++)
        {
            int complement=target-nums[i];
            if(map.containsKey(target-nums[i])&&map.get(complement)!=i)
               return new int[]{i,map.get(complement)};
        }
        return null;
    }
}