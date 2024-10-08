import java.util.Scanner;

public class Task035 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//a)
        double x = scanner.nextDouble();

        double y = scanner.nextDouble();

        double z = scanner.nextDouble();

        double a = x + y + z;

        double b = x * y * z;

        if ( a > b ) {
            System.out.println("max)"+a);
        }
        if( b > a ) {
            System.out.println("max)"+b);
        }
//b)

        a = (x+y+z)/2+1;

        b = (x*y*z)/2+1;

        if ( a < b ){
            System.out.println("min)"+a);
        }
        if ( b < a ){
            System.out.println("min)"+b);
        }



        scanner.close();
    }
}
