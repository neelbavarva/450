// Question Link : https://leetcode.com/problems/k-th-symbol-in-grammar/

import java.io.*;
import java.util.*;
 
public class Grammar {

    static public int solve (int n, int k){
        if(n==1 && k==1){
            return 0;
        }

        int mid = (int)Math.pow(2, n-1)/2;
        if(k<=mid){
            return solve(n-1, k);
        } else {
            int temp = solve(n-1, k-mid);
            if(temp == 1){
                return 0;
            } else {
                return 1;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        
        System.out.println(solve(4, 3));
    }
}