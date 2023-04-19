package OOP_HomeWork_01;

public class BottleOfMilk  extends Product {
    private Integer volume;
    private Integer fat;

    public BottleOfMilk(String name, double price, Integer volume, Integer fat){
        super(name, price);
        this.volume =  volume;
        this.fat = fat;
    }
    
    public Integer getVolume(){
        return volume;
    }
    public Integer getFat(){
        return fat;
    }


    @Override
     String displayInfo(){
        return String.format("%s - %s -  %f -  жирность  %d", brand, name, price, fat);
    }
}
