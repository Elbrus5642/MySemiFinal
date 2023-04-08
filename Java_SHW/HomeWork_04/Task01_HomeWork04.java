import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

/**
 * Task30_FreePractice
 */
public class Task01_HomeWork04 {

    public static void main(String[] args) {
        LinkedList <Integer> ll =  new LinkedList <Integer >(); 
        Random rnd = new Random();
        System.out.println("Введите количество чисел в последовательности: ");
        Scanner iS =  new Scanner(System.in);
        boolean flag = iS.hasNextInt();
        System.out.println(flag);
        
        int num  =  iS.nextInt();

            for ( int g = 0; g < num; g++) {
                ll.add(rnd.nextInt(0,10));
            }
            System.out.println("Последовательность случайных чисел в RIGHT порядке: ");
            System.out.println(ll);
            LinkedList <Integer>ll_b =  new LinkedList<Integer>();
            for (Integer Item: ll) {
                ll_b.addFirst(Item);
            } 
        System.out.println("Последовательность случайных чисел в BACK порядке: ");
        System.out.println(ll_b);   
        iS.close(); 
    }
         

}
