import java.util.Scanner;
import java.util.Stack;

public class Task38_FreePractice {
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        boolean active =  true;
        String str_1 = "";
        String str_2 ="";
        String sign = "";
        while (active) { 
                    System.out.println("Введите число или \"stop\": ");
                    Scanner iScan =  new Scanner(System.in);
                    //str_1 = iScan.nextLine();
                    str_1 = iScan.nextLine();
                    int num_1 = Integer.parseInt(str_1);
                    int res = 0;
                    while (!str_1.equals("stop")) {
                            //int num_1 = Integer.parseInt(str_1);
                            System.out.println("Введите знак операции \"+\" или \"-\" или \"<-\" : ");
                            sign = iScan.next();
                            switch (sign) {
                                case "+":
                                  System.out.println("Введите ещё число: ");
                                  str_2 = iScan.next();
                                  int num_2 = Integer.parseInt(str_2);
                                  res =  num_1 + num_2; 
                                  st.push(res);
                                  num_1 = st.lastElement();
                                  //num_2 = 0;
                                  System.out.println("Результат вычислений: " + st.lastElement() + "\n");
                                  System.out.println("In stack:\n");
                                  System.out.println(st); 
                                  break;
                                case "-":
                                  System.out.println("Введите ещё число: ");
                                  str_2 = iScan.next();
                                  num_2 = Integer.parseInt(str_2);
                                  res = - num_2 + num_1;   
                                  st.push(res);
                                  num_1 = st.lastElement();
                                  //num_2 = 0;
                                  System.out.println("Результат вычислений: " + st.lastElement() + "\n");
                                  System.out.println("In stack:\n");
                                  System.out.println(st); 
                                    break;
                                case "<-":
                                  if (!st.empty()){
                                  st.pop();
                                  System.out.println("Отмена, предыдущий результат - " + st.lastElement());
                                  } else {
                                    System.out.println("Stack is empty!");
                                  }
                                  break; 
                                default:
                                    break;                                
                            } 
                               
                     } 
                          System.out.println("Ввод завершён!");
                          active =  false;
                          iScan.close(); 
                            
                }
        }
}