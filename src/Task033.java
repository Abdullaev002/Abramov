import java.util.Scanner;

public class Task033 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        /////////////////////////////////////////

        double x = scanner.nextDouble();

        double y = scanner.nextDouble();
//
 //a)
        if( x > y  ) {

            System.out.println("a) "+x);
        }
        if ( y > x ) {

            System.out.println("a) "+y);
        }


//  b)
        if( x < y  ) {

            System.out.println("б) "+x);
        }
        if ( y < x ) {

            System.out.println("б) "+y);
        }


        /////////////////////////////////////////

        scanner.close();

    }
}