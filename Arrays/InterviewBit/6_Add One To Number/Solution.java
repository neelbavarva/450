public class Solution {
    public int[] plusOne(int[] arr) {
        int carry = 0;

        int i = arr.length - 1;

        carry = (arr[i] + 1) > 9 ? 1 : 0;
        arr[i] = (arr[i] + 1) % 10;

        i--;

        while (carry == 1 && i >= 0) {
            carry = (arr[i] + 1) > 9 ? 1 : 0;
            arr[i] = (arr[i] + 1) % 10;
            i--;
        }

        if (carry == 1) {
            int newArr[] = new int[arr.length + 1];

            newArr[0] = 1;

            for (int j = 0; j < arr.length; j++) {
                newArr[j + 1] = arr[j];
            }

            return newArr;
        }

        int count = 0;

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == 0) {
                count++;
            } else if (arr[j] != 0) {
                break;
            }
        }

        int returnArr[] = new int[arr.length - count];

        for (int j = 0; j < arr.length - count; j++) {
            returnArr[j] = arr[j + count];
        }

        return returnArr;

    }
}
