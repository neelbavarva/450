import java.io.*;
import java.util.*;
 
public class Recursion {

    static int count = 0;

    static public void solve(int arr[], int n, int sum){

        if(sum==0){
            count++;
            return;
        }

        if(n==0){
            return;
        }
        
        solve(arr, n-1, sum-arr[n-1]);
        solve(arr, n-1, sum);
    }

    public static void main(String[] args) throws IOException {
        
        int arr[] = {2, 3, 5, 6, 8, 10};
        int n = arr.length;
        int sum = 10;
        
        solve(arr, n, sum);

        System.out.println(count);
    }
}