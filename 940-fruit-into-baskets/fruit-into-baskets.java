class Solution {
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
    public int totalFruit(int[] fruits) {
        int l=0,r=0,max_len=0;
        int n=fruits.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        while(r<n)
        {
            map.put(fruits[r],map.getOrDefault(fruits[r],0)+1);
            if(map.size()>2)
            {
                map.put(fruits[l], map.get(fruits[l]) - 1);
                if(map.get(fruits[l])==0)
                  map.remove(fruits[l]);
                l++;
            }
            if(map.size()<=2)
            {
                max_len=Math.max(max_len,r-l+1);
            }
            r++;
        }
        return max_len;
    }
}