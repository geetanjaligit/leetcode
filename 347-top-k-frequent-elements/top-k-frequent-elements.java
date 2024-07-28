class Solution {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> count=new HashMap<>();
        for(int i=0;i<nums.length;i++)//O(n)
        {
            count.put(nums[i],count.getOrDefault(nums[i], 0)+1);
        }
        List<Integer> freq[]=new List[nums.length+1];
        for(int i=0;i<freq.length;i++)//O(n+1)
        {
            freq[i]=new ArrayList<>();
        }
       for(int key:count.keySet())
       { 
            int freqCount=count.get(key);
            freq[freqCount].add(key);
       }
        int index=0;
        int result[]=new int[k];
        for(int i=freq.length-1;i>=0 && index<k;i--)//o(n)
        {
            for(int n:freq[i])
            {
                result[index++]=n;
                if(index==k)
                  return result;
            }   
        }
        return result;   
}
}
