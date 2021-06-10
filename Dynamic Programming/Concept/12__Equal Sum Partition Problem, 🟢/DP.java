import java.io.*;
import java.util.*;
 
public class DP {

    public static void main(String[] args) throws IOException {
        
        int arr[] = {1, 5, 11, 5};
        int n = arr.length;
        int sum = 0;

        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }

        if(sum%2 == 1){
            System.out.println(false);
        } else {
            sum = sum/2;
            boolean dp[][] = new boolean[n+1][sum+1];


            // Subset sum problem's code
            for(int i=0;i<n+1;i++){
                for(int j=0;j<sum+1;j++){
                    if(j==0){
                        dp[i][j]= true;
                    } 
                    if(i==0){
                        dp[i][j]= false;
                    }
                }
            }
            
            for(int i=1;i<n+1;i++){
                for(int j=1;j<sum+1;j++){
    
                    // Main Approach
                    if(arr[i-1]<= j){
                        dp[i][j] = dp[i-1][j-arr[i-1]] || dp[i-1][j];
                    } else {
                        dp[i][j] = dp[i-1][j];
                    }
                }
            }
    
            System.out.println(dp[n][sum]);

        }
    }
}