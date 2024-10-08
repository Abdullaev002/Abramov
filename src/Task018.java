import java.util.Scanner;

public class Task018 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();

        double B = scanner.nextDouble();

        double C = scanner.nextDouble();

        double R = scanner.nextDouble();

        // Қабырғаларды синустар теоремасы арқылы есептеу

        double a = 2 * R * Math.sin(A);

        double b = 2 * R * Math.sin(B);

        double c = 2 * R * Math.sin(C);


        System.out.println(a);

        System.out.println(b);

        System.out.println(c);


        scanner.close();
    }
}