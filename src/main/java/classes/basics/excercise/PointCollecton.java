package classes.basics.excercise;

public class PointCollecton {

    Point[] points = new Point[100];
    int pointNumber = 0;

    void addPoints(Point...points){
        for (Point newPoint: points){
            this.points[pointNumber] = newPoint;
            pointNumber++;
        }
    }

    void printStars() {
        //wypisz najmniejszy i największy i średni dystans między punktami
        //nie porównuj unktów ze sobą tip: if(point1 != point)
        double max = Double.MAX_VALUE;
        double min = Double.MAX_VALUE;
        for (int i = 0; i < pointNumber; i++) {
            Point point1 = points[i];
            for (int j = 0; j < pointNumber; j++) {
                Point point2 = points[j];
                if (point1 == point2) {
                    continue;
                }
                double distance = point1.distenceTo(point2);
                if (distance < min) {
                    min = distance;
                }
                if (distance > max) {
                    max = distance;
                }
            }
        }

        System.out.println("Maksymalna odległośc wynosi " + max + ", minimalna wartosc wynosi " + min);

    }
    void printAllPoints(){
        //wypisać przykładowe punkty z kolekcji od 0 - this.pointNumber -1
        for(int i = 0; i < pointNumber; i++){
            printPoint(points[i]);

        }
    }

    void printPoint(Point point){
        System.out.println("Point(x: " + point.getX() + ", y: " + point.getY() +")");
    }
}
