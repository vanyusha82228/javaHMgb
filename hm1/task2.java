package hm1;
public class task2{
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 1000 are : ");
        for(int i=1; i <= 1000; i++){
            boolean isPrime = true;
            for(int j=2; j < i ; j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) System.out.print(i + " ");
        }
    }
}
    