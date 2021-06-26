public class Solution {
    public int minSwaps(int nums[]) {
        int n = nums.length;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = nums[i];
        }
        Arrays.sort(arr);
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(arr[i], i);
        }

        for (int i = 0; i < n; i++) {
            nums[i] = map.get(nums[i]);
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] != i) {
                int temp = nums[nums[i]];
                nums[nums[i]] = nums[i];
                nums[i] = temp;
                count++;
                i--;
            }
        }

        return count;
    }
}
