class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();

        for (String str : strs) {
            
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            
            String sortedStr = new String(charArray);

            if (!anagrams.containsKey(sortedStr)) {
                anagrams.put(sortedStr, new ArrayList<>());
            }
            anagrams.get(sortedStr).add(str);
        }

        return new ArrayList<>(anagrams.values());
    }
}