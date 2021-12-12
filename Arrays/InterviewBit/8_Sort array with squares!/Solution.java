public class Solution {
    public int[] solve(int[] arr) {
        int n = arr.length;

        if (arr[0] < 0) {
            int neg = -1;
            int pos = -1;

            for (int i = 0; i < n; i++) {
                if (arr[i] >= 0) {
                    neg = i - 1;
                    pos = i;
                    break;
                }
            }

            int newArr[] = new int[n];
            int i = 0;

            while (neg >= 0 && pos < n && i < n) {
                if (Math.abs(arr[neg]) < arr[pos]) {
                    newArr[i] = arr[neg];
                    neg--;
                    i++;
                } else {
                    newArr[i] = arr[pos];
                    pos++;
                    i++;
                }
            }

            while (neg >= 0) {
                newArr[i] = arr[neg];
                neg--;
                i++;
            }

            while (pos < n) {
                newArr[i] = arr[pos];
                pos++;
                i++;
            }

            for (int j = 0; j < n; j++) {
                newArr[j] = newArr[j] * newArr[j];
            }

            return newArr;

        } else {
            for (int i = 0; i < n; i++) {
                arr[i] = arr[i] * arr[i];
            }

            return arr;
        }
    }
}
