
public class Solution {
    static public void solve(String output, String input) {
        if (input == "" || input.equals("")) {
            System.out.println(output);
            return;
        }

        solve(output + input.charAt(0), input.substring(1));
        solve(output, input.substring(1));
    }
}
