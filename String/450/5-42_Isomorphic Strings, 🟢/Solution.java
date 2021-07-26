import java.util.*;

public class Solution {
    public static boolean areIsomorphic(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        int arr1[] = new int[26];
        int arr2[] = new int[26];

        for (int i = 0; i < 26; i++) {
            arr1[i] = 0;
            arr2[i] = 0;
        }

        for (int i = 0; i < str1.length(); i++) {
            arr1[str1.charAt(i) - 'a']++;
            arr2[str2.charAt(i) - 'a']++;

            if (arr1[str1.charAt(i) - 'a'] != arr2[str2.charAt(i) - 'a']) {
                return false;
            }

        }

        return true;

    }
}
