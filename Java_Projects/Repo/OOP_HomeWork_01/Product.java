package OOP_HomeWork_01;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Product {
    /*
     * Характеристики продукта
     */
    protected String name;
    protected String brand;
    protected Double price;
    Integer fat;
    Integer energy;

    /*
     * Инициализатор  -  вспомогательные поля, необходимые для работы объекта,
     * и эти поля активируются в момент выбора любого конструктора
     */
    {
        System.out.println("Inicialisator");
        int param1 =100;
        String param2 = "....";
        boolean param3 = true;
        String param4 = "====";
    }
    
    
    /**
     * Конструктор класса Product
     */
    public Product(){
        this("Продукт");
        name = "Товар";
        brand = "ООО";
        price = 1.0;
       } 
    
       public Product(String name){
        this(name,1.0);
       }
   
       public Product(String name, Double price){
       this("Noname",name, price);
    }

    public Product(String brand, String name, Double price){
        System.out.println("Constructor");
        if(brand.length() < 3)
               this.brand  ="Noname";
           else
               this.brand = brand;
        
        if(name.length() < 3)
               this.name  ="Продукт";
           else
               this.name = name;

        if (price < 0.0)
            this.price =1.0;
        else
            this.price = price;
        }
    
     /**
     * Получить информацию по продукту
     */
     public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        if (price < 0.0){
        throw new RuntimeException("Цена указана некорректно!");
        }
        this.price = price;
    }

    public String getName(){
        return name;
    }
    
    public void setName(String  name){
        if(name.length() < 3)
         this.name  ="Продукт";
            else
         this.name = name;
    }
     
     void getMessage(){
        System.out.println("Добрый день!");
     }
    
     String displayInfo(){
        return String.format("%s  - %s - %f", brand, name, price);
    }

    
}
