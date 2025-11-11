class Solution {
    public int missingNumber(int[] nums) {
        int hashm[]= new int[nums.length+1];
        int mis=0;
        for(int i=0;i<nums.length;i++)
        {
            hashm[nums[i]]=1;
        }
        for(int j=0;j<hashm.length;j++)
        {
            if(hashm[j]!=1)
            {
                mis=j;
            }
        }
         return mis;
    }
}