import java.io.*;
import java.util.*;

public class Solution {
    class Item {
        int value, weight;

        Item(int x, int y) {
            this.value = x;
            this.weight = y;
        }
    }

    double fractionalKnapsack(int weight, Item arr[], int n) {
        double W = (double) weight;
        double ratio[] = new double[n];
        Map<Double, Integer> map = new TreeMap<Double, Integer>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            ratio[i] = (double) arr[i].value / (double) arr[i].weight;
            if (map.get(ratio[i]) != null) {
                int index = map.get(ratio[i]);
                arr[index].value += arr[i].value;
                arr[index].weight += arr[i].weight;
            } else {
                map.put(ratio[i], i);
            }

        }
        double sum = 0;
        for (Map.Entry<Double, Integer> entry : map.entrySet()) {

            int i = entry.getValue();
            if (arr[i].weight <= W) {
                W -= arr[i].weight;
                sum += (double) arr[i].value;
            } else {
                sum += (double) arr[i].value * (double) ((double) W / (double) arr[i].weight);
                break;
            }

        }

        return sum;
    }
}
