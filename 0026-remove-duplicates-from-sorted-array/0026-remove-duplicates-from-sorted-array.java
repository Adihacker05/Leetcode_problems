class Solution {
    public int removeDuplicates(int[] nums) {
        int index=0;
        int len=nums.length;
        for(int j=1;j<len;j++)
        {
            if(nums[index]!=nums[j])
            {
                index++;
                nums[index]=nums[j];
            }
        }
        return index+1;
    }
}