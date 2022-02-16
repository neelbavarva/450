```
// A priority queue that keeps element in increasing order
PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 - o2;
    }
});
```
