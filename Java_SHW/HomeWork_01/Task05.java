import java.util.Scanner;
public class Task05 {
    static double factor (int n) {
        if (n == 1)  return 1;
            return n * factor(n-1);
        }

    public static void main(String[] args) {
                 
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите целое число: ");
        boolean flag = iScanner.hasNextInt();
        System.out.println(flag);
        Integer number  = iScanner.nextInt();
        String res = "Ваше число: " + number;
        System.out.println(res);
        iScanner.close();
        int i = 0;
        int summa = 0;
        while (i < number ) {
            summa += i;
            ++i;
            }
        String output_res ="Сумма всех чисел до числа " + number + " равна " + summa;
        System.out.println(output_res);
        String output_factorial = "Факториал числа " + number + " равен " + factor(number);
        System.out.println(output_factorial);   
        }
        
    }

