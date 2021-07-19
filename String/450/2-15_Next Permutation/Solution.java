import java.util.*;

public class Solution {
    static List<Integer> nextPermutation(int n, int arr[]) {
        List<Integer> list = new ArrayList<>();

        int k = -1;
        for (int i = n - 1; i > 0; i--) {
            if (arr[i] > arr[i - 1]) {
                k = i - 1;
                break;
            }
        }

        if (k == -1) {

            for (int i = 0; i < n; i++) {
                list.add(arr[i]);
            }

            Collections.sort(list);
            return list;
        } else {

            int l = -1;
            for (int i = 0; i < n; i++) {
                if (arr[k] < arr[i]) {
                    l = i;
                }
            }

            int temp = arr[k];
            arr[k] = arr[l];
            arr[l] = temp;

            k++;
            int last = n - 1;

            while (k < last) {
                int tempX = arr[k];
                arr[k] = arr[last];
                arr[last] = tempX;

                k++;
                last--;
            }

            for (int i = 0; i < n; i++) {
                list.add(arr[i]);

            }

            return list;

        }
    }
}
