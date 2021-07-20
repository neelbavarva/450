import java.util.*;

public class Solution {
    static String secFrequent(String arr[], int N) {
        Map<String, Integer> map = new TreeMap<>();

        for (int i = 0; i < N; i++) {
            if (map.containsKey(arr[i])) {
                map.replace(arr[i], map.get(arr[i]), map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        List<Integer> list = new ArrayList<>();

        int k = 0;
        int size = 0;
        String ans = "";

        Map<Integer, String> map2 = new TreeMap<>();

        for (Map.Entry mapElement : map.entrySet()) {
            size++;
            String key = (String) mapElement.getKey();
            int value = (int) mapElement.getValue();
            map2.put(value, key);
        }

        for (Map.Entry mapElement : map2.entrySet()) {

            String value = (String) mapElement.getValue();
            int key = (int) mapElement.getKey();
            k++;
            if (k == size - 1) {
                ans = value;
            }

        }

        return ans;
    }
}
