class Solution {
    public boolean isAnagram(String s, String t) {
         if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            // sMap.put(c, sMap.getOrDefault(c, 0) + 1);
            if(sMap.containsKey(c))
            {
                sMap.put(c,sMap.get(c)+1);
            }
            else
                sMap.put(c,1);
        }

        for (char c : t.toCharArray()) {
            tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        }

        return sMap.equals(tMap);      
    }
}