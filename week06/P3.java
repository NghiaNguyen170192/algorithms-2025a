package week06;

// knapsack
public class P3 {
    Item[] items;
    boolean[] bestSubset;
    int maxValue;
    int capacity;

    public P3(Item[] items, int capacity) {
        this.items = items;
        bestSubset = new boolean[items.length];
        this.capacity = capacity;
        maxValue = 0;
    }

    public void start() {
        subset(new boolean[items.length], 0);
    }

    void subset(boolean[] selected, int idx) {
        if (idx == items.length) {
            process(selected);
            return;
        }

        // Not selected
        selected[idx] = false;
        subset(selected, idx + 1);

        // Selected
        selected[idx] = true;
        subset(selected, idx + 1);
    }

    void process(boolean[] selected) {
        int weight = 0, value = 0;
        for (int i = 0; i < selected.length; i++) {
            if (selected[i]) {
                weight += items[i].weight;
                value += items[i].value;
                if (weight > capacity) {
                    return;
                }
            }
        }
        if (value > maxValue) {
            maxValue = value;
            bestSubset = selected.clone();
        }
    }

    void displayBest() {
        StringBuilder res = new StringBuilder("Best subset:");
        int totalWeight = 0;
        for (int i = 0; i < bestSubset.length; i++) {
            if (bestSubset[i]) {
                totalWeight += items[i].weight;
                res.append(String.format(" item(weight: %d, value: %d)", items[i].weight, items[i].value));
            }
        }
        res.append(String.format(" with total weight %d and total value %d", totalWeight, maxValue));
        System.out.println(res);
    }

    public static void main(String[] args) {
        Item[] items = new Item[]{
                new Item(7, 42),
                new Item(3, 12),
                new Item(4, 40),
                new Item(5, 25)
        };
        P3 knapsack = new P3(items, 7);
        knapsack.start();
        knapsack.displayBest();
    }
}

class Item {
    int weight;
    int value;

    public Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }
}