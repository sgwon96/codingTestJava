package Sort;

import java.util.*;


class Fruit implements Comparable<Fruit> {

    private String name;
    private int score;

    public Fruit(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public int compareTo(Fruit other) {
        if (this.score < other.score) {
            return -1;
        }
        return 1;
    }
}


public class BasicSort {

    public static void main(String[] args) {
        int n = 10;
        int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

        List<Fruit> fruits = new ArrayList<>();

        fruits.add(new Fruit("바나나", 2));
        fruits.add(new Fruit("사과", 5));
        fruits.add(new Fruit("당근", 3));

        Collections.sort(fruits);
        Arrays.sort(arr);

        for(int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

        System.out.println();

        for (int i = 0; i < fruits.size(); i++)
            System.out.print("(" + fruits.get(i).getName() + "," + fruits.get(i).getScore() + ") ");



    }
}
