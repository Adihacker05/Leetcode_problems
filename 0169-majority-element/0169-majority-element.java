class Solution {
    public int majorityElement(int[] nums) {
        int c=0,el=0;
        for(int i=0;i<nums.length;i++)
        {
            if(c==0)
            {
                c=1;
                el=nums[i];
            }
            else if(el==nums[i])
            {
                c++;
            }
            else
            {
                c--;
            }
        }
        return el;
    }
}