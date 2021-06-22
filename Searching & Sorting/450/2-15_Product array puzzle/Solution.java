public class Solution {
    public static long[] productExceptSelf(int nums[], int n) {
        long product = 1;
        boolean hasZero = false;
        long zeroCount = 0;
        for (int i = 0; i < n; i++) {

            if (nums[i] == 0) {
                hasZero = true;
                zeroCount++;
            } else {
                product *= nums[i];
            }
        }

        long P[] = new long[n];

        if (hasZero) {
            if (zeroCount > 1) {
                for (int i = 0; i < n; i++) {
                    P[i] = 0;
                }
            } else {
                for (int i = 0; i < n; i++) {
                    if (nums[i] == 0) {
                        P[i] = product;
                    } else {
                        P[i] = 0;
                    }
                }
            }
        } else {
            for (int i = 0; i < n; i++) {
                P[i] = product / nums[i];
            }
        }

        return P;
    }
}
