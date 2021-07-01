import java.io.*;
import java.util.*;

public class Solution {
    static public int rotateInArray(int arr[]) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;

        if (arr[0] < arr[n - 1]) {
            return 0;
        }

        while (left <= right) {

            int middle = (left + right) / 2;
            int previous = (middle + n - 1) % n;
            int next = (middle + 1) % n;

            if (arr[middle] < arr[previous] && arr[middle] < arr[next]) {
                return middle;
            }

            if (arr[middle] > arr[n - 1]) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }

        }

        return -1;
    }

    public static void main(String[] args) throws IOException {
        int arr[] = { 11, 12, 18, 20, 2, 4, 10 };
        System.out.println(rotateInArray(arr));
    }
}
