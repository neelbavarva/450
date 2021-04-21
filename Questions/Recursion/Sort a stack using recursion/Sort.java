import java.io.*;
import java.util.*;
 
public class Sort {

    static void sortedInsert(Stack<Integer> s, int x){
        
        if (s.isEmpty() || x > s.peek()){
            s.push(x);
            return;
        }

        int temp = s.pop();
        sortedInsert(s, x);
 
        s.push(temp);
    }

    static void sortStack(Stack<Integer> s){
        if (!s.isEmpty()){
            int x = s.pop();
 
            sortStack(s);
 
            sortedInsert(s, x);
        }
    }

    static void printStack(Stack<Integer> s){
        ListIterator<Integer> lt = s.listIterator();
 
        while (lt.hasNext())
            lt.next();

        while (lt.hasPrevious()){
            System.out.print(lt.previous() + " ");
        }
    }
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer> stack = new Stack<>();
        stack.push(4);
        stack.push(9);
        stack.push(7);
        stack.push(1);

        sortStack(stack);

        printStack(stack);
        
    }
}