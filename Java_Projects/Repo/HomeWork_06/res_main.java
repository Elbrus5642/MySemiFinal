package HomeWork_06;

import java.util.ArrayList;
import java.util.Arrays;

public class res_main {
    public static void main(String[] args) {
        res res = new res("Neva", "Caucasus", "10:00");
        res res_1 =  new res("Dolphin", "Seafood", "12:00");
        res res_2 =  new res("KFC","Fastfood", "14:00");
        //ArrayList <String> rest_list = new ArrayList<>(Arrays.asList(res_1.getName(), res_2.getName(), res.getName()));
        System.out.println(res_1);
        System.out.println(res_1.getOpentime());
        System.out.println(res.getName());
        System.out.println(res_2.getCuisine());
        System.out.println(res_2.getName());
        res_2.setName("Odojevsky");
        ArrayList <String> rest_list = new ArrayList<>(Arrays.asList(res_1.getName(), res_1.getOpentime(), res.getCuisine()));
        System.out.println(res_2);
        for (String item : rest_list) {
          System.out.println(item);
        }
      }
  
}
