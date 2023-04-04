import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

import javax.lang.model.SourceVersion;

/**
 * Task02
 */
public class Task02 {

    public static void main(String[] args) {
        ArrayList <Integer> list =new ArrayList<>();
        Random rnd =  new Random();
        for (int j= 0; j < 10; j++) {
            list.add(rnd.nextInt(0,100));
        }
        System.out.println(list);
        list.sort(Comparator.reverseOrder());
        System.out.println("Max: ");
        System.out.println(list.get(0));
        System.out.println("Min: ");
        System.out.println(list.get(list.size()-1));
        System.out.println("Average:  ");
        int sum = 0;
        double average = 0;
        for (int i = 0; i < list.size(); i++) {
           sum  = sum + list.get(i);
        }
        System.out.println("Summa:  ");
        System.out.println(sum);
        System.out.printf("Numbers quantity: %d", list.size());
        average = sum/(list.size());
        System.out.println("\n" + average);
    }
}
