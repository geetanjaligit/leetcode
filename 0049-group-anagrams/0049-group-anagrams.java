class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,List<String>> map=new HashMap<>();
        for(String str:strs)
        {
            char[]c=str.toCharArray();
            Arrays.sort(c);
            String sortedstr=new String(c);
            if(map.containsKey(sortedstr))
              map.get(sortedstr).add(str);
            else{
            ArrayList<String> list = new ArrayList<>();
            list.add(str);
            map.put(sortedstr,list);
            }
        }     
        return new ArrayList<>(map.values());
    }
}