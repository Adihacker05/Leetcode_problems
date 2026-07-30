class Solution {
    static final long MOD = 1000000007;

    public int countGoodNumbers(long n) {
        long even = (n + 1) / 2;
        long odd = n / 2;

        long ans = power(5, even);
        ans = (ans * power(4, odd)) % MOD;

        return (int) ans;
    }

    public long power(long base, long exponent) {
        long ans = 1;

        while (exponent > 0) {
            if (exponent % 2 == 1) {
                ans = (ans * base) % MOD;
            }

            base = (base * base) % MOD;
            exponent = exponent / 2;
        }

        return ans;
    }
}