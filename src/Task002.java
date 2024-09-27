import java.io.*;
import java.util.*;

public class Task002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//
//        Double x = scanner.nextDouble();
//        Double y = scanner.nextDouble();
//
//
//        Double a = x-y;
//
//        Double b=x*y;
//
//        Double c=1+b;
//
//        System.out.println("="+(a/c));

                //////////////////////////////////////////////////////

                double x = scanner.nextDouble();

                double y = scanner.nextDouble();

                System.out.println((x- y)  / (1 +(x * y)));

                //////////////////////////////////////////////////////

                scanner.close();

    }
}
