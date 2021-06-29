public class Solution {
    static long countOfInversion = 0;

    static public void sort(long[] arr) {

        if (arr.length < 2) {
            return;
        }

        long middle = arr.length / 2;

        long left[] = new long[(int) middle];
        for (int i = 0; i < middle; i++) {
            left[i] = arr[i];
        }

        long right[] = new long[(int) (arr.length - middle)];
        for (int i = (int) middle; i < arr.length; i++) {
            right[i - (int) middle] = arr[i];
        }

        sort(left);
        sort(right);

        merge(left, right, arr);

    }

    static private void merge(long left[], long right[], long result[]) {
        long i = 0;
        long j = 0;
        long k = 0;

        while (i < left.length && j < right.length) {
            if (left[(int) i] <= right[(int) j]) {
                result[(int) k++] = left[(int) i++];
            } else {
                result[(int) k++] = right[(int) j++];
                // MAIN LOGIC
                countOfInversion += left.length - i;
            }
        }

        while (i < left.length) {
            result[(int) k++] = left[(int) i++];
        }

        while (j < right.length) {
            result[(int) k++] = right[(int) j++];
        }
    }

    static long inversionCount(long arr[], long N) {
        countOfInversion = 0;
        sort(arr);
        return countOfInversion;
    }
}
