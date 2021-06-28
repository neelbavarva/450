public class Solution {
    class Meet {
        int start;
        int end;

        public Meet(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    // Sort According To The End Time
    public int maxMeetings(int start[], int end[], int n) {
        Meet arr[] = new Meet[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Meet(start[i], end[i]);
        }

        Arrays.sort(arr, new Comparator<Meet>() {
            public int compare(Meet s1, Meet s2) {
                return s1.end - s2.end;
            }
        });

        int count = 1;
        int previous = arr[0].end;
        for (int i = 1; i < n; i++) {
            if (arr[i].start > previous) {
                count++;
                previous = arr[i].end;
            }
        }

        return count;
    }
}
