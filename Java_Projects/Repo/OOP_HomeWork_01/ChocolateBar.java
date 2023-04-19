package OOP_HomeWork_01;

public class ChocolateBar extends Product  {
    /*
     * Новые поля для ChocolateBar -  калорийность (energy) и вес (weight)
     */
    private Integer energy;
    private Integer weight;
   
    public ChocolateBar(String name, Double price, Integer energy, Integer weight){
        super(name, price);
        this.energy = energy;
        this.weight = weight;
    }
    
    public Integer getEnergy(){
        return energy;
    }

    public Integer getWeight(){
        return weight;
    }


    @Override
     String displayInfo(){
        return String.format("%s - %s -  %f -  калорийность kJ - %d", brand, name, price, energy);
    }

}
