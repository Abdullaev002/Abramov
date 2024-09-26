import java.util.Scanner;


public class Task004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Math.sqrt() Тубір асты шығатын нәрсе

        //////////////////////////////////////////////////////

        double a = scanner.nextDouble();

        double b = scanner.nextDouble();

        System.out.println((a+b)/2);


        System.out.println(Math.sqrt(a*b));

        //////////////////////////////////////////////////////

        scanner.close();
    }
}





