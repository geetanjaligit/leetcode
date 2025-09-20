class Solution {
    public int lengthOfLongestSubstring(String s) {
        int []hash=new int[256];
        Arrays.fill(hash,-1);
        int l=0,r=0,max_len=0,len=0;
        int n=s.length();
        while(r<n)
        {
            if(hash[s.charAt(r)]!=-1)
            {
                if(hash[s.charAt(r)]>=l)
                {
                    l=hash[s.charAt(r)]+1;
                }
            }
            len=r-l+1;
            max_len=Math.max(len,max_len);
            hash[s.charAt(r)]=r;
            r++;
        }
        return max_len;
    }

}