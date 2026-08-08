class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> st = new ArrayList<>();

        int len = nums.length;
        int n = (int)Math.pow(2, len);

        for(int i = 0; i < n; i++) {
            List<Integer> str = new ArrayList<>();

            for(int j = 0; j < len; j++) {
                if((i & (1 << j)) != 0) {
                    str.add(nums[j]);
                }
            }

            st.add(str);
        }

        return st;
    }
}