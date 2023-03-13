import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Пусть дан произвольный список целых чисел, удалить из него четные числа

public class task1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        randIntnum(10, 100, list);
        printArray(list);
        System.out.println();
        delNum(list);
        printArray(list);
    }
    public static void delNum(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)%2==0){
                list.remove(i);
                i--;
            }
        }
    }
    public static void randIntnum(int value, int maxValue, ArrayList<Integer> list) {
        Random random = new Random();
        for (int i = 0; i < value; i++) {
            list.add(random.nextInt(maxValue));
        }
    }
    public static void printArray(ArrayList<Integer> list) {
        for (Integer value : list) {
            System.out.print(value + " ");
        }
        
    }
}
