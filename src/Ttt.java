import java.util.Scanner;

public class Ttt{

    public static void main(String []args){

        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();

        double A;

        A = a * a * Math.sqrt(3) / 4;

        System.out.println(A);

        scanner.close();


    }
}