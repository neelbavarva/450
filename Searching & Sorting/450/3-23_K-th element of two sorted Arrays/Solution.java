public class Solution {
    public int kthElement(int arr1[], int arr2[], int n, int m, int k) {

        int i = 0;
        int j = 0;

        List<Integer> list = new ArrayList<>();

        while (i < n && j < m) {
            if (list.size() == k) {
                return list.get(list.size() - 1);
            } else if (arr1[i] > arr2[j]) {
                list.add(arr2[j]);
                j++;
            } else {
                list.add(arr1[i]);
                i++;
            }
        }

        if (i < n) {
            while (i < n) {
                if (list.size() == k) {
                    return list.get(list.size() - 1);
                } else {
                    list.add(arr1[i]);
                    i++;
                }
            }
        } else if (j < m) {
            while (j < m) {
                if (list.size() == k) {
                    return list.get(list.size() - 1);
                } else {
                    list.add(arr2[j]);
                    j++;
                }
            }
        }

        return -1;

    }
}
