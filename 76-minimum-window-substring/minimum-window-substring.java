class Solution {
    public String minWindow(String s, String t) {
        
        HashMap<Character,Integer>map=new HashMap<>();
        for(int l=0;l<t.length();l++)
        {
            map.put(t.charAt(l),map.getOrDefault(t.charAt(l),0)+1);
        }

        int r=0,l=0,count=0,startInd=-1,min=Integer.MAX_VALUE;
        while(r<s.length())
        {
            if(map.containsKey(s.charAt(r)) && map.get(s.charAt(r))>0)
            {
                count++;
                map.put(s.charAt(r),map.get(s.charAt(r))-1);
            }
            else
            {
                map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)-1);
            }
            while(count==t.length())
            {
                if(r-l+1<min)
                {
                    min=r-l+1;
                    startInd=l;
                }
                map.put(s.charAt(l),map.get(s.charAt(l))+1);
                if(map.get(s.charAt(l))>0)
                    count--;
                l++;
            }
            r++;
        }
        return (startInd == -1) ? "" : s.substring(startInd, startInd + min);
    }
}