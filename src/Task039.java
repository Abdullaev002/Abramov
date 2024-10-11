import java.util.Scanner;

public class Task039 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        Екі нақты сан берілген. Алдымен басып шығарыңыз
//        егер ол екіншіден үлкен болса, сан, ал егер ол болса, екеуі де
//        олай емес.

        double a = scanner.nextDouble();

        double b = scanner.nextDouble();

        if ( a > b ) {

            System.out.println(a);

        } else  {
            System.out.println(b);
        }

        scanner.close();
    }
}
