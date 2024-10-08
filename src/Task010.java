import java.util.Scanner;

public class Task010 {

    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        double h = scanner.nextDouble();

        double g = scanner.nextDouble();

        double T;

        T = Math.sqrt(2 * h / g);

        System.out.println(T);

        scanner.close();
    }
}
