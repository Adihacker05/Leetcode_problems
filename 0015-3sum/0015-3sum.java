class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        int c=0;
        Set<List<Integer>> hashset = new HashSet<>();
        for(int i=0;i<n;i++)
        {
            Set<Integer> set = new HashSet<>();
            for(int j=i+1;j<n;j++)
            {
                c=-(nums[i]+nums[j]);
                if(set.contains(c))
                {
                    List<Integer> temp= new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[i]);
                    temp.add(c);
                    Collections.sort(temp);
                    hashset.add(temp);
                }
                set.add(c);
            }
        }
        return new ArrayList<>(hashset);
    }
}