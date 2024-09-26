import java.util.Scanner;

public class Task001 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //////////////////////////////////////////////////////

        double  a = scanner.nextDouble();

        double b = scanner.nextDouble();

        System.out.println("a+b="+(a+b));
        System.out.println("a-b="+(a-b));
        System.out.println("b-a="+(b-a));
        System.out.println("a*b="+(a*b));

        //////////////////////////////////////////////////////

        scanner.close();
    }
}






