import java.util.Scanner;

public class Task034 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /////////////////////////////////////////

        double x = scanner.nextDouble();

        double y = scanner.nextDouble();

        double z = scanner.nextDouble();
////a)
        if( x > y && x > z  ) {
            System.out.println("а)"+x);
        }
        if ( y > x  &&  y > z ) {
            System.out.println("а)"+y);
        }

        if ( z > x && z > y  ) {
            System.out.println( "а)"+z);
        }

//b)

        if( x < y && x < z  ) {
            System.out.println("б)"+x);
        }
        if ( y < x  &&  y < z ) {
            System.out.println("б)"+y);
        }

        if ( z < x && z < y  ) {
            System.out.println("б)"+z);
        }
        /////////////////////////////////////////

        scanner.close();

    }
}