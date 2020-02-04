package classes.basics.excercise;

import classes.basics.User;

public class Test {

    //statyczne mogą tylko tu dziaać
    public static void main(String[] args) {
        Point point1 = new Point(3.0D, 1.0D);
        Point point2 = new Point(4.0D, 7.0D);

        User user = new User("Janek", "Kowalaski", 23);

        double distance = Point.distance(point1,point2);
        System.out.println("Dystans wynosi " + distance);

        distance = point1.distenceTo(point2);
        System.out.println(distance);

        distance = point2.distenceTo(point1);
        System.out.println(distance);

        PointCollecton pointCollecton = new PointCollecton();
        pointCollecton.addPoints(point1);
        pointCollecton.addPoints(point2,point1);
        pointCollecton.addPoints(new Point[] {point1,point2});
        pointCollecton.addPoints(new Point(5.D,7.0D));

        pointCollecton.printStars();




    }
}
