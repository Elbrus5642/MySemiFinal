package OOP_HomeWork_01;

public class BottleOfWater extends Product{
    private Integer volume;

    public BottleOfWater(String name, double price, Integer volume){
        super(name, price);
        this.volume =  volume;
    }
    
    public Integer getVolume(){
        return volume;
    }

    @Override
     String displayInfo(){
        return String.format("%s - %s -  %f -  объём  %d", brand, name, price, volume);
    }
}
