import java.util.Scanner;

public class Task013 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double L = scanner.nextDouble();

        double g;
//        Ауырлық күші(g = 9.81 m/c)
        g = 9.81;

        double T;
//        Тербеліс периодын есептеу формуласы
        T = 2 * Math.PI * Math.sqrt(L/g);

        System.out.println(T);

        scanner.close();

    }

}
