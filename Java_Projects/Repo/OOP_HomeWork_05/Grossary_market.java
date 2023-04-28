import java.util.ArrayList;

import javax.swing.text.AbstractDocument.Content;

public class Grossary_market {

  private static void compareTwo(Box b1, Box b2){
    
    float a = b1.getBoxWeight(b1);
    float b = b2.getBoxWeight(b2);
    int res = Float.compare(a,b);
    if( res == 0) {
      System.out.println("\nTwo boxes have equal weights, TRUE");
    }else{
      System.out.println("\nTwo boxes have different weights, FALSE");
    }    
  }

  public static void main(String[] args) {

    Box<Apple> box1 = new Box<>("Box for Apples");
    System.out.println(box1.getName());
    System.out.printf("Box content: %d fruit\n", box1.count());
    box1.add(new Apple("Granny"));
    box1.add(new Apple("JS"));
    box1.add(new Apple("Winner"));

    System.out.println();
    System.out.println("Box contains: \n");
    for (int i = 0; i < box1.count(); i++) {
      System.out.println(box1.get(i));
    }

    Box<Apple> box2 = new Box<>("Box for Apples");
    box2.add(new Apple("Gala"));
    box2.add(new Apple("Global village"));
    box2.add(new Apple("Semerinka"));
    System.out.printf("Box containts: %d", box2.count(), "fruit", "\n");
    System.out.printf("\nApple weight is: %.2f", (box2.get(2)).getWeight());
    System.out.printf("\nBox weights %.2f kg", box2.getBoxWeight(box2));
    System.out.printf("\nBox containts Apples variety:  %s", box2.get(2));

    System.out.println();
    System.out.println("Box contains: \n");
    for (int i = 0; i < box2.count(); i++) {
      System.out.println(box2.get(i));
    }
    // Box of Oranges box3
    Box<Orange> box3 = new Box<>("Box for Oranges");
    System.out.println(box3.getName());
    System.out.printf("Box containts: %d fruit\n", box3.count());
    box3.add(new Orange("Moroc"));
    box3.add(new Orange("Greece"));
    box3.add(new Orange("Spain"));

    System.out.println();

    for (int i = 0; i < box3.count(); i++) {
      System.out.println(box3.get(i));
    }

    // Box of Oranges box4
    Box<Orange> box4 = new Box<>("Box for Oranges");
    System.out.println(box4.getName());
    box4.add(new Orange("Equador"));
    box4.add(new Orange("Costa-Rica"));
    box4.add(new Orange("Columbia"));
    System.out.printf("Box containts: %d fruit", box4.count());
    System.out.printf("\nOrange weight is: %.2f", (box4.get(1)).getWeight());
    System.out.printf("\nBox weights %.2f kg", box4.getBoxWeight(box4));
    System.out.printf("\nBox containts Oranges variety:  %s ", box4.get(1));

    System.out.println();

    for (int i = 0; i < box4.count(); i++) {
      System.out.println(box4.get(i));
    }
    System.out.println();
    System.out.println("-------------------------------------");
    System.out.println();

    System.out.println("Transfer fruit from one box to another:");
    // Transfer fruit from one box to another
    box3.merge(box4);
    System.out.printf("Now one box containts: %d fruit\n", box3.count());
    for (int i = 0; i < box3.count(); i++) {
      System.out.println(box3.get(i));
    }
    System.out.println();
    System.out.printf("Another box containts: %d fruit\n", box4.count());
    for (int i = 0; i < box4.count(); i++) {
      System.out.println(box4.get(i));
    }
    // Two box weights compare
    System.out.println("Two box weights compare");
    System.out.printf("\nFirst box: %s,  weight: %.2f", box1.getName(), box1.getBoxWeight(box1));
    System.out.printf("\nSecond box: %s,  weight: %.2f", box2.getName(), box2.getBoxWeight(box2));

    compareTwo(box1, box2);

    System.out.println("\nTwo box weights compare");
    System.out.printf("\nFirst box: %s,  weight: %.2f", box1.getName(), box1.getBoxWeight(box1));
    System.out.printf("\nSecond box: %s,  weight: %.2f", box3.getName(), box3.getBoxWeight(box3));
    
    //Compare two boxe
    compareTwo(box1, box3);
    
    /* int res = box1.getBoxWeight(box1).compareTo(box3.getBoxWeight(box3));
    if( res == 0) {
      System.out.println("\nTwo boxes have equal weights, TRUE");
    }else{
      System.out.println("\nTwo boxes have different weights, FALSE");
    }     */
  }

}
