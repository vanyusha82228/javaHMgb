package hm4;
// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class task2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        LinkedList<Integer> linkList = new LinkedList<>();
        while(true){
            System.out.println("Введите что вы хотите делать(цифру от 1 до 3): ");
            int num = sc.nextInt();
            if(num==1){
                System.out.println("Введите элемент: ");
                int value = sc.nextInt();
                enqueue(linkList, value);
                System.out.println(linkList.toString());
            }
            else if(num==2){
                System.out.println("возвращает первый элемент из очереди и удаляет его ");
                dequeue(linkList);
                System.out.println(linkList.toString());
            }

            else if(num==3){
                System.out.println(" возвращает первый элемент из очереди, не удаляя. ");
                int firstEl = first(linkList);
                System.out.println(firstEl);
                System.out.println(linkList.toString());
            }
            else 
                System.out.println("eror");
        }
    }

    public static void enqueue(LinkedList<Integer> linkList, int num) {
        linkList.add(num);
    }
    public static void dequeue(LinkedList<Integer> linkList) {
        linkList.removeFirst();
    }
    private static int first(LinkedList<Integer> linkList) {
        return linkList.getFirst();
    }
 
}