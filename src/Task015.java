import java.util.Scanner;

public class Task015 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
//        Екінші катетті табу формула:
//        b =  Math.sqrt(c * c - a * a);

//        Іштей сызылған шеңбердің радиусын табу:
//          r = (a + b - c) / 2;

        Double a = scanner.nextDouble();

        Double c = scanner.nextDouble();

        double b;

        b =  Math.sqrt(c * c - a * a);

        double r;

        r = (a + b - c) / 2;

        System.out.println(b);

        System.out.println(r);

        scanner.close();
    }
}
//    Тікбұрышты үшбұрышта гипотенуза мен бір катет берілген болса,
//    ішіне сызылған шеңбердің радиусын және екінші катетті табу
//    үшін келесі қадамдар мен формулаларды қолданамыз.
