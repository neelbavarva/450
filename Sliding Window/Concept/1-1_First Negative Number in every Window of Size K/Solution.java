import java.io.*;
import java.util.*;

public class Solution {

    static public List<Integer> solve(int arr[], int k) {
        List<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        int i = 0;
        int j = 0;

        while (j < arr.length) {
            if (j - i + 1 < k) {
                if (arr[j] < 0) {
                    queue.add(arr[j]);
                }
                j++;
            } else if (j - i + 1 == k) {

                if (queue.isEmpty()) {
                    list.add(0);
                } else {
                    if (queue.peek() == arr[i]) {
                        list.add(queue.peek());
                        queue.remove();
                    } else {
                        list.add(queue.peek());
                    }
                }

                i++;
            }
        }

        return list;
    }

    public static void main(String[] args) throws IOException {

        int arr[] = { 12, -1, -7, 8, -15, 30, 16, 28 };
        System.out.println(solve(arr, 3));

    }

}
