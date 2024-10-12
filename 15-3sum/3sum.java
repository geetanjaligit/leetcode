class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);  // Step 1: Sort the array
        List<List<Integer>> list = new ArrayList<>();
        int left, right;

        for (int i = 0; i < nums.length - 2; i++) {  // Traverse till the third last element
            // Skip duplicate elements to avoid duplicate triplets
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            left = i + 1;
            right = nums.length - 1;
            int diff = 0 - nums[i];

            while (left < right) {
                int sum = nums[left] + nums[right];
                
                if (sum == diff) {
                    list.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    // Move left and right pointers to avoid duplicates
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    
                    left++;
                    right--;
                } 
                else if (sum < diff) {
                    left++;  // Increase the left pointer to get a larger sum
                } 
                else {
                    right--;  // Decrease the right pointer to get a smaller sum
                }
            }
        }
        
        return list;
    }
}
