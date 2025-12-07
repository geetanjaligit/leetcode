class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        int []temp=new int[k];
        for(int i=n-k,j=0;i<n;i++,j++)
        {
            temp[j]=nums[i];
        }
        int j=n-1;
        for(int i=n-k-1;i>=0;i--,j--)
        {
            nums[j]=nums[i];
        }
        for(int i=j;i>=0;i--)
        {
            nums[i]=temp[i];
        }
    }
}