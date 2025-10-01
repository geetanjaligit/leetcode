class Solution {
    public int subarraySum(int[] nums, int k) {
        
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        
        int preSum=0,count=0;
        for(int i=0;i<nums.length;i++)
        {
            preSum=preSum+nums[i];
            int x=preSum-k;
            if(map.containsKey(x))
            {
                count=count+map.get(x);
            }
            map.put(preSum,map.getOrDefault(preSum,0)+1);
        }
        return count;
    }
}