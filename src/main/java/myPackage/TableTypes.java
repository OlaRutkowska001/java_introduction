package myPackage;

public class TableTypes {
    public static void main(String[] args) {
        int a =9;
        byte b= 1;
        short c=7;
        long d = 10000L;
        double e= 1000D;
        float f = 78.8F;

        double [] tablica = {a,b,c,d,e,f};

        double suma = 0;
        suma = a + b + c + d + e +f;
        System.out.println("Suma liczb wynosi " + suma);



        for (int i=0; i < 5; i++) {
            tablica[i] = i + 1;
           {
                System.out.print(tablica[i]);
            }
            System.out.println();
        }
    }
}





