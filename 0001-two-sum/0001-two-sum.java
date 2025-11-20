class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map= new HashMap<>();
        int r=0;
       int res[]=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            r=target-nums[i];
            if(map.containsKey(r))
            {
                res[0]=i;
                res[1]=map.get(r);
                break;
            }
            else
            {
                map.put(nums[i],i);
            }
            
        }
        return res;
    }
}