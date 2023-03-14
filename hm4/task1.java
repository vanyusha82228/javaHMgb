package hm4;
//Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список
import java.util.LinkedList;
import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        LinkedList<Integer> linkList = new LinkedList<>();
        randNum(10, 50, linkList);
        
        LinkedList<Integer> newL = revL(linkList);
        System.out.println(linkList.toString());
        System.out.println(newL.toString());

    }

    public static void randNum(int value, int maxValue, LinkedList<Integer> linkList) {
        Random random = new Random();
        for (int i = 0; i < value; i++) {
            linkList.add(random.nextInt(maxValue));
        }    
    }

    public static LinkedList<Integer> revL(LinkedList<Integer> linkList) {
        LinkedList<Integer> newLinkList = new LinkedList<>();
        for (int i = linkList.size(); i >0 ; i--) 
            newLinkList.add(linkList.get(i-1));

        return newLinkList;
    }
   
}