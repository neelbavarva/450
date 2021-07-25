import java.util.ArrayList;

public class Recursive {
    public static int wordBreak(String word, ArrayList<String> dictonary) {

        int size = word.length();

        if (size == 0)
            return 1;

        for (int i = 1; i <= size; i++) {

            if (dictonary.contains(word.substring(0, i)) && wordBreak(word.substring(i, size), dictonary) == 1)
                return 1;
        }

        return 0;

    }
}
