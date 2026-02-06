class Solution {
    public static void reverse(int mat[][])
    {
        int temp=0;
        int n=mat[0].length;;
        for(int i=0;i<n;i++)
        {
            int a=0;
            int b=n-1;
            while(a<b)
            {
                temp=mat[i][a];
                mat[i][a]=mat[i][b];
                mat[i][b]=temp;
                a++;
                b--;
            }
        }
    }
    public void rotate(int[][] mat) {
        int n=mat[0].length;
        int temp=0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
        reverse(mat);
    }
}