import java.io.*;
import java.util.*;



    public class Task003 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            double a = scanner.nextDouble();

            double V = a * a * a;

            double S = 4 * a* a * a;

            System.out.println("V=" + S);

            scanner.close();


        }
    }