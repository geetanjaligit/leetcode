class Solution {
    static {
        for (int i = 0; i < 1000; i++) {
            characterReplacement("", 1);  
        }
    }
    public static int characterReplacement(String s, int k) {
        int l=0,r=0,maxlen=0,maxf=0;
        int n=s.length();     
        int []hash=new int[26];
        Arrays.fill(hash,0);
        while(r<n)
        {
            
            hash[s.charAt(r)-'A']++;
            maxf=Math.max(maxf,hash[s.charAt(r)-'A']);
            int changes=(r-l+1)-maxf;
            if(changes>k)
            {
                hash[s.charAt(l)-'A']--;
                l++;
            }
            if(changes<=k)
            {
                maxlen=Math.max(maxlen,r-l+1);
            }
            r++;
        }
        return maxlen;
    }
}