class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
          return false;
        String str1=Integer.toString(x);
        String str2=new StringBuilder(str1).reverse().toString();
        return str1.equals(str2);
        
    }
}