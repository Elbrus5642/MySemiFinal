import java.util.Scanner;
/**
 * Task09_FreePractice
 */
public class Task09_FreePractice {

    public static void main(String[] args) {
                Scanner inScanner = new Scanner(System.in);
                System.out.println("Дальше решение выражения q + w = e, q, w, e > = 0");
                System.out.println("Некоторые цифры могут быть заменены знаком вопроса, знак вопроса - одинаковая цифра,     например 2? + ?5 = 69 , под нком вопроса цифра 4");
                System.out.println("Введите первое двузначное число со знаком вопроса  ");
                String str_num_1 = inScanner.next();
                System.out.println("Введите второе двузначное число со знаком вопроса  ");
                String str_num_2 = inScanner.next();
                System.out.println("Введите сумму двух чисел: ");
                String str_sum = inScanner.next();
                inScanner.close();
            System.out.printf("%s + %s = %s\n", str_num_1, str_num_2, str_sum);
            String str_1 = new String("");
            String str_2 = new String(""); 
            int count = 0;
            int res = 0;
            boolean flag_1 =  true;

                while (count < 10) {
                    str_1 =  str_num_1.replace("?", Integer.toString(count));
                    str_2 =  str_num_2.replace("?", Integer.toString(count));
                    res = Integer.parseInt(str_1) + Integer.parseInt(str_2);
                    if (Integer.toString(res).equals(str_sum)){
                        //System.out.printf("\n%d", res);
                        System.out.printf("Уравнение  имеет решение: " + str_1 + " + " +  str_2 + " = " + Integer.toString(res)+"\n");
                        break;
                        } 
                    else {
                            count += 1;
                            if (count ==10){ 
                                 flag_1 = false;
                            }
                        } 
                        
            if (flag_1 == false){
                String equation ="Уравнение " + str_num_1 + " + " + str_num_2 + " = " + str_sum + " решения не имеет"; 
                System.out.println(equation); 
                            }        
                        
                }
            
    }
}