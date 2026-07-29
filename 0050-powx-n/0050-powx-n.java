class Solution {
    public double myPow(double x, int n) {
        long exp = n; // avoid overflow for Integer.MIN_VALUE

        if (exp < 0) {
            x = 1 / x;
            exp = -exp;
        }

        double ans = 1.0;

        while (exp > 0) {
            // If exp is odd, multiply current x
            if ((exp & 1) == 1) {
                ans *= x;
            }

            x *= x;      // square the base
            exp /= 2;    // halve the exponent
        }

        return ans;
    }
}