import java.io.*;
import java.util.*;

public class Solution {

    static public void solve(int price[], int n) {
        int arr[] = new int[n];
        arr[0] = 1;

        Stack<Integer> stack = new Stack<>();

        stack.push(0);

        for (int i = 1; i < n; i++) {
            while (!stack.isEmpty() && price[stack.peek()] <= price[i]) {

                stack.pop();
            }

            arr[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());

            stack.push(i);

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