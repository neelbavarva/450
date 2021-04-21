import java.io.*;
import java.util.*;
 
public class Mid {

    static void solve(Stack<Integer> stack, int k){

        if(k==1){
            stack.pop();
            return;
        }

        int temp = stack.pop();
        solve(stack, k-1);
        stack.push(temp);
    }

    static void removeMid(Stack<Integer> stack){
        int k = stack.size()/2 + 1;
        solve(stack, k);
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer> stack = new Stack<>();
        stack.push(4);
        stack.push(9);
        stack.push(5);
        stack.push(7);
        stack.push(1);

        removeMid(stack);

        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        
    }
}