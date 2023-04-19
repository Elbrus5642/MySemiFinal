package OOP_HomeWork_02;

public class Plate {
    public int food;
    
    public Plate(int food) {
        this.food = food;
    }
    
    public  Integer getFood(){
        return food;
    }

    public void setFood(Integer food){
        System.out.println("Молодец, угостил кота вкусняшками!");
        this.food = food;
    } 

    public String  infoPlate() {
        return String.format("plate: " + food);
    }
}
