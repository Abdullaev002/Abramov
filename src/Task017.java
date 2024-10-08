import java.util.Scanner;

public class Task017 {

    public static void  main(String[]args){

        Scanner scanner = new Scanner (System.in);

        Double r1 = scanner.nextDouble();

        Double r2 = scanner.nextDouble();



        double A;
//        Math.PI = 3.1415

        A = Math.PI *r1*r1-Math.PI*r2*r2;

        System.out.println(A);

        scanner.close();

    }
}



