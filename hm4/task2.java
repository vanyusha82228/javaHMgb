package hm4;

import java.util.LinkedList;
import java.util.Random;

public class task2 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        randFillList(10, 100, ll);

        System.out.println(ll);

        enqueue(ll, 0);
        System.out.println(ll);

        System.out.println(dequeue(ll));
        System.out.println(ll);

        System.out.println(first(ll));
    }

    public static void enqueue(LinkedList<Integer> list, int value) {
        list.add(value);
    }

    public static int dequeue(LinkedList<Integer> list) {
        return list.removeFirst();
    }

    public static int first(LinkedList<Integer> list) {
        return list.getFirst();
    }

    public static void randFillList(int count, int maxValue, LinkedList<Integer> list) {
        Random rand = new Random();
        
        for (int i = 0; i < count; i++) {
            list.add(rand.nextInt(maxValue));
        }
    }
}