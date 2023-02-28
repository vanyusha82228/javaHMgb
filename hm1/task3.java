package hm1;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите  первое число: ");
        double n1 = Double.parseDouble(sc.nextLine());


        System.out.println("Введите действие: ");
        String destv = sc.nextLine();

        System.out.print("Введите  второе число: ");
        double n2 = Double.parseDouble(sc.nextLine());

        sc.close();

        // if(destv ==" +")
        //     System.out.println(n1+n2);
        // else if(destv == "-")
        //     System.out.println(n1-n2);
        // else if(destv == "*")
        //     System.out.println(n1*n2);
        // else if(destv== "/")
        //     System.out.println(n1/n2);
        // else
        //     System.out.println("Некореутный ввод данных!");     
        switch (destv) {
            case "+":
                System.out.println(n1+n2);
                break;
            case "-":
                System.out.println(n1-n2);
                break;
            case "*":
                System.out.println(n1*n2);
                break;
            case "/":
                System.out.println(n1/n2);
                break;
            default:
                System.out.println("Некореутный ввод данных!"); 
        }
    
    }


}
