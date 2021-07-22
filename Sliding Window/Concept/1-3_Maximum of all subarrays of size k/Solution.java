import java.io.*;
import java.util.*;

public class Solution {

    static public List<Integer> solve(int arr[], int k) {

        List<Integer> list = new ArrayList<>();
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        int i = 0;
        int j = 0;
        queue.add(arr[j]);

        while (j < arr.length) {
            if (j - i + 1 < k) {
                j++;
                queue.add(arr[j]);
            } else if (j - i + 1 == k) {

                list.add(queue.peek());
                queue.remove(arr[i]);

                i++;
                j++;

                if (j < arr.length) {
                    queue.add(arr[j]);
                }
            }
        }

        return list;
    }

    public static void main(String[] args) throws IOException {
        int arr[] = { 1, 2, 3, 1, 4, 5, 2, 3, 6 };
        int k = 3;

        System.out.println(solve(arr, k));
    }

}
