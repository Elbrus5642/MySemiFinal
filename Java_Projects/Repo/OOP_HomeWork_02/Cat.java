package OOP_HomeWork_02;

public class Cat {
    private String name;
    private int appetite;
    private boolean wellfedcat;
    
    public Cat(String name, int appetite, boolean wellfedcat) {
        this.name = name;
        this.appetite = appetite;
        this.wellfedcat = wellfedcat;
    }
    
    public boolean eat() {
        return wellfedcat = true;
     }

     public String getName(){
        return name;
    }

     public Integer getAppetite(){
        return appetite;
    }
    public boolean getWellFedCat(){
        return wellfedcat;
    }


    public String catFedInfo(){
        return String.format("Cat - %s, Appetit - %d, WelFedCat - %b", name, appetite, wellfedcat);
    }
}
