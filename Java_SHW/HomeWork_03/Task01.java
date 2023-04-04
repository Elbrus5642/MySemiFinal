import java.util.ArrayList;
import java.util.Random;

/*Дан произвольный список целых чисел, удалить из него чётные числа */
/**
 * Task01
 */
public class Task01 {

    public static void main(String[] args) {
        ArrayList <Integer> numlist = new ArrayList<>(10);
        ArrayList <Integer> new_numlist = new ArrayList<>();
        Random rand =  new Random();
            for (int i = 0; i < 10; i++) {
                numlist.add(rand.nextInt(0,100));
            }
        System.out.printf("Список случайных чисел BEFORE проверки на чётность: "+ "\n");
                for (int i= 0;  i < 10; i++) {
                    System.out.printf("%d ", numlist.get(i));
                }
                    System.out.printf("Остатки от деления на \"2\": "+ "\n");
                    for (Integer item : numlist) {
                        System.out.printf("%d ", item%2);
                    }
                    for (int j = 0; j < numlist.size(); j++) {
                        if (numlist.get(j)%2 != 0){
                            new_numlist.add(numlist.get(j));
                        }
        }
        System.out.printf("Список случайных чисел AFTER проверки на чётность: "+ "\n");
        for (Integer item : new_numlist) {
            System.out.printf("%d ", item);
        } 



        /*System.out.println(rand_numlist);
            for (int z = 0; z < numlist.size(); z++) {
                if ((numlist.get(z))/2 == 0 ){
                    numlist.remove(z);
                } 
            }
        System.out.printf("\n" + "Список случайных чисел AFTER проверки на чётность: "+"\n");
            for (int   j = 0;  j < numlist.size(); j ++) {
                System.out.printf("%d ", numlist.get(j));
            }*/
    }
}
