package OOP_HomeWork_01;

import java.util.Arrays;
import java.util.List;

public class BottleOfWaterVendingMachine {
    
    private final List <Product> products;

    public BottleOfWaterVendingMachine(List <Product> products){
        this.products = products;
    }
    /*
     * Заказ на продукт из вендинг машины:
     */
    public BottleOfWater getBottleOfWater(String name, Integer volume){
        for (Product product : products) {
            if (product instanceof BottleOfWater){
                if(product.getName() == name && ((BottleOfWater)product).getVolume() == volume){
                return (BottleOfWater)product;
            }
        }
     }
     return null;
    }
}
