/*
 * Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
Добавить функции 1) Добавление номера
2) Вывод всего
Пример:
Я ввожу: 1
К: Введите фамилию
Я: Иванов
К: Введите номер
Я: 1242353
К: Введите 1) Добавление номера
2) Вывод всего
Я ввожу: 1
К: Введите фамилию
Я: Иванов
К: Введите номер
Я: 547568
К: Введите 1) Добавление номера
2) Вывод всего
 */

package HomeWork_05;

import java.util.*;

public class Task32_FreePractice {
    public static void main(String[] args) {
        //List<Integer> list_1 =  new ArrayList<>(10);
        HashMap <String, List<String>> db =  new HashMap<>(10);
        Scanner iScan  =  new Scanner(System.in);
        boolean flag = true;
                while(flag) {
                    Integer choice = 0;
                    String  name ="";
                    System.out.printf("Введите %d чтобы  добавить фамилию и/или номер,  вывод всего: %d\n", 1,2);
                    choice = iScan.nextInt();
                    System.out.println(choice);
                       if (choice == 1) {
                                    // List<Integer> list_1 =  new ArrayList<>();
                                        System.out.println("Введите фамилию: ");
                                        name = iScan.next();      
                                        System.out.println("Введите номер: ");
                                        String num  = iScan.next();
                                        if (db.isEmpty()) {
                                            // Фамилия и имя в спрфвочнике
                                            List<String> list_1 =  new ArrayList<>();
                                            list_1.add(num);
                                            db.put(name, list_1);
                                        } else {
                                            if (db.containsKey(name)) {
                                                List<String> temp =  db.get(name);
                                                temp.add(num);
                                                db.put(name, temp);

                                            } else {
                                                List<String> temp =  new ArrayList<>();
                                                temp.add(num);
                                                db.put(name, temp);
                                            }
                                            
                                        }
                                                                                                              
                                        System.out.println("Ввод завершён!");
                                        //System.out.println("Для продолжения ввода номеров \"yes\" для отмены\"no\": ");
                                        //flag = iScan.next();
                                        //list_1.clear();
                                        System.out.println(db);
                                    } else {  
                                             flag = false; 
                                             System.out.println("Ввод завершён!");                 
                                             iScan.close();     
                                             System.out.println("Вывод всего: ");
                                             for (var item : db.entrySet()) {
                                                     System.out.println(item.getKey() + " : " + (item.getValue()).toString()); 
                                                 }

                                         }             
                        
                }
                   
    }
}
 