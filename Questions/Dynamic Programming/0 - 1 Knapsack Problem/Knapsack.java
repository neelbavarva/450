// Question Link : https://practice.geeksforgeeks.org/problems/0-1-knapsack-problem0945/1

import java.io.*;
import java.util.*;
 
public class Knapsack {

    static int knapSack(int W, int wt[], int val[], int n) 
    { 
        int dp[][] = new int[n+1][W+1];
        
        for(int i=0;i<W+1;i++){
            dp[0][i] = 0;
        }

        for(int i=0;i<n+1;i++){
            dp[i][0] = 0;
        }

        for(int item = 1; item<=n; item++){
            for(int capacity = 1; capacity<=W; capacity++){

                int prevLoad = dp[item-1][capacity];
                int weightOfCurrent = wt[item-1];

                if(weightOfCurrent <= capacity){

                    int store = 0;
                    store = val[item-1] + dp[item-1][capacity - weightOfCurrent];
                    dp[item][capacity] = Math.max(prevLoad, store);

                } else {
                    dp[item][capacity] = prevLoad;
                }
            }
        }

        return dp[n][W];
    }
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = 3;
        int W = 4;

        int values[] = {1, 2, 3};
        int weight[] = {4, 5, 1};

        System.out.println(knapSack(W, weight, values, N));
    }
}