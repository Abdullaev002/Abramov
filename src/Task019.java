import java.util.Scanner;

public class Task019 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();

        double b = scanner.nextDouble();

        double c = scanner.nextDouble();

        double T ;

        T = - b + Math.sqrt(b*b-4*a*c)/2*c;

        System.out.println(T);

        scanner.close();

    }
}
/////////////////////////////////////////////////////////////
//    Екеуінің қай уақытта кездесетінін анықтаңыз
//        денелер бір-біріне қарай бірқалыпты қозғалады
//        егер олардың бастапқы жылдамдықтары, үдеулері және
//        олардың арасындағы бастапқы қашықтық белгілі болса.
/////////////////////////////////////////////////////////////