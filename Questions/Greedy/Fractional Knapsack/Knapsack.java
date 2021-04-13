// Question Link : https://practice.geeksforgeeks.org/problems/fractional-knapsack-1587115620/1

import java.io.*;
import java.util.*;

class Item {
    int value, weight;

    Item(int x, int y) {
        this.value = x;
        this.weight = y;
    }
}

public class Knapsack {

    public static double fractionalKnapsack(int weight, Item arr[], int n) {

        double W = (double) weight;
        double ratio[] = new double[n];

        Map<Double, Integer> map = new TreeMap<Double, Integer>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            ratio[i] = (double) arr[i].value / (double) arr[i].weight;
            if (map.get(ratio[i]) != null) {
                // increase weight and value of similar ratio item
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

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        Item arr[] = new Item[3];

        arr[0] = new Item(60, 40);
        arr[1] = new Item(100, 50);
        arr[2] = new Item(120, 60);

        System.out.println(fractionalKnapsack(100, arr, 3));
    }
}
