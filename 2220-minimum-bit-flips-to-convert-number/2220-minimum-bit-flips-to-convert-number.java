class Solution {
    public int minBitFlips(int s, int g) {
        int cnt=0;
        while(s>0 || g>0)
        {
            if(s%2!=g%2)
            {
                cnt+=1;
            }
            s=s/2;
            g=g/2;
        }
        return cnt;
    }
}