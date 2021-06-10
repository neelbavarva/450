import java.io.*;
import java.util.*;
 
public class Recursion{

    static public int getSum(int arr[], int l, int r){
        
        int sum = 0;
        for(int i=l;i<=r;i++){
            sum += arr[i];
        }

        return 0;

    }
    
    static public boolean solve(int arr[], int sum, int i){

        if(sum == getSum(arr, i, arr.length-1)){
            return true;
        }

        if(i==arr.length-1){
            return false;
        }

        boolean Include = solve(arr, sum+arr[i], i+1);
        boolean notInclude = solve(arr, sum, i+1);

        return Include | notInclude;
    }
    public static void main(String[] args) throws IOException {
        
        int arr[] = {1, 5, 11, 5};
        int sum = 0;

        System.out.println(solve(arr, sum, 0));
    }
}