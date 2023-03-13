import java.util.ArrayList;
import java.util.Random;

//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка
public class task2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        randIntnum(10, 30, list);
        printArray(list);
        System.out.println();
        System.out.println("Max value: " + maxValue(list));
        System.out.println("Min value: " + minValue(list));
        System.out.println("AVG: "+ avg(list));
        
    }
    public static void randIntnum(int value, int maxValue, ArrayList<Integer> list) {
        Random random = new Random();
        for (int i = 0; i < value; i++) {
            list.add(random.nextInt(maxValue));
        }
    }
    public static int maxValue(ArrayList<Integer> list) {
        int maxValue = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)>maxValue)
                maxValue = list.get(i);
        }
        return maxValue;
        
    }
    public static int minValue(ArrayList<Integer> list) {
        int minValue = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)<minValue)
                minValue = list.get(i);
        }
        return minValue;
        
    }
    public static double avg(ArrayList<Integer> list) {
        int sumValue = 0;
        for (int i = 0; i < list.size(); i++){
            sumValue += list.get(i); 
        }
        double avgValue = sumValue/list.size();
        return avgValue;
    }
    public static void printArray(ArrayList<Integer> list) {
        for (Integer value : list) {
            System.out.print(value + " ");
        }
        
    }
}
