package HomeWork_06;

public class program {
    static Double distance(point2D a, point2D b){
        return Math.sqrt(Math.pow(a.x - b.x,2 ) + Math.pow(a.y -b.y,2));
    }
    public static void main(String[] args) {
        point2D a = new point2D(10,20);
        //System.out.println(a.x + " " + a.y);
        System.out.println(a);
        a.setX(0);
        a.setY(2);
        point2D b =  new point2D(0);
        System.out.println(b);
        System.out.println(b.getX());
        System.out.println(b.getY());
        //System.out.println(b.x + " " + b.y);
        System.out.printf(a.getInfo(),b.getInfo());
        System.out.println("\n" + distance(a, b));
        var dis  =  point2D.distance(a,b);
        System.out.println(dis);
    }
}
