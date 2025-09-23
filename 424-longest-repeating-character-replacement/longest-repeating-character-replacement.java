class Solution {
    static {
        for (int i = 0; i < 500; i++) {
            characterReplacement("", 1);  
        }
    }
    public static int characterReplacement(String s, int k) {
        int l=0,r=0,maxlen=0,maxf=0;
        int n=s.length();
        HashMap<Character,Integer>map=new HashMap<>();
        while(r<n)
        {
            map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);
            maxf=Math.max(maxf,map.get(s.charAt(r)));
            int changes=r-l+1-maxf;
            if(changes>k)
            {
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
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