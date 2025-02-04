class Solution {
    public List<Integer> grayCode(int n) {
        
        // List<Integer> result = new ArrayList<>();
        // int totalNumbers = 1 << n;
        // for (int i = 0; i < totalNumbers; i++) {
        //      result.add(i ^ (i >> 1));
        // }
        // return result;

// brute force
        List<Integer>solution= new ArrayList<>();
        solution.add(0);
        solution.add(1);
        int curr=1;
        for(int i=2;i<=n;i++)
        {
            curr=curr*2;
            for(int j=solution.size()-1;j>=0;j--)
            {
                solution.add(curr+solution.get(j));
            }
        }
        return solution;

    }
}