package OOP_HomeWork_01;

import java.util.ArrayList;
import java.util.List;

public class Main {
  /**
   * @param args
   */
  public static void main(String[] args) {
    /*
     * Конструктор класса Product - особый метод - называется
     * также как class;
     * нет возвращаемого параметра
     */
    Product product1 = new Product();
    System.out.println(product1.displayInfo());

    Product product2 = new Product("Бутылка с молоком", 200.0);
    System.out.println(product2.displayInfo());

    Product product3 = new Product("JS", "HD", 35.0);
    System.out.println(product3.displayInfo());

    product3.setPrice(100.5);
    product3.setName("QQ");
    System.out.println(product3.displayInfo());

    BottleOfWater bottleOfWater1 = new BottleOfWater("H2O", 50.0, 2);
    Product bottleOfWater2 = new BottleOfWater("H2O", 70, 2);
    System.out.println(bottleOfWater1.displayInfo());

    Product bottleOfMilk1 = new BottleOfMilk("Молоко", 200, 1, 10);
    System.out.println(bottleOfMilk1.displayInfo());

    ChocolateBar chocolateBar1 = new ChocolateBar("Milka", 79.0, 55, 85);
    ChocolateBar chocolateBar2 = new ChocolateBar("Osobij", 89.0, 35, 90);
    ChocolateBar chocolateBar3 = new ChocolateBar("Fazer", 179.0, 85, 200);
    ChocolateBar chocolateBar4 = new ChocolateBar("Alenka", 90.0, 95, 120);
    ChocolateBar chocolateBar5 = new ChocolateBar("White bear", 250.0, 100, 220);

    List<Product> products = new ArrayList<>();
    products.add(bottleOfWater2);
    products.add(bottleOfMilk1);

    List<Product> products1 = new ArrayList<>();
    products1.add(chocolateBar1);
    products1.add(chocolateBar2);
    products1.add(chocolateBar3);
    products1.add(chocolateBar4);
    products1.add(chocolateBar5);

    for (Product item : products1) {
      System.out.println(item.displayInfo());
    }
    /*
     * Автомат по продаже шоколада:
     */
    ChocolateBarVendingMachine machine1 = new ChocolateBarVendingMachine(products1);

    ChocolateBar ChocolateBarRes = machine1.getChocolateBar("Fazer", 85);
    if (ChocolateBarRes != null) {
      System.out.println("Вы купили:");
      System.out.println(ChocolateBarRes.displayInfo());
    } else {
      System.out.println("Такого шоколада в автомате нет");
    }

    BottleOfWaterVendingMachine machine = new BottleOfWaterVendingMachine(products);

    BottleOfWater bottleOfWaterres = machine.getBottleOfWater("H2O", 2);
    if (bottleOfWaterres != null) {
      System.out.println("Вы купили:");
      System.out.println(bottleOfWaterres.displayInfo());
    } else {
      System.out.println("Такой бутылки в автомате нет");
    }

  }

}
