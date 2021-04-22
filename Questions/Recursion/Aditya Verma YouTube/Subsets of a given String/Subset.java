// Question Link : https://www.geeksforgeeks.org/recursive-program-to-generate-power-set/

import java.io.*;
import java.util.*;
 
public class Subset {

    static public void solve(String output, String input){
        if(input.equals("")){
            System.out.println(output);
            return;
        }

        solve(output, input.substring(1));
        solve(output + input.charAt(0), input.substring(1));
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        solve("", "ABC");
        
    }
}