public class Solution {
    static ArrayList<Integer> candyStore(int candies[], int N, int K) {
        List<Integer> list = new ArrayList<>();

        int min = 0;
        int max = 0;
        Arrays.sort(candies);

        // For Max
        int ix = 0;
        int yx = N - 1;

        int countx = 0;
        while (ix <= yx) {
            countx += candies[yx];
            yx--;
            ix += K;
        }

        // For Min

        int in = N - 1;
        int jn = 0;

        int countn = 0;
        while (in >= jn) {
            countn += candies[jn];
            jn++;
            in -= K;
        }

        list.add(countn);
        list.add(countx);

        return (ArrayList<Integer>) list;
    }
}
