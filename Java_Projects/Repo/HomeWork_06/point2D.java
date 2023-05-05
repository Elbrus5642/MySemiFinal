package HomeWork_06;
/*
 * Это класс  -  Точка
 */
public class point2D {
    int x;
    int y;
    /**
     * "Это конструктор координат точки"
     * @param ValueX
     * @param ValueY
     */
     public point2D(int ValueX, int ValueY) {
        x = ValueX;
        y = ValueY;

    }
    
    public point2D(int value) {
        this(value, value);
    }

public point2D() {
    this(0);
  }
 /**
  * Прочитать значение по Х
  * @return
  */
 public int getX(){
    return x;
 } 
 /**
  * Прочитать значение по У
  * @return
  */
 public int getY(){
    return y;
 } 
/**
 * Изменить значение по Х
 * @param value это значение Х
 */
 public void setX(int value){
    this.x = value;
     }
/**
 * Изменить значение по У
 * @param value
 */     
public void setY(int value){
        this.y = value;
         }

    /* public point2D() {
        this.x = 0;
        this.y = 0;
     }

    public point2D(int Value) {
        this.x = Value;
        this.y = Value; */
    
    /**
     * Получить информацию о координатах точки в правильном виде
     * @return
     */
   public String getInfo(){
    return String.format("x:%d ;  y:%d", x,y);
   }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return getInfo();
    }

    public static Double distance(point2D a, point2D b) {
        return null;
    }
}
