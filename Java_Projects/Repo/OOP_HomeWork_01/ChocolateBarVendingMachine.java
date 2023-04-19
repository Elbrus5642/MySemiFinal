package OOP_HomeWork_01;

import java.util.List;

public class ChocolateBarVendingMachine {
    private final List<Product> products;

    public ChocolateBarVendingMachine(List<Product> products) {
        this.products = products;
    }

    /*
     * Заказ на продукт из вендинг машины ChocolateBarVendingMachine :
     */
    public ChocolateBar getChocolateBar (String name, Integer energy){
        for (Product product : products) {
            if (product instanceof ChocolateBar){
                if(product.getName() == name && ((ChocolateBar)product).getEnergy() == energy){
                return (ChocolateBar)product;
            }
        }
     }
     return null;
    }
}
