package hm2;

import java.io.File;
// import java.util.logging.Logger;
import java.io.PrintWriter;

public class task1 {
    public static void main(String[] args) {
        int[] array = new int[] {2, 1, 4, 7, 3, 8, 10, 5};
        // Logger loger = Logger.getLogger(task1.class.getName());

    try{
        File file = new File("log.txt");
        PrintWriter printWriter = new PrintWriter(file);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if(array[j+1]<array[j]){
                    int temp = array[j];
                    array[j]= array[j+1];
                    array[j+1]=temp;

                    printWriter.print("Iteration " + i + ": ");
                    for (int k = 0; k < array.length; k++) {
                        printWriter.print(array[k]+"");
                    printWriter.println();
                    }
                }
            }
        }

        printWriter.close();
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i]+" ");
    }
    catch(Exception e){
        System.out.println("что-то не так");
    }
}
}
