class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0,start=0,maxi=Integer.MIN_VALUE;
        int astart=0,aend=0;
        for(int i=0;i<nums.length;i++)
        {
        if(sum==0)
        {
            start=i;
        }
        sum=sum+nums[i];
        if(sum>maxi)
        {
            maxi=sum;
            astart=start;
            aend=i;
        }
        if(sum<0)
        {
            sum=0;
        }
        }
        return maxi;
    }
}