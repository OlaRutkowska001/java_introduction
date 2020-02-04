package myPackage;

public class TwoTriangle {
    public static void main(String[] args) {
        char triangle[][] = new char[][]{
                {'*', '*','*','*','*','*'},
                {' ', '*','*','*','*','*'},
                {' ', ' ','*','*','*','*'},
                {' ', ' ',' ','*','*','*'},
                {' ', ' ',' ',' ','*','*'},
                {' ', ' ',' ',' ',' ','*'},
        };

        for (int i = 0; i<triangle.length ; i++) {
            for (int j = 0; j < triangle[i].length; j++) {

                System.out.print(triangle[i][j]);
            }
                System.out.println();



        }
    }
}
