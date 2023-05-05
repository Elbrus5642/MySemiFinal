package HomeWork_06;

import java.sql.Time;

public class res {
    private String restautant_name;
    private String cuisine_name;
    private String open_time;
   

    public res(String restautant_name, String cuisine_name, String open_time) {
        this.restautant_name = restautant_name;
        this.cuisine_name = cuisine_name;
        this.open_time = open_time;
           }

    
    //public res(String sring1, String string2, String string3) {
    //}


    public String  getName(){
        return restautant_name;

    }

    public void setName(String restaurat_name){
        this.restautant_name = restaurat_name;
    }
    public String  getCuisine(){
        return cuisine_name;
    }
    
    public String getOpentime(){
        return open_time;
    }
    
    @Override
    public String toString() {
        return (this.restautant_name + " <- " + "Restaurant" + " -> " + "Cuisine: " + this.cuisine_name);
    }
   
}
