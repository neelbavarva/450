// Question Link : https://www.geeksforgeeks.org/java-program-for-tower-of-hanoi/
// YouTube Link : youtube.com/watch?v=l45md3RYX7c

import java.io.*;
import java.util.*;
 
public class Tower {

    static void solve(int s, int d, int h, int n){
        if(n==1){
            System.out.println("Moving plate " + n + " from " + s + " to " + d);
            return;
        }

        solve(s, h, d, n-1);

        System.out.println("Moving plate " + n + " from " + s + " to " + d);

        solve(h, d, s, n-1);
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        solve(1, 2, 3, 5);
        
    }
}