import java.io.*;
import java.util.*;

public class Solution {

    // GFG Code
    public static int getMaxArea(int arr[], int n) {
        // your code here
        // we create an empty stack here.
        Stack<Integer> s = new Stack<>();
        // we push -1 to the stack because for some elements there will be no previous
        // smaller element in the array and we can store -1 as the index for previous
        // smaller.
        s.push(-1);
        int max_area = arr[0];
        // We declare left_smaller and right_smaller array of size n and initialize them
        // with -1 and n as their default value.
        // left_smaller[i] will store the index of previous smaller element for ith
        // element of the array.
        // right_smaller[i] will store the index of next smaller element for ith element
        // of the array.
        int left_smaller[] = new int[n];
        int right_smaller[] = new int[n];
        for (int i = 0; i < n; i++) {
            left_smaller[i] = -1;
            right_smaller[i] = n;
        }

        int i = 0;
        while (i < n) {
            while (!s.empty() && s.peek() != -1 && arr[i] < arr[s.peek()]) {
                // if the current element is smaller than element with index stored on the
                // top of stack then, we pop the top element and store the current element index
                // as the right_smaller for the poped element.
                right_smaller[s.peek()] = (int) i;
                s.pop();
            }
            if (i > 0 && arr[i] == arr[(i - 1)]) {
                // we use this condition to avoid the unnecessary loop to find the left_smaller.
                // since the previous element is same as current element, the left_smaller will
                // always be the same for both.
                left_smaller[i] = left_smaller[(int) (i - 1)];
            } else {
                // Element with the index stored on the top of the stack is always smaller than
                // the current element.
                // Therefore the left_smaller[i] will always be s.top().
                left_smaller[i] = s.peek();
            }
            s.push(i);
            i++;
        }

        for (i = 0; i < n; i++) {
            // here we find area with every element as the smallest element in their range
            // and compare it with the previous area.
            // in this way we get our max Area form this.
            max_area = Math.max(max_area, arr[i] * (right_smaller[i] - left_smaller[i] - 1));
        }

        return max_area;
    }

    // My Code, Not working :)
    public static int getMaxAreaMy(int hist[], int n) {

        if (n == 1) {
            return hist[0];
        }
        Stack<Integer> stack = new Stack<>();
        int left[] = new int[n];
        int right[] = new int[n];

        for (int i = 0; i < n; i++) {
            left[i] = -1;
            right[i] = n;
        }

        stack.push(0);

        for (int i = 1; i < n; i++) {
            if (stack.isEmpty()) {
                stack.push(i);
            } else {
                while (!stack.isEmpty() && hist[i] < hist[stack.peek()]) {
                    stack.pop();
                }

                if (stack.isEmpty()) {
                    left[i] = -1;
                    stack.push(i);
                } else {
                    left[i] = stack.peek();
                    stack.push(i);
                }
            }
        }

        while (!stack.isEmpty()) {
            stack.pop();
        }

        stack.push(n - 1);
        for (int i = n - 1; i >= 0; i--) {
            if (stack.isEmpty()) {
                stack.push(i);
            } else {
                while (!stack.isEmpty() && hist[i] < hist[stack.peek()]) {
                    stack.pop();
                }

                if (stack.isEmpty()) {
                    right[i] = n;
                    stack.push(i);
                } else {
                    right[i] = stack.peek();
                    stack.push(i);
                }
            }
        }

        int max[] = new int[n];

        for (int i = 0; i < n; i++) {
            max[i] = (right[i] - left[i] - 1) * hist[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(right[i] + " ");
        }

        int maxArea = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (maxArea < max[i]) {
                maxArea = max[i];
            }
        }

        return maxArea;
    }

    public static void main(String[] args) throws IOException {

        int arr[] = { 6, 2, 5, 4, 5, 1, 6 };
        System.out.println(getMaxArea(arr, arr.length));
    }
}