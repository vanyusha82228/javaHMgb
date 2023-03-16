package hm5;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> multiMap = new HashMap<>();
        Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8);
        boolean chek = true;
        while (chek) {
            System.out.println("Введите число 1 для добавлени, 2- для вывода, для выхода-0 ");
            String num = sc.nextLine();
            switch (num) {
                case "1":
                    addCont(multiMap, sc);
                    break;
                case "2":
                    outputOfAllNumbers(multiMap);
                    break;
                case "0":
                    chek = false;
                    System.out.println("пока");
                    break;
                default:
                    System.out.println("Такой команды нет!");
            }
        }
        sc.close();
    }

    public static void addCont(Map<String,ArrayList<String>> map, Scanner sc) {
        ArrayList<String> numberList = new ArrayList<>();
        boolean examination = true;
        while(examination){
            System.out.println("Для введения нового контакта нажмите-1, для добавления номера в существующий жамите-2, для выхода в главное меню-0");
            String value = sc.nextLine();
                switch (value) {
                    case "1":
                        System.out.print("Введите фамилию:");
                        String secondName = sc.nextLine();
                        System.out.print("Введите введите номер:");
                        String numberPhone = sc.nextLine();
                        numberList.add(numberPhone);
                        map.put(secondName, numberList);
                        break;
                    case "2":
                        System.out.print("Введите фамилию:");
                        String secondName1 = sc.nextLine();
                        System.out.print("Введите введите номер:");
                        String newNumberPhone = sc.nextLine();
                        map.get(secondName1).add(newNumberPhone);
                        break;
                    case "0":
                        examination = false;
                        System.out.println("Вы в главном меню");
                        break;
                    default:
                        System.out.println("Такой команды нет!");
                }
            }
        }
    

    public static void outputOfAllNumbers(Map<String,ArrayList<String>> map) {
        System.out.println();

        for(Map.Entry<String,ArrayList<String>>entry : map.entrySet()){
            System.out.println("Фамилия: "+ entry.getKey() + "Телефоны: "+ entry.getValue());
        }
    }

}
