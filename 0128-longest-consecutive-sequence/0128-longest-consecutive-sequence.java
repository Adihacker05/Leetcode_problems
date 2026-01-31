class Solution {
    public int longestConsecutive(int[] nums) {
        Set <Integer> set= new HashSet<>();
        int longest=1;
        int cnt=0;
        int n =nums.length;
        int x=0;
        if(n==0)
        {
            return 0;
        }
        if(n==1)
        {
            return 1;
        }
        for(int i=0;i<n;i++)
        {
            set.add(nums[i]);
        }
        for(int it:set)
        {
            if(!set.contains(it-1))
            {
                x=it;
                cnt=1;
                while(set.contains(x+1))
                {
                    x=x+1;
                    cnt++;
                }
                longest=Math.max(longest,cnt);
            }
        }
        return longest;
    }
}