import java.io.*;
import java.util.*;
 
public class Recursion {

    public static int solve(int wt[], int val[], int cap, int n){
        
        if(n==0 || cap == 0){
            return 0;
        }

        if(wt[n-1] <= cap){
            return Math.max(val[n-1] + solve(wt, val, cap - wt[n-1], n-1), solve(wt, val, cap, n-1));
        } else {
            return solve(wt, val, cap, n-1);
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc= new Scanner(System.in);
        int wt[] = {1, 2, 3, 4};
        int val[] = {2, 5, 6, 4};
        int n = 4;
        int cap = 4;

        int ans = solve(wt,val,cap,n);
        System.out.println(ans);

    }
}