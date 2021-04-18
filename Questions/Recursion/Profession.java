// Question Link : https://www.geeksforgeeks.org/find-profession-in-a-hypothetical-special-situation/

import java.io.*;
import java.util.*;

public class Profession {

    static char profession(int level, int pos){
        if (level == 1)
        return 'e';
 
        if (profession(level - 1, (pos + 1) / 2) == 'd')
            return (pos % 2 > 0) ? 'd' : 'e';
     
      
        return (pos % 2 > 0) ? 'e' : 'd';
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        System.out.println(profession(4, 2));
        
    }
}
