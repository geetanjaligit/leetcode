class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        reverse(nums,0,n);
        reverse(nums,0,k);
        reverse(nums,k,n);
    }
    public void reverse(int []nums,int start,int end)
    {
        int i=start,j=end-1;
        int temp=-1;
        while(i<j)
        {
            temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;j--;
        }
    }

}