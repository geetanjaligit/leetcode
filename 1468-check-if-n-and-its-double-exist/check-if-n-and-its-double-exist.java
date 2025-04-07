import java.util.*;
class Solution {
    public boolean checkIfExist(int[] arr) {
        Scanner sc=new Scanner(System.in);
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i!=j){
                if(arr[i]==2*arr[j])
                   return true;
                }
                
                
            }
        }
        return false;
    }
}