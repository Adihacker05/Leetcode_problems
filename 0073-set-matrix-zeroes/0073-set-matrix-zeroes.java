class Solution {
    public void setZeroes(int[][] mat) {
        int r=mat.length;
        int c=mat[0].length;
        int arr[]= new int[r*c];
        int a=0;
        int r1=0;
        int c1=0;
        int itr1=0;
        int itr2=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[a]=mat[i][j];
                a++;
            }
        }
        for(int k=0;k<a;k++)
        {
            if(arr[k]==0)
            {
                r1=k/c;
                c1=k%c;
                itr1=0;
                itr2=0;
                while(itr1<c)
                {
                    mat[r1][itr1]=0;
                    itr1++;

                }
                while(itr2<r)
                {
                    mat[itr2][c1]=0;
                    itr2++;

                }
            }
        }
       
    }
}