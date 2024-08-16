class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n=nums.length;
        int[]output= new int[n];
        output[0]=1;

        for(int i=1;i<n;i++)
           output[i]=nums[i-1]*output[i-1];
        
        int rightprod=1;
        for(int i=n-1;i>=0;i--){

            output[i]=output[i]*rightprod;
            rightprod=rightprod*nums[i];
        }
        
        return output;
    }
}