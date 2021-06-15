import java.io.*;
import java.util.*;

public class Solution {

    static public void solve(int stocks[], int n) {
        int arr[] = new int[n];
        arr[0] = 1;
        Stack<Integer> stack = new Stack<>();

        for (int i = 1; i < n; i++) {
            if (!stack.isEmpty() && stack.peek() > stocks[i]) {
                stack.push(stocks[i]);
                arr[i] = 1;
            } else {
                arr[i] = 1;
                while (!stack.isEmpty() && stack.peek() < stocks[i]) {
                    stack.pop();
                    arr[i]++;
                }
                stack.push(stocks[i]);
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) throws IOException {

        int arr[] = { 7, 1, 5, 3, 6, 4 };
        solve(arr, arr.length);
    }
}