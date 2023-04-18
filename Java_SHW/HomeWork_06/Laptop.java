package HomeWork_06;

public class Laptop {
   
    String note_Brand;
    String note_DDR;
    String note_HDD;
    String note_OS;
    String note_color;
   
    public Laptop (String feat_0, String feat_1, String feat_2, String feat_3,String feat_4) {
       note_Brand = feat_0;
       note_DDR = feat_1;
       note_HDD = feat_2;
       note_OS  = feat_3;
       note_color = feat_4;
    }
    
    public String customer_hello(){
        return String.format("Добрый день!");
    }
    private String getInfo(){
        return String.format( "Brand: %s, DDR: %s, HDD: %s, OS: %s, color: %s", note_Brand, note_DDR, note_HDD, note_OS,note_color);
    }
     
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return getInfo();
    }

    public String getBrand(){
        return note_Brand;
    }

    
    public String getDDR(){
        return note_DDR;
    }

    public String getHDD(){
        return note_HDD;
    }

    public String getOS(){
        return note_OS;
    }

    public String getColor(){
        return note_color;
    }

}
