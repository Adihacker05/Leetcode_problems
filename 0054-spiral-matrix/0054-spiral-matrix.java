class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        int top=0,left=0;
        int bottom=mat.length-1,right=mat[0].length-1;
        List<Integer> list= new ArrayList<>();
        while(top<=bottom && left<=right)
        {
            for(int i=left;i<=right;i++)
            {
                list.add(mat[top][i]);
            }
            top++;
            for(int j=top;j<=bottom;j++)
            {
                list.add(mat[j][right]);
            }
            right--;
            if(top<=bottom)
            {
                for(int k=right;k>=left;k--)
                {
                    list.add(mat[bottom][k]);
                }
                bottom--;
            }
            if(left<=right)
            {
                for(int k=bottom;k>=top;k--)
                {
                    list.add(mat[k][left]);
                }
                left++;
            }
        }
        return list;
    }
}