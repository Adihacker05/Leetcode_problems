class Solution {
    public static List<Integer> genlist(int row)
    {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        int ans=1;
        for(int col=1;col<row;col++)
        {
            ans=ans*(row-col);
            ans=ans/col;
            list1.add(ans);
        }
        return list1;
    }
    public List<List<Integer>> generate(int row) {
        List<List<Integer>> ans =new ArrayList<>();
        for(int i=1;i<=row;i++)
        {
            ans.add(genlist(i));
        }
        return ans;
    }
}