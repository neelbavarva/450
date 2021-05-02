import java.io.*;
import java.util.*;
 
public class Memoization{

    static public int dp[][];

    public static int solve(int wt[], int val[], int cap, int n){
        
        if(n==0 || cap == 0){
            return 0;
        }

        if(dp[n][cap] != -1){
            return dp[n][cap];
        }

        if(wt[n-1] <= cap){
            return (dp[n][cap] = Math.max(val[n-1] + solve(wt, val, cap - wt[n-1], n-1), solve(wt, val, cap, n-1)));
        } else {
            return (dp[n][cap] = solve(wt, val, cap, n-1));
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc= new Scanner(System.in);
        int wt[] = {1, 2, 3, 4};
        int val[] = {2, 5, 6, 4};
        int n = 4;
        int cap = 4;

        dp = new int[n+1][cap+1];

        for(int i=0;i<n+1;i++){
            for(int j=0;j<cap+1;j++){
                dp[i][j] = -1;
            }
        }

        int ans = solve(wt,val,cap,n);
        System.out.println(ans);
        

    }
}