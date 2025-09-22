class Solution {
     static {
        Solution s = new Solution() ;
        for ( int i = 0 ; i < 1000 ; i++){
            s.numberOfSubstrings("") ;
        }
    }
    public int numberOfSubstrings(String s) {

        //brute force
        // int count=0,n=s.length();
        // int []hash=new int[3];
        // for(int i=0;i<n;i++)
        // {
        //     Arrays.fill(hash,0);
        //     for(int j=i;j<n;j++)
        //     {
        //         hash[s.charAt(j)-'a']=1;
        //         if(hash[0]+hash[1]+hash[2]==3)
        //         {
        //             count++;
        //         }
        //     }
        // }
        // return count;

        //optimized one- O(n)
        int count=0,n=s.length();
        int[]lastSeen={-1,-1,-1};
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            lastSeen[ch-'a']=i;
            if(lastSeen[0]!=-1 && lastSeen[1]!=-1 && lastSeen[2]!=-1)
            {
                count=count+(1+Math.min(lastSeen[0],Math.min(lastSeen[1],lastSeen[2])));
            }
        }
        return count;
    }
}