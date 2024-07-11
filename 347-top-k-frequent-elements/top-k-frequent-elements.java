class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
         HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],(map.getOrDefault(nums[i],0)+1));
        }
        int arr[]=new int[k];
        int i=0;
        List<Integer> list=new ArrayList<>(map.keySet());
        while (i!=k)
        {
            int max=-1;
            int mostfreq=-1;
            for(int maxKey:list)
            {
                if(map.get(maxKey)>=max)
                {
                    max=map.get(maxKey);
                    mostfreq=maxKey;
                }
                
            }
            arr[i]=mostfreq;
            list.remove(Integer.valueOf(mostfreq));    
            i++;       

        }
        return arr;
    }
}