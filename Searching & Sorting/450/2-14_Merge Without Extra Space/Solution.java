public class Solution {
    public void merge(int arr1[], int arr2[], int n, int m) {
        int i = n - 1;
        int j = 0;

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        while (i >= 0 && j <= m - 1) {
            if (arr1[i] > arr2[j]) {
                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
            } else {
                break;
            }

            i--;
            j++;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
}
