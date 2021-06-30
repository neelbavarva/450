public class Solution {

    // Java's Inbuilt Function
    static void sortBySetBitCount(Integer arr[], int n) {
        Arrays.sort(arr, (a, b) -> Integer.compare(Integer.bitCount(b), Integer.bitCount(a)));
    }
}
