class Solution {
    public void moveZeroes(int[] nums) {
        int i=-1,j=-1,temp=-1;
        for(int k=0;k<nums.length;k++)
        {
            if(nums[k]==0)
            {
                j=k;i=j+1;
                break;
            }
        }
        if(j==-1)
          return;
        else
        {
            while(i<nums.length){
                if(nums[i]!=0)
                {
                    temp=nums[j];
                    nums[j]=nums[i];
                    nums[i]=temp;
                    j++;i++;
                }
                else
                   i++;
            }
        }
    }
}