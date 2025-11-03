class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        int n=nums.length;
        int temp=0;
        for(int j=0;j<n;j++)
        {
            if(nums[j]==0)
            {
                i=j;
                break;
            }
        }
        for(int k=i+1;k<n;k++)
        {
            if(nums[k]!=0 && nums[i]==0)
            {
                temp=nums[k];
                nums[k]=nums[i];
                nums[i]=temp;
                i++;
            }
        }
    }
}