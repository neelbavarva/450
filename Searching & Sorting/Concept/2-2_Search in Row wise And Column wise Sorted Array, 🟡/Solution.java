import java.io.*;
import java.util.*;

public class Solution {
    public static void find(int arr[][], int n, int m, int key) {
        int i = 0;
        int j = m - 1;

        while (i >= 0 && i < n && j >= 0 && j < m) {
            if (arr[i][j] == key) {
                System.out.println("i : " + i + " j : " + j);
                return;
            } else if (arr[i][j] > key) {
                j--;
            } else if (arr[i][j] < key) {
                i++;
            }
        }
        System.out.println(-1);
    }

    public static void main(String[] args) throws IOException {
        int arr[][] = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 49 }, { 32, 33, 39, 50 } };
        find(arr, 4, 4, 29);
    }
}
