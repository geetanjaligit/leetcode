class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        if(s1.length()>s2.length())
           return false;
        
        HashMap<Character,Integer> s1Count=new HashMap<>();
        HashMap<Character,Integer> s2Count=new HashMap<>();

        //initializing the window
        for(int i=0;i<s1.length();i++)
        {
            s1Count.put(s1.charAt(i),s1Count.getOrDefault(s1.charAt(i),0)+1);
            s2Count.put(s2.charAt(i),s2Count.getOrDefault(s2.charAt(i),0)+1);
        }

        if(s1Count.equals(s2Count))
          return true;
        
        int left=0;
        for(int i=s1.length();i<s2.length();i++)
        {
            char right=s2.charAt(i);
            s2Count.put(right,s2Count.getOrDefault(right,0)+1);

            char leftChar=s2.charAt(left);
            s2Count.put(leftChar,s2Count.get(leftChar)-1);

            if(s2Count.get(leftChar)==0)
               s2Count.remove(leftChar);
            
            left++;

            if(s1Count.equals(s2Count))
               return true;
        }
        return false;
    }
}