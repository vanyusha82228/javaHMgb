package hm1;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = Integer.parseInt(sc.nextLine());
        sc.close();
        System.out.printf("Cумма чисел равна %d\n",treug(n));

        System.out.printf("Факториал равен %d",factor(n));
    }
        public static int treug(int n) {
            int sum = 0;
            for (int i = 0; i <=n; i++) {
                sum+=i;
            }
            return sum; 
        }
        public static int factor(int n){
            if(n==0) return 1;
            return n* factor(n-1);
            }
          
        
    }

   
    


