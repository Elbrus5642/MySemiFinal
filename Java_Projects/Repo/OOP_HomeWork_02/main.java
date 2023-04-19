package OOP_HomeWork_02;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        
        Cat cat1 = new Cat("Barsik", 15, false);
        Cat cat2 = new Cat("Murka", 20, false);
        Cat cat3 = new Cat("Rex", 25, false);
        List<Cat> homecats = new ArrayList<>();
        homecats.add(cat1);
        homecats.add(cat2);
        homecats.add(cat3);
        System.out.println("Коты перед едой: ");
        for (Cat item : homecats) {
            System.out.println(item.catFedInfo());
        }
        //Положить еду в миску
        Plate plate = new Plate(50);
        System.out.println(plate.infoPlate()); 
        /* cat1.eat();
        cat2.eat();
        cat3.eat(); */
        //Проверка правильности заполнения полей конструктора Cat
                     
        //Еда в миске уменьшается каждый раз, когда кот подходит поесть       
        
            for (Cat cat : homecats) {
                if (plate.getFood() >= cat.getAppetite()){
                plate.setFood(plate.getFood() - cat.getAppetite());
                cat.eat();
                System.out.printf(" Кот %s  наелся %b\n", cat.getName(), cat.getWellFedCat());
                } else {
                    System.out.printf(" Кот %s не поел  %b\n Покорми кота!\n", cat.getName(), cat.getWellFedCat());
                    //System.out.println("Покорми кота!");
                    System.out.printf("Добавь вкусняшек, в миске - %s, аппетит %s - %d\n", plate.infoPlate(), cat.getName(), cat.getAppetite());
                        if(plate.getFood() - cat.getAppetite() < 0){
                            plate.setFood(cat.getAppetite());
                            cat.eat();
                            System.out.printf(" Теперь и кот %s сытый и довольный %b\n", cat.getName(), cat.getWellFedCat());     
                            }
                        }
        
            } 
        }          
}
