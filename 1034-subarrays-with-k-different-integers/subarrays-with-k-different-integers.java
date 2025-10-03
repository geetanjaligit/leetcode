class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        //brute force
        // int count=0;
        // for(int i=0;i<nums.length;i++)
        // {
        //     HashMap<Integer,Integer>map=new HashMap<>();
        //     for(int j=i;j<nums.length;j++)
        //     {
        //         map.put(nums[j],map.getOrDefault(nums[j],0)+1);
        //         if(map.size()==k)
        //            count=count+1;
        //         else if(map.size()>k)
        //            break;
        //     }
        // }
        // return count;

        int count1=subarraysWithLessThanKDistinct(nums,k);
        int count2=subarraysWithLessThanKMinusOneDistinct(nums,k-1);
        return count1-count2;
    }
    public int subarraysWithLessThanKDistinct(int[] nums, int k)
    {
        HashMap<Integer,Integer>map=new HashMap<>();
        int l=0,r=0,count=0;
        while(r<nums.length)
        {
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            while(map.size()>k)
            {
                map.put(nums[l],map.get(nums[l])-1);
                if(map.get(nums[l])==0)
                {
                    map.remove(nums[l]);
                }
                l++;
            }
            count=count+(r-l+1);
            r++;
        }
        return count;
    }

    public int subarraysWithLessThanKMinusOneDistinct(int[] nums, int k)
    {
        HashMap<Integer,Integer>map=new HashMap<>();
        int l=0,r=0,count=0;
        while(r<nums.length)
        {
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            while(map.size()>k)
            {
                map.put(nums[l],map.get(nums[l])-1);
                if(map.get(nums[l])==0)
                {
                    map.remove(nums[l]);
                }
                l++;
            }
            count=count+(r-l+1);
            r++;
        }
        return count;
    }
}