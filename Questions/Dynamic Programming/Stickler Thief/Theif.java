// Question Link : https://practice.geeksforgeeks.org/problems/stickler-theif-1587115621/1/?track=ppc-dp&batchId=221

import java.io.*;
import java.util.*;
 
public class Theif {

    static public int FindMaxSum(int arr[], int n){
        
        int dp[] = new int[n];

        if(n<2){
            return arr[0];
        }

        dp[0] = arr[0];
        dp[1] = Math.max(arr[0], arr[1]);

        for(int i=2;i<n;i++){
            dp[i] = Math.max(arr[i] + dp[i-2], dp[i-1]);
            System.out.println(dp[i]);
        }

        return dp[n-1];
    }
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = 6;
        int arr[] = {5,5,10,100,10,5};

        System.out.println(FindMaxSum(arr, n));
    }
}