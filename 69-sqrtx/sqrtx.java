class Solution {
    public int mySqrt(int x) {
       double num= Math.sqrt(x);
       double n= (Math.floor(num));
       return (int)n;
    }
}