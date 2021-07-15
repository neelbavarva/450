import java.util.*;

public class Solution {
    public static boolean isPresent(int arr[], int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return true;
            }
        }
        return false;
    }

    public static void setArray(int arr[], int n, int page_fault) {
        if (!isPresent(arr, -1)) {
            if (isPresent(arr, n)) {

                int index = 0;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == n) {
                        index = i;
                        break;
                    }
                }

                for (int i = index; i < arr.length - 1; i++) {
                    arr[i] = arr[i + 1];
                }

                arr[arr.length - 1] = n;

            } else {
                for (int i = 0; i < arr.length - 1; i++) {
                    arr[i] = arr[i + 1];
                }

                arr[arr.length - 1] = n;
            }

        } else {
            for (int i = 0; i < arr.length; i++) {
                if (!isPresent(arr, n)) {
                    if (arr[i] == -1) {
                        arr[i] = n;
                        break;
                    }
                } else {
                    int index = -1;
                    for (int j = 0; j < arr.length; j++) {
                        if (arr[j] == -1) {
                            index = j - 1;
                            break;
                        }
                    }

                    if (arr[index] != n) {
                        int ind = -1;
                        for (int k = 0; k < index; k++) {
                            if (arr[k] == n) {
                                ind = k;
                                break;
                            }
                        }
                        for (int p = ind; p < index; p++) {
                            arr[p] = arr[p + 1];
                        }
                        arr[index] = n;
                    }
                }
            }
        }
    }

    static int pageFaults(int N, int C, int pages[]) {
        int page_fault = 0;
        int arr[] = new int[C];
        Arrays.fill(arr, -1);

        for (int i = 0; i < N; i++) {

            if (!isPresent(arr, pages[i])) {
                setArray(arr, pages[i], page_fault);

                page_fault++;
            } else if (isPresent(arr, pages[i])) {
                setArray(arr, pages[i], page_fault);
            }
        }
        return page_fault;
    }
}
