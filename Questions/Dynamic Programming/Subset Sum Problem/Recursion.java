import java.io.*;
import java.util.*;
 
public class Recursion{

    public static boolean solve(int arr[], int n, int sum){

        if(sum == 0){
            return true;
        }

        if(n == 1){
            if(arr[0] == sum){
                return true;
            } else {
                return false;
            }
        }

        
        boolean result_1 = solve(arr, n-1, sum);
        boolean result_2 = solve(arr, n-1, sum - arr[n-1]);
        
        
        return result_1|result_2;
    }
    
    public static void main(String[] args) throws IOException {
        Scanner sc= new Scanner(System.in);
        
        int arr[] = {2, 3, 7, 8, 10};
        int n = 5;
        int sum = 11;

        System.out.println(solve(arr, n, sum));

    }
}