class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);
        HashSet<List<Integer>> set=new HashSet<>();
        int left,right;
        for(int i=0;i<nums.length;i++)
        {
            if(i>0 && nums[i]==nums[i-1])
              continue;
            left=i+1;
            right=nums.length-1;
            int diff=0-nums[i];
            while(left<right){
              if(nums[left]+nums[right]==diff)
              {
                set.add(Arrays.asList(nums[i], nums[left], nums[right]));
                left++;right--;
              }
              else if(nums[left]+nums[right]<diff)
                left++;
              else if(nums[left]+nums[right]>diff)
                right--;
            }
            
        }
        return new ArrayList<>(set);
    }
}
