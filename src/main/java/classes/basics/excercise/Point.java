package classes.basics.excercise;

public class Point {

    private double x;
    private double y;
//stworzyłam klasę :D
    public Point (double x, double y){
//this to słowo kluczowe do objety w tej klasie
        this.x = x;
        this.y = y;

    }

    public static double distance(Point point1, Point point2){
        return Math.sqrt(Math.pow(point1.x - point2.x,2) + Math.pow(point1.y - point2.y,2));

    }
    //matody mogą mieć różne parametry a nazwy te same
    public double distenceTo(Point other){
        return distance(this,other);
    }

    public String toString(){

        return "Point(x: " + x + ", y: " + y + ")";
    }
    public double getX() {
        return x;

    }
    public double getY() {
        return y;
    }

}
