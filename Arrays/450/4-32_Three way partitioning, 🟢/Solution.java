public class Solution {

    public void threeWayPartition(int arr[], int a, int b) {
        int n = arr.length;

        int start = 0, end = n - 1;

        for (int i = 0; i <= end;) {

            if (arr[i] < a) {

                int temp = arr[start];
                arr[start] = arr[i];
                arr[i] = temp;
                start++;
                i++;

            }

            else if (arr[i] > b) {

                int temp = arr[end];
                arr[end] = arr[i];
                arr[i] = temp;
                end--;

            }

            else {
                i++;
            }
        }
    }
}
