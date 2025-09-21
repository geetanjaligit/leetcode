// class Solution {
    //brute force
    // public int totalFruit(int[] fruits) {
    //     int max_length=0;
    //     int n=fruits.length;
    //     for(int i=0;i<n;i++)
    //     {
    //         HashSet<Integer> set=new HashSet<>();
    //         for(int j=i;j<n;j++)
    //         {
    //             set.add(fruits[j]);
    //             if(set.size()<=2)
    //             {
    //                 max_length=Math.max(max_length,j-i+1);
    //             }
    //             else
    //             {
    //                 break;
    //             }
    //         }
    //     }
    //     return max_length;
    // }

    //Optimized - O(n)
    // 
    
    class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> count = new HashMap<>();
        int left = 0, maxLen = 0;
          for (int right = 0; right < fruits.length; right++) {
            count.put(fruits[right], count.getOrDefault(fruits[right], 0) + 1);

            while (count.size() > 2) {
                count.put(fruits[left], count.get(fruits[left]) - 1);
                if (count.get(fruits[left]) == 0) {
                    count.remove(fruits[left]);
                }
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}
// }