public class Solution {
    static int majorityElement(int arr[], int size) {
        int element = arr[0];
        int count = 1;

        for (int i = 1; i < size; i++) {

            if (element != arr[i]) {
                count--;
            } else {
                count++;
            }

            if (count == 0) {
                element = arr[i];
                count = 1;
            }

        }

        int countTime = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] == element) {
                countTime++;
            }
        }

        if (countTime > size / 2) {
            return element;
        }

        return -1;
    }
}
