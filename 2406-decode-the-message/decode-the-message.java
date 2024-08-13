class Solution {
    public String decodeMessage(String key, String message) {
        
        HashMap<Character,Character> map= new HashMap<>();
        char[] alphabet=new char[26];
	    int i=0;
	    for(char ch='a';ch<='z';ch++)
	    {
	        alphabet[i++]=ch;
	    }
        i=0;
        for(int j=0;j<key.length();j++)
        {
            if(key.charAt(j)!=' '){
               if(!map.containsKey(key.charAt(j))){
                  map.put(key.charAt(j),alphabet[i++]);
                }
            }
        }
        StringBuilder st= new StringBuilder();
        for(int j=0;j<message.length();j++)
        {
            char c=message.charAt(j);
            if(c!=' ')
            {
                st.append(map.get(c));
            }
            else
            {
                st.append(c);
            }
        }
        return(st.toString());
    }
}
 