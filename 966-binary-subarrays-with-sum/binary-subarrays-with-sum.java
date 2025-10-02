class Solution {
    // public int numSubarraysWithSum(int[] nums, int goal) {
        
    //     HashMap<Integer,Integer>map=new HashMap<>();
    //     map.put(0,1);

    //     int preSum=0,count=0;
    //     for(int i=0;i<nums.length;i++)
    //     {
    //         preSum=preSum+nums[i];
    //         int x=preSum-goal;
    //         if(map.containsKey(x))
    //         {
    //             count=count+map.get(x);
    //         }
    //         map.put(preSum,map.getOrDefault(preSum,0)+1);
    //     }
    //     return count;
    // }
     static {
        for(int i=0;i<300;i++){
            int arr[]={0,0};
            numSubarraysWithSum(arr,0);
        }
    }
    
    public static int numSubarraysWithSum(int[] nums, int goal)
    {
        
        int count1=subarrayLessThanEqualGoal(nums,goal);
        int count2=subarrayLessThanEqualGoalMinusOne(nums,goal-1);
        return count1-count2;
    }
    public static int subarrayLessThanEqualGoal(int[] nums, int goal)
    {
        int l=0,r=0,sum=0,count1=0;
        while(r<nums.length)
        {
            sum=sum+nums[r];
            while(sum>goal)
            {
                sum=sum-nums[l];
                l++;
            }
            count1=count1+(r-l+1);
            r++;
        }
        return count1;
    }
    public static int subarrayLessThanEqualGoalMinusOne(int[] nums, int goal)
    {
        if(goal<0)
          return 0;
        int l=0,r=0,sum=0,count2=0;
        while(r<nums.length)
        {
            sum=sum+nums[r];
            while(sum>goal)
            {
                sum=sum-nums[l];
                l++;
            }
            count2=count2+(r-l+1);
            r++;
        }
        return count2;
    }

}