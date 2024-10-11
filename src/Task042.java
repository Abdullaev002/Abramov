import java.util.Scanner;

public class Task042 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        x, y нақты сандары берілген. Аздау
//        осы екі санды қосындының жартысына ауыстырыңыз, ал үлкенін -
//        олардың қос өнімі

        double a = scanner.nextDouble(); ;

        double b = scanner.nextDouble();

        a = (a + b) / 2;

        b = 2 * ( a * b );

        System.out.println(a);

        System.out.println(b);

       scanner.close();
    }
}

