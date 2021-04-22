import java.io.*;
import java.util.*;
 
public class Reverse {

    static Stack<Integer> stack = new Stack<>();
      
    static void insert_at_bottom(int x)
    {
  
        if(stack.isEmpty())
            stack.push(x);
  
        else
        {
              
            int temp = stack.pop();
            insert_at_bottom(x);
  
            stack.push(temp);
        }
    }

    static void reverse()
    {
        if(stack.size() > 0)
        {
              
            int x = stack.pop();
            reverse();
              
            insert_at_bottom(x);
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        stack.push(4);
        stack.push(9);
        stack.push(5);
        stack.push(7);
        stack.push(1);

        reverse();        

        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        
    }
}