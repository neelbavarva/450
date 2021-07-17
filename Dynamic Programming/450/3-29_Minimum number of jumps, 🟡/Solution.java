public class Solution {
    static int minJumps(int[] arr) {

        int maxR = arr[0];
        int step = arr[0];
        int jump = 1;

        if (arr.length == 1) {
            return 0;
        } else if (arr[0] == 0) {
            return -1;
        } else {
            for (int i = 1; i < arr.length; i++) {
                if (i == arr.length - 1) {
                    return jump;
                }
                maxR = Math.max(maxR, arr[i] + i);
                step--;

                if (step == 0) {
                    jump++;
                    if (i >= maxR) {
                        return -1;
                    }

                    step = maxR - i;

                }
            }

            return jump;
        }

    }
}
