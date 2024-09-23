import java.io.*;
import java.util.*;

public class Task001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double a = scanner.nextDouble();
        Double b = scanner.nextDouble();

        System.out.println("a+b="+(a+b));
        System.out.println("a-b="+(a-b));
        System.out.println("b-a="+(b-a));
        System.out.println("a*b="+a*b);

        scanner.close();
    }
}
